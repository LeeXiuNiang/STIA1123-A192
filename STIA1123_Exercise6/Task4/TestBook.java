import java.util.Scanner;

public class TestBook {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        int n=0;
        String title, mostExpensiveBook="";
        double price,highestPrice=0;

        System.out.print("Number of books: ");
        n = input.nextInt();
        Book [] myLibrary = new Book[n];

        for (int i=0;i<n;i++){
            input.nextLine();
            System.out.print("Title: ");
            title = input.nextLine();
            System.out.print("Price: ");
            price = input.nextDouble();

            myLibrary[i] = new Book(title,price);

            if (myLibrary[i].getPrice()>highestPrice){
                highestPrice = myLibrary[i].getPrice();
                mostExpensiveBook = myLibrary[i].getTitle();
            }
        }
        System.out.printf("\"%s%s%.2f\n", mostExpensiveBook , "\" has the highest price with RM " , highestPrice);

        System.out.println("Books that contain the term “Java” in their title:");
        for(int j=0;j<n;j++){
            if(myLibrary[j].getTitle().indexOf("Java")!=-1)
                System.out.println(myLibrary[j].getTitle());
        }

    }
}

class Book {
    private String title;      //book’s title
    private double price;      //book’s price

    public Book(String t, double p) {
        title = t;
        price = p;
    }
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
