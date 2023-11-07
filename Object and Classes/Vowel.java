import java.util.Scanner;
public class Vowel {
    String s;
    int c; //To count vowels
    int v = 0;

    void getstr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        s = sc.nextLine();
       // int b = s.length();
    }
    void getvowel(){
        for(int a=0;a<s.length();a++)

        {

            char chr = s.charAt(a);

            if(chr=='a' || chr=='e'||chr=='i'||chr=='o'||chr=='u' ||chr=='A'||chr=='E'||chr=='I'||chr=='O' ||chr=='U')

                v=v+1;
        }
    }
    void display(){
        System.out.println("The  number of vowels is "+v);
    }

    public static void main(String[] args) {
        Vowel OB = new Vowel();
        OB.getstr();
        OB.getvowel();
        OB.display();
    }
}
