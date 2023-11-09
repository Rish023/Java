import java.util.Scanner;

class Element_Exist_6 {
    int a[] = new int[5];
    int i, j;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in a SDA.");
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
    }

    void exist() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an element to check if it exists or not.");
        j = sc.nextInt();
        boolean found = false;

        for (i = 0; i < 5; i++) {
            if (a[i] == j) {
                found = true;
                break; // Once found, exit the loop
            }
        }

        if (found==true) {
            System.out.println("Element Exists");
        } else {
            System.out.println("Element Does Not Exist");
        }
    }

    public static void main(String[] args) {
        Element_Exist_6 ob = new Element_Exist_6();
        ob.input();
        ob.exist();
    }
}
