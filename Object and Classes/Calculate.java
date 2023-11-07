import java.util.Scanner;
public class Calculate {
    int a,b,c,d;
    void inputdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers :");
        a = sc.nextInt();
        b = sc.nextInt();
    }
    void calculate(){
       c = a+b;
       d = a-b;
    }
    void outputdata()
    {
        System.out.println("The sum of a and b = "+(a+b));
        System.out.println("The difference of a and b = "+(a-b));
    }

    public static void main(String[] args) {
        Calculate ob = new Calculate();
        ob.inputdata();
        ob.calculate();
        ob.outputdata();
    }
}


