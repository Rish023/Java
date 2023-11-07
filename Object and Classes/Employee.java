
import java.util.Scanner;
public class Employee {
    int pan;
    String name;
    double taxincome;
    double tax=0;
    void input()
    {
        System.out.println("Enter the details of user - pan, name and taxincome");
        Scanner sc = new Scanner(System.in);
        pan = sc.nextInt();
        name = sc.next();
        taxincome = sc.nextDouble();

    }
    void cal()
    {

        if(taxincome<=25000)
        {
            tax=0;
        }
        else if(taxincome>=250001 && taxincome<=500000)
        {
            tax = (10.0/100.0)*250000;
        }
        else if(taxincome>=500001 && taxincome<=1000000)
        {
            tax = 30000+(20.0/100)*500000;
        }
        else if(taxincome>=1000000)
        {
            tax = 50000 + 30.0/100 * 1000000;
        }
    }

    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Pan : "+pan);
        System.out.println("Taxincome :  "+taxincome);
        System.out.println("Tax : "+tax);
    }
    public static void main(String[] args)
    {
        Employee ob = new Employee();
        ob.input();
        ob.cal();
        ob.display();
    }
}
