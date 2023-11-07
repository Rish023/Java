import java.util.Scanner;

public class DDA_HighestValueArrayRow {
    int a[][] = new int[4][4];
    int i,j,m=0,n;
    
void input(){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter value of 4x4 matrix array :");
    for(i=0;i<4;i++){
        for(j=0;j<4;j++){
            a[i][j] = sc.nextInt();
        }
    }
}

void highest(){
    for(i=0;i<4;i++){
        for(j=0;j<4;j++){
            if(a[i][j]>m)
            m = a[i][j];
        }
        System.out.println("The highest value of "+i+" row = "+m);
    }
}

public static void main(String[] args){
 DDA_HighestValueArrayRow ob = new DDA_HighestValueArrayRow();
 ob.input();
 ob.highest();
  }
}