import java.util.*;

public class Product {
    int a[][] = new int[4][4];
    int i,j,p=1;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4X4 matrix array value :");
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                a[i][j] = sc.nextInt();
            }
        }
    }

    void product_Of_row(){
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                p = p*a[i][j];
            }
            System.out.println("The product of "+i+" row = "+p);
        }
    }

    void product_Of_column(){
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                p = p * a[j][i];
            }
            System.out.println("The product of "+j+" column = "+p);
        }
    }
    public static void main(String[]args){
     Product ob = new Product();
     ob.input();
     ob.product_Of_row();
     ob.product_Of_column();
      }
    }
