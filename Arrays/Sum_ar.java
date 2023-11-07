import java.util.Scanner;

public class Sum_ar{
    int a[] = new int[5];
    int s=0,i;

    void input(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter elements of an array :");
        for(i=0;i<5;i++){
            a[i] = sc.nextInt();
        }
    }
        void Sum(){
            for(i=0;i<5;i++){
               s=s+a[i];
            }
            System.out.println(s);
        }

        public static void main(String[]args){
            Sum_ar Obj = new Sum_ar();
            Obj.input();
            Obj.Sum();
        }
    }
