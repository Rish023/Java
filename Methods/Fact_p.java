import java.util.Scanner;
public class Fact_p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f=1,n,i=1;
        System.out.println("Enter a number :");
        n = sc.nextInt();
        for (i=1;i<=n;i++)
        {
            f = f *i;
        }
        System.out.println("The factorial of "+n+" is "+f);
    }
}
