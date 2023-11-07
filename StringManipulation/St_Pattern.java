import java.util.Scanner;
public class St_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        String st;
        System.out.println("Enter the word in upper case ");
        st = sc.next();
        st =st.toUpperCase();
        b=st.length();
        System.out.println("The pattern");
        for(a=0;a<b;a++)
        {
            System.out.println(st.charAt(a));
        }
    }
}
