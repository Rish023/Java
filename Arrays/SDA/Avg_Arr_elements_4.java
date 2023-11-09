import java.util.Scanner;

public class Avg_Arr_elements_4 {
    int a[] = new int[5];
    int i,j,avg=0,sum=0;

    void input(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter elements in a SDA.");
       for(i=0;i<5;i++){
        a[i] = sc.nextInt();
       }
    }

    void avg(){
       for(i=0;i<5;i++){
        sum = sum + a[i];
       }
       avg = sum / 5;
       System.out.println("AVG = "+avg);
    }

    public static void main(String[] args) {
        Avg_Arr_elements_4 ob = new Avg_Arr_elements_4();
        ob.input();
        ob.avg();
    }
}
