import java.util.*;

public class Char_Replace{
    String str;
    int i,len;
    char m;
    void input(){
        Scanner prompt = new Scanner(System.in);
        System.out.println("Enter a string :");
        str = prompt.nextLine();
        len = str.length();
    }

    void replace(){
        for(i=0;i<len;i++){
            m = str.charAt(i);
            {
            if(m=='e')
            m = '*';
            }
            System.out.print(m);
        }
        System.out.println();
    }
    
    public static void main(String[]args){
    Char_Replace Obj = new Char_Replace();
    Obj.input();
    Obj.replace();
    }
}