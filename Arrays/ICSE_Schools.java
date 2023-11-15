import java.util.Scanner;

public class ICSE_Schools {
    String s[] = new String[10];
    long t[] = new long[20];
    int a,t1=0,i,j;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of 20 ICSE Schools :");
        for(i=0;i<20;i++){
            s[i] = sc.nextLine();
        }

        System.out.println("Enter the telephone number of 20 ICSE Schools :");
        for(i=0;i<20;i++){
            t[i] = sc.nextLong();
        }
    }

    void sort(){
        for(i=0;i<20;i++){
            for(j=0;j<20-i;j++){
                if(s[j].compareTo([j+1]))
                {
                    
                }
            }
        }
    }
}
