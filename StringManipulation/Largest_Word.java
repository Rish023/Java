import java.util.Scanner;

public class Largest_Word {
    String str, st1 = "", st2 = "";
    int l1, l2, i, max = 0;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        str = sc.nextLine();
        l1 = str.length();
    }

    void largest() {
        for (i = 0; i < l1; i++) {
            char m = str.charAt(i);
            if (m != ' ') {
                st1 = st1 + m;
            } else {
                l2 = st1.length();
                if (l2 > max) {
                    max = l2;
                    st2 = st1;
                }
                st1 = "";  // Reset st1 for the next word
            }
        }

        l2 = st1.length();  // Check the last word
        if (l2 > max) {
            max = l2;
            st2 = st1;
        }

        System.out.println("The largest word from the sentence: " + st2);
    }

    public static void main(String[] args) {
        Largest_Word obj = new Largest_Word();
        obj.input();
        obj.largest();
    }
}
