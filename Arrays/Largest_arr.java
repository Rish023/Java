import java.util.Scanner;

public class Largest_arr {
    int a[] = new int[7];
    int t=0,i,max=0;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of an array :");
        for(i=0;i<7;i++){
            a[i] = sc.nextInt();
        }
    }

    void largest(){
        for(i=0;i<7;i++){
            if(a[i]>max)
            max = a[i];
        }
        System.out.println(
            "The largest number in an array element "+max
        );
    }

    public static void main(String[]args){
        Largest_arr Obj = new Largest_arr();
        Obj.input();
        Obj.largest();
    }
}
