import java.util.Scanner;

class Right_Bottom_Diagnol {
    int a[][] = new int[5][5];
    int i,j,x=4;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5x5 matrix array elements :");
        for(i=0;i<4;i++){ 
            for(j=0;j<4;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    void space(){
        for(i=1;i<5;i++){ 
            for(j=5;j<=x;j--){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
        x--;
    }
    }
    public static void main(String[]args){
        Right_Bottom_Diagnol ob = new Right_Bottom_Diagnol();
        ob.input();
        ob.space();
    }
}
