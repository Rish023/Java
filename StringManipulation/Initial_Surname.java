import java.util.Scanner;

public class Initial_Surname{
    String str,sn,st1="",st2="";
    int len,i,p;
    char m;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        str = sc.nextLine();
        len = str.length();
    }

    void extract(){
        str = " "+str;
        p = str.lastIndexOf(' ');
        sn = str.substring(p);
        for(i=0;i<len;i++){
            m = str.charAt(i);
            if(m==' ')
            st1 = st1 + str.charAt(i+1)+'.';
        }
        st2 = st1 + sn;
        System.out.println("Initials with surname");
        System.out.println("st2");
    }
    public static void main(String[]args){
    Initial_Surname Tri = new Initial_Surname();
    Tri.input();
    Tri.extract();
    }
}