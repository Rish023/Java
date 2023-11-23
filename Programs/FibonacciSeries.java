import java.util.Scanner;

public class FibonacciSeries{
    int n,a=0,b=1,i,c=0;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit to print fibonacii series :");
        n = sc.nextInt();
    }

    void Display(){
        for(i=0;i<n;i++){
         c = a + b;
         a = b;
         b = c;
         System.out.print(c+" ");
        }
    }

    public static void main(String[] args) {
        FibonacciSeries ob = new FibonacciSeries();
        ob.input();
        ob.Display();
    }
}