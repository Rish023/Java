import java.util.Scanner;

public class Avg_arr {
    int a[][] = new int[5][5];
    int avg,s=0,i,j;

    void input(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter elements in a double dimensional array :");
     for(i=0;i<5;i++){
        for(j=0;j<5;j++){
            a[i][j] = sc.nextInt();
        }
    }
}
    void avg(){
     for(i=0;i<5;i++){
        for(j=0;j<5;j++){
            s = s + a[i][j];
            
        }
     }
     avg = s/25;
     System.out.println("The average of elements in a double array. "+avg+" Sum = "+s);
    }

    public static void main(String[]args){
        Avg_arr Obj = new Avg_arr();
        Obj.input();
        Obj.avg();
    }
}
