import java.util.*;
/*Actual Output should be like this
 * 1 2 3 4
 * 5 6 7 8
 * 9 10 11 12 
 * 13 14 15 16
 * 
 * But the output is
 *  * 13 14 15 16
 * 5 6 7 8
 * 9 10 11 12 
 * 13 14 15 16
 */
class  UpperRowSwapToLowerRowandViceVersa1{
    int a[][] = new int[4][4];
    int i, j, t = 0;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of 4x4 array matrix :");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    void inter_change() {
       /* System.out.println("The elements of the first row and the last row after swapping:");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                t = a[0][j];
                a[0][j] = a[3][j];
                a[3][j] = t;
            }
        }*/

        // Print the matrix after swapping
       
            for (j = 0; j < 4; j++) {
                  t = a[0][j];
                a[0][j] = a[3][j];
                a[3][j] = t;
              
            }
             for (i = 0; i < 4; i++) {

    
          
                for(j=0;j<4;j++){
                     System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
        }


    public static void main(String[] args) {
        UpperRowSwapToLowerRowandViceVersa1 ob = new UpperRowSwapToLowerRowandViceVersa1();
        ob.input();
        ob.inter_change();
    }
}
