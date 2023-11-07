import java.util.Scanner;

public class SS {
    int a[] = new int[5];
    int i, j, d = 0;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements in an array :");
        for (i = 0; i < 5; i++) {  // Corrected loop limit to 5
            a[i] = sc.nextInt();
        }
    }

    void s() {
        for (i = 0; i < 5; i++) {  // Corrected loop limit to 5
            for (j = i + 1; j < 5; j++) {  // Start j from i+1 to avoid unnecessary comparisons
                if (a[i] > a[j]) {
                    d = a[i];
                    a[i] = a[j];
                    a[j] = d;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (i = 0; i < 5; i++) {  // Corrected loop limit to 5
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        SS obj = new SS();
        obj.input();
        obj.s();
    }
}
