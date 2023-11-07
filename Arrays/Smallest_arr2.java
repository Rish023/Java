import java.util.Scanner;

public class Smallest_arr2 {
    double a[] = new double[5];
    double min;
    int i;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of an array :");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextDouble();
        }
        min = a[2];
    }

    void sm(){
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min)
            min = a[i];
        }
    }

    void Display(){
        System.out.println("The smallest element of an array is "+min);
    }
    
    public static void main(String[]args){
        Smallest_arr2 Obj =  new Smallest_arr2();
        Obj.input();
        Obj.sm();
        Obj.Display();
    }
}
