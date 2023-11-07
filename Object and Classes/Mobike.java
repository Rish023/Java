import java.util.Scanner;
public class Mobike {
    int bno;
    int phno;
    String name;
    int days;
    int charge;

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        name = in.nextLine();
        System.out.print("Enter Customer Phone Number: ");
        phno = in.nextInt();
        System.out.print("Enter Bike Number: ");
        bno = in.nextInt();
        System.out.print("Enter Number of Days: ");
        days = in.nextInt();
    }
    void compute() {
        if (days <= 5)
            charge = days * 500;
        else if (days <= 10)
            charge = (5 * 500) + ((days - 5) * 400);
        else
            charge = (5 * 500) + (5 * 400) + ((days - 10) * 200);
    }

    void display() {
        System.out.println("Bike No.\tPhone No.\tName\tNo. of days \tCharge");
        System.out.println(bno + "\t\t" + phno + "\t\t" + name + "\t\t" + days
                + "\t\t" + charge);
    }
    public static void main(String[] args) {
    Mobike ob = new Mobike();
    ob.input();
    ob.compute();
    ob.display();
    }
}
