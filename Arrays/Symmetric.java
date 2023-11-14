import java.util.Scanner;

//Example of Symmetric Matrix
// 1 2 3 4 5
// 2 3 4 5 6
// 3 4 5 6 7
// 4 5 6 7 8
// 5 6 7 8 9

public class Symmetric {
    int a[][] = new int[5][5];
    int i,j;
    boolean f=false;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5x5 matrix array elements :");
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The elements you have entered :");
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    void symmetric(){
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                if(a[i]==a[j])
                f=true;
                break;
              }
         }

           if(f==true)
           System.out.println("It is a symmetric matrix.");
           else
           System.out.println("It is not a symmetric matrix.");
    }
     
       
       public static void main(String[] args){
       Symmetric ob = new Symmetric();
       ob.input();
       ob.symmetric();
}
}
