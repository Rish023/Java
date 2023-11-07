import java.util.Scanner;

public class St_Palindrome{
    String str,str1="",str2="";
    int i,len;
    char m;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        str = sc.nextLine();
        len = str.length();
    }

    void Reversing(){
        for(i=len-1;i>=0;i--){
            m = str.charAt(i);
            str1 = str1 + m;
        }
         if(str.equals(str1)){
                System.out.println(str+" is a palindrome.");
            }
            else{
                System.out.println(str+" is not a palindrome.");
            }
    }
    
    public static void main(String[]args){
         St_Palindrome Obj = new St_Palindrome();
         Obj.input();
         Obj.Reversing();
    }
}