import java.util.Scanner;

public class CaseLengths{
    String str,st1="";
    char m;
    int len,i, uc=0,lc=0,sp=0,d=0;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        str = sc.nextLine();
        len = str.length();
    }

    void count(){
        for(i=0;i<len;i++){
            m = str.charAt(i);
            if(m>='a' && m<='z')
            lc+=1;
            else if(m>='A' && m<='Z')
            uc += 1;
            else if(m>='0' && m<='9')
            d += 1;
            else 
            sp += 1;
        }
    }

    void display(){
        System.out.println("The total number of uppercase characters in a string is "+uc);
        System.out.println("The total number of lowercase chracters in a string  is "+lc);
        System.out.println("The total number of digits in a string is "+d);
        System.out.println("The total number of special case chracters in a string is "+sp);
        System.out.println("The total length of a given string is "+len);
    }

    public static void main(String[]args){
        CaseLengths Obj = new CaseLengths();
        Obj.input();
        Obj.count();
        Obj.display();
    }
}

//Write a program in java to input a string and count the total number of uppercase,lowercase,special case and digits chracters.
