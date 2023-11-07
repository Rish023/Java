import java.util.Scanner;
public class Discount {
    int cost;
    String name;
    double dc;
    double amt;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price of an article :");
        cost = sc.nextInt();
        System.out.println("Enter the name of the customer :");
        name = sc.nextLine();
    }
    void cal()
    {
        if(cost<=5000)
        {
            System.out.println("No discount ");
        }
        else if(cost>=5001 && cost<=10000)
        {
            dc = cost*10/100;
            amt = cost-dc;
        }
        else if(cost>=10001 && cost<=15000)
        {
            dc= cost*15/100;
            amt = cost-dc;
        }
        else if(cost>=15000)
        {
            dc = cost*20/100;
            amt = cost-dc;
        }
    }
    void display()
    {
        System.out.println("Name "+name);
        System.out.println("Cost "+cost);
        System.out.println("Discount "+dc);
        System.out.println("Amount "+amt);
    }
    public static void main(String[]args)
    {
        Discount ob = new Discount();
        ob.input();
        ob.cal();
        ob.display();
    }
}