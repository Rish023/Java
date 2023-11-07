import java.util.Scanner;

class Left_Bottom_Diagnol {
    int a[][] = new int[5][5];
    int i,j,x=1;

    void input(){
        Scanner sc = new Scanner(System.in);
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                a[i][j]  = sc.nextInt();
            }
        }
    }

    void space(){
        for(i=1;i<4;i++){
            for(j=0;j<x;j++){
                System.out.print(a[i][j]+" ");
            }
           System.out.println();
           x++;
        }
    }
    public static void main(String[]args){
        Left_Bottom_Diagnol ob = new Left_Bottom_Diagnol();
        ob.input();
        ob.space();
    }
}
