package SDA;


import java.util.Scanner;

public class Even_Odd {
    int a[] = new int[20];
    int i,j,es=0,os=0;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 20 elements in an array incluing positive and negative :");
        for(i=0;i<20;i++){
            a[i] = sc.nextInt();
        }
    }

    void odd_Even(){
        for(i=0;i<20;i++){
            if(a[i]%2==0)
            es = es + a[i];
            
            else if(a[i]%2!=0)
            os = os + a[i];
        }
    }

    void display(){
        System.out.println("The sum of even numbers in an array "+es);
        System.out.println("The sum of odd numbers in an array "+os);
    }

    public static void main(String[] args) {
        Even_Odd ob = new Even_Odd();
        ob.input();
        ob.odd_Even();
        ob.display();
    }
}
