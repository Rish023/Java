import java.util.Scanner;

public class Diagnol {
   int a[][] = new int[5][5];
   int i,j,x=3;

   void input(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of 5x5 matrix array :");
    for(i=0;i<5;i++){ 
        for(j=0;j<5;j++){
          a[i][j] = sc.nextInt();
        }
    }
   }

   void diagnol(){
    for(i=0;i<4;i++){
        for(j=0;j<x;j++){
            System.out.print(a[i][j]+" ");
        }
           System.out.println();
    }
 x--;
   }
   public static void main(String[]args){
    Diagnol ob = new Diagnol();
    ob.input();
    ob.diagnol();
   }
}
output:
/*
 *1 2 3 
 *1 2 3
 *1 2 3 
 *1 2 3
 *1 2 3
 */