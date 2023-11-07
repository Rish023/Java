import java.util.*;

 class NegPosOddEven {
    int a[][] = new int[4][4];
    int pe = 0, po = 0, ne = 0, no = 0;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4x4 matrix array values:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    void summation() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (a[i][j] > 0) {
                    if (a[i][j] % 2 == 0) {
                        pe += a[i][j]; // Positive even
                    } else {
                        po += a[i][j]; // Positive odd
                    }
                } else {
                    if (a[i][j] % 2 == 0) {
                        ne += a[i][j]; // Negative even
                    } else {
                        no += a[i][j]; // Negative odd
                    }
                }
            }
        }
    }

    void display() {
        System.out.println("The sum of positive even numbers = " + pe);
        System.out.println("The sum of positive odd numbers = " + po);
        System.out.println("The sum of negative even numbers = " + ne);
        System.out.println("The sum of negative odd numbers = " + no);
    }

    public static void main(String[] args) {
        NegPosOddEven ob = new NegPosOddEven();
        ob.input();
        ob.summation();
        ob.display();
    }
}
