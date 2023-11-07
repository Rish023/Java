import java.util.*;

public class DDA_HighestValueArrayColumn {
    int a[][] = new int[4][4];
    int i,j,max=0;
    

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4x4 matrix array value :");
     for(i=0;i<4;i++){
         for(j=0;j<4;j++){
            a[i][j] = sc.nextInt();
         }
        }

    }

    void highest(){
        for(i=0;i<4;i++){ 
            for(j=0;j<4;j++){
            if(a[j][i]>max)
            max = a[j][i];
            }
            System.out.println("The highest value of "+i+" column = "+max);
        }
    }

    public static void main(String[]args){
        DDA_HighestValueArrayColumn ob = new DDA_HighestValueArrayColumn();
        ob.input();
        ob.highest();
    }
}
