import java.util.Scanner;

public class Caseconvert
{
    private String str;
    private String convStr;

    public void getstr() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        str = in.nextLine();
    }

    public void convert() {
        char arr[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))
                arr[i] = Character.toLowerCase(str.charAt(i));
            else if (Character.isLowerCase(str.charAt(i)))
                arr[i] = Character.toUpperCase(str.charAt(i));
            else
                arr[i] = str.charAt(i);
        }
        convStr = new String(arr);
    }

    public void display() {
        System.out.println("Converted String:");
        System.out.println(convStr);
    }

    public static void main(String args[]) {
        Caseconvert obj = new Caseconvert();
        obj.getstr();
        obj.convert();
        obj.display();
    }
}