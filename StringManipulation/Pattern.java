import java.util.Scanner;

public class Pattern{
String str;
int len,i;
char m;

void Input(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String");
    str = sc.nextLine();
    len = str.length();
}

void Display(){
    for(i=0;i<len;i++){
        m = str.charAt(i);
        System.out.println(m);
    }
}

public static void main(String[]args){
    Pattern Obj = new Pattern();
    Obj.Input();
    Obj.Display();
}
}