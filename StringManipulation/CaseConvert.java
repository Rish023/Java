import java.util.Scanner;

public class CaseConvert{
    String str,st1="",st2="";
    int len,i;
    char m,n;
    
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        str = sc.nextLine();
        len = str.length();
    }
    
    void convert(){
        for(i=0;i<len;i++){
            m = str.charAt(i);
            if(m>='a' && m<='z'){
            n = Character.toUpperCase(m);
            st1 = st1 + n;
            }
            else if(m>='A' && m<='Z'){
            n = Character.toLowerCase(m);
            st1 = st1 + n;
            }
            else
            st1 = st1 + m;
        }
        System.out.println("The input string after converting its case ");
        System.out.println(st1);
    }

    public static void main(String[]args){
        CaseConvert Obj = new CaseConvert();
        Obj.input();
        Obj.convert();
    }
}