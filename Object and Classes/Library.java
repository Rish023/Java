import java.util.Scanner;

public class Library
{
    String name;
    int price;
    int day;
    double fine;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the book :");
        name = sc.nextLine();
        System.out.println("Enter the printed price of the book :");
        price = sc.nextInt();
        System.out.println("Enter the number of days :");
        day = sc.nextInt();
    }

    void cal(){
        if(day<=7){
            fine = 7*0.25;
        }
        else if(day>=8 && day<=15){
            fine = (7*0.25)+((day-7)*0.4);
        }
        else if(day>=16 && day<=30){
            fine = (7*0.25)+(8*0.4)+((day-15)*0.6);
        }
        else if(day>30){
            fine = (7*0.25)+(8*0.4)+(15*0.6)+((day-30)*0.8);
        }
    }
    void display(){
        System.out.println("The name of the book "+name);
        System.out.println("The fine to be paid to the consumer is "+fine);
    }
    public static void main(String[]args)
    {
        Library ob = new Library();
        ob.input();
        ob.cal();
        ob.display();
    }
}
