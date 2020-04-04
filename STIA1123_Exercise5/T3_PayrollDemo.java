import java.util.Scanner;

public class T3_PayrollDemo {
    public static void main(String[] args){
        Employee e = new Employee();
        e.input();
        Payroll p = new Payroll(e.grossPay,e.stateTax,e.federalTax);
        p.printOutput();
    }
}

class Employee{
    double employeeID, grossPay, stateTax, federalTax;

    public void input(){
        Scanner input = new Scanner(System.in);
        String myFormat1 = "%-30s%-5s";
        System.out.printf("%-30s%-2s", "Enter your employee ID number", ": ");
        employeeID = input.nextDouble();
        System.out.printf(myFormat1, "Enter your Gross Pay", ": RM ");
        grossPay = input.nextDouble();
        System.out.printf(myFormat1, "Enter your State Tax", ": RM ");
        stateTax = input.nextDouble();
        System.out.printf(myFormat1, "Enter your Federal Tax", ": RM");
        federalTax = input.nextDouble();
    }
}
class Payroll{
    private double grossPay, stateTax, federalTax, netPay;

    public Payroll(double grossPay,double stateTax,double federalTax){
        this.grossPay = grossPay;
        this.stateTax = stateTax;
        this.federalTax = federalTax;
    }

    public double calculateNetPay(){
        return netPay = grossPay - stateTax - federalTax;
    }

    public void printOutput(){
        System.out.printf("Net pay is: RM %.2f", calculateNetPay());
    }
}
