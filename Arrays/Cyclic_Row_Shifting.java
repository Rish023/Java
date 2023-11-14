import java.util.Scanner;

class Cyclic_Row_Shifting {
    int a[][] = new int[4][4];
    int temp[];
    int i, j, t = 0;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4x4 elements in an array :");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    void swap() {
        temp = a[0]; // Use clone to avoid reference issues
        for (i = 0; i < 3; i++) {
            a[i] = a[i + 1].clone();
        }
        a[3] = temp;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Cyclic_Row_Shifting ob = new Cyclic_Row_Shifting();
        ob.input();
        ob.swap();
    }
}
