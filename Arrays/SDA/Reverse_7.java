import java.util.Scanner;

public class Reverse_7 {
    int a[] = new int[5];
    int i,j,f=0;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in a SDA :");
        for(i=0;i<5;i++){
            a[i] = sc.nextInt();
        }
    }

    void reverse(){
        for(i=4;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        Reverse_7 ob = new Reverse_7();
        ob.input();
        ob.reverse();
    }
}