import java.util.Scanner;

public class DG{
    int a[][] = new int[5][5];
    int i,j,x=4;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 5x5 matrix array elements :");
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                a[i][j] = sc.nextInt();
            }
        }
    }

    void process(){
       for(i=0;i<5;i++){
        for(j=0;j<x;j++){
            System.out.print(a[i][j]+" ");
        }
        x--;
        System.out.println();
        
       }
    }

    public static void main(String[] args){
        DG ob = new DG();
        ob.input();
        ob.process();
    }
 }