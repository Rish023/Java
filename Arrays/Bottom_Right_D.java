import java.util.Scanner;

public class Bottom_Right_D {
    int a[][] = new int[5][5];
    int i,j,x=4;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5x5 matrix elements :");
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                a[i][j] = sc.nextInt();    
            }
        }
    }

    void display(){
            for(i=1; i < 4; i++){
                for(j=4; j > x; j--){
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }

    public static void main(String []args){
        Bottom_Right_D ob = new Bottom_Right_D();
        ob.input();
        ob.display();
    }
}
