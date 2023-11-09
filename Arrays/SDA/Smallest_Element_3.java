import java.util.Scanner;

public class Smallest_Element_3 {
int a[] = new int[5];
    int i,j,mmin=0;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements for SDA :");
        for(i=0;i<5;i++){
            a[i] = sc.nextInt();
        }
    }

    void process(){
        for(i=0;i<5;i++){
            if(a[i]<a[0])
            mmin = a[i];
        }
        System.out.println("The smallest element of an array is "+mmin);
    }

    public static void main(String[]args){
        Smallest_Element_3 ob = new Smallest_Element_3();
        ob.input();
        ob.process();
    }
}
