import java.util.Scanner;

public class BS {
    int a[] = new int[5];
    int i, j, t = 0;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of an array :");
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
    }

    void s() {
        // Fixed the loop to j < 4 to avoid going out of array bounds
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4 - i; j++) {
                // Fixed the comparison to a[j] > a[j+1]
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }

        // Moved print statement outside the loop
        for (i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        BS Obj = new BS();
        Obj.input();
        Obj.s();
    }
}
