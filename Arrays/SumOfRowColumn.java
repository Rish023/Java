import java.util.Scanner;

class SumOfRowColumn {
    int a[][] = new int[4][4];
    int i, j;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of 4x4 matrix array:");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    void sumation() {
        for (i = 0; i < 4; i++) {
            int rs = 0;
            int cs = 0;
            for (j = 0; j < 4; j++) {
                rs += a[i][j];
                cs += a[j][i];
            }
            System.out.println("The sum of " + (i + 1) + " row = " + rs);
            System.out.println("The sum of " + (i + 1) + " column = " + cs);
        }
    }

    public static void main(String[] args) {
        SumOfRowColumn ob = new SumOfRowColumn();
        ob.input();
        ob.sumation();
    }
}
