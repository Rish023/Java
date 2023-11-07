import java.util.Scanner;

public class Interest {
    int p,r,t;
    double interest;
    double amt;

void input(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the principal, rate and time :");
    p = sc.nextInt();
    r = sc.nextInt();
    t = sc.nextInt();
}
void cal(){
    interest = (p*r*t)/100.0;
    amt = p + interest;
}

void display(){
System.out.println("Principle : "+p);
    System.out.println("Interest : "+interest);
    System.out.println("Amount : "+amt);
}
    public static void main(String[] args) {
     Interest ob = new Interest();
     ob.input();
     ob.cal();
     ob.display();
}
}