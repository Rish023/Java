import java.util.Scanner;

public class Row_Shifting {
    
        int[][] matrix = new int[4][4];

        void input(){
        Scanner sc = new Scanner(System.in);
        // Input values into the 4x4 matrix
        System.out.println("Enter 4x4 matrix values:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        }
    void perform(){

        // Perform cyclic row shifting
        int[] temp = matrix[0]; // Store the first row in a temporary array
        for (int i = 0; i < 3; i++) {
            matrix[i] = matrix[i + 1]; // Shift each row up by one
        }
        matrix[3] = temp; // Set the last row as the original first row

        // Display the resulting matrix
        System.out.println("Matrix after cyclic row shifting:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

        public static void main(String[] args) {
         Row_Shifting ob = new Row_Shifting();
         ob.input();
         ob.perform();

    }
}
