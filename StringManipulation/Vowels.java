import java.util.Scanner;

public class Vowels{
    String str,str1="",str2="";
    int len,i,v=0,c=0,s=0;
    char m;

    void input(){
        Scanner prompt  = new Scanner(System.in);
        System.out.println("Enter a String :");
        str = prompt.nextLine();
        len = str.length();
    }
    
    void vowels(){
        for(i=0;i<len;i++){
            m = str.charAt(i);

            if(m=='a' || m=='e' || m=='i' || m=='o' || m=='u' || m=='A' || m=='E' || m=='I' || m=='O' || m=='U'){
            v = v + 1;
            }
            else if(m==' '){
                s = s + 1;
            }
            else{
                c = c + 1;
            }
        }
        System.out.println("The number of vowels present in a string is "+v+".");
        System.out.println("The number of consonant present in a string is "+c+".");
    }
    
    public static void main(String[]args){
        Vowels Obj = new Vowels();
        Obj.input();
        Obj.vowels();
    }
}