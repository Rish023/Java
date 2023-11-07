import java.util.Scanner;

class RowShifting {
    int a[][] = new int[4][4];
    int a1[] = new int[4];
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

    void assign(){
        for(i=0;i<4;i++){
            a1[i] = a[3][j];
        }
    }

    void shifting() {
       for(i=0;i<=3;i++){
        for(j=0;j<=3;j++){
            a[i][j] = a1[2-1][];
        }
       }
    }

    public static void main(String[] args) {
        RowShifting ob = new RowShifting();
        ob.input();
        ob.shifting();
    }
}
