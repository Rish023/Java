import java.util.Scanner;

public class HotelRoomAllotment {
    /*
     *  1[20] 2[20] 3[20]
     *  4[20] 5[20] 6[20]
     *  7[20] 8[20] 9[20]
     */

     int h[][] = new int[3][3];
     int i,j,input;

     void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nos of rooms in 3x3 array matrix:");
        for(i=0;i<4;i++){ 
            for(j=0;j<4;j++){
               h[i][j] = sc.nextInt();
        }
    }
     }

     void check(){
        
     }
}
