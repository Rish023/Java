import java.sql.SQLOutput;
import java.util.Scanner;
public class Triplet
{
    int a,b,c;
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a,b and c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
    }
    void findprint()
    {
        if(a*a==b*b+c*c || b*b==a*a+c*c || c*c == a*a+b*b )
        {
            System.out.println("Pythgorean Triplet");
        }
        else {
            System.out.println("Not a Pythogorean Triplet");
        }
    }

    public static void main(String[] args) {
        Triplet ob = new Triplet();
        ob.getdata();
        ob.findprint();
    }
}
