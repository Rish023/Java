import java.util.Scanner;

class RowShifting {
    int a[][] = new int[4][4];
    int i, j, f = 0;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4x4 matrix of an array:");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    void shifting() {
        for (i = 0; i < 4; i++) {
            f = a[i][0];
            a[i][0] = a[i][1];
            a[i][1] = a[i][2];
            a[i][2] = a[i][3];
            a[i][3] = f;
        }
        
        System.out.println("The 4x4 matrix after shifting rows:");

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RowShifting ob = new RowShifting();
        ob.input();
        ob.shifting();
    }
}
