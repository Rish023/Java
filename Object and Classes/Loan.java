import java.sql.SQLOutput;
import java.util.Scanner;

public class Loan {
    int time;
    double principal;
    double rate;
    double interest;
    double amt;

    void getdate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of principal");
        principal = sc.nextInt();
        System.out.println("Enter the time ");
        time = sc.nextInt();
        System.out.println("Enter the rate of interest ");
        rate = sc.nextDouble();
    }

    void calculate() {
        interest = (principal * time * rate)/100;
        amt = principal + interest;
    }

    void display() {
        System.out.println("The interest on principal amount is " + interest);
        System.out.println("The total amount is " + amt);
    }

    public static void main(String[] args) {
        Loan ob = new Loan();
        ob.getdate();
        ob.calculate();
        ob.display();
    }
}