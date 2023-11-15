package SDA;

import java.util.Scanner;

public class NegativePositiveDisplay {
    int a[] = new int[10];
    int i, p = 0, n = 0;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 elements in array including positive and negative:");
        for (i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
    }

    void sort() {
        System.out.println("Negative numbers:");
        for (i = 0; i < 10; i++) {
            if (a[i] < 0)
                System.out.print(a[i] + " ");
        }

        System.out.println("\nPositive numbers:");
        for (i = 0; i < 10; i++) {
            if (a[i] > 0)
                System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        NegativePositiveDisplay ob = new NegativePositiveDisplay();
        ob.input();
        ob.sort();
    }
}
