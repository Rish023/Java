import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Count_8 {
    int a[] = new int[5];
    int i,j,f=0,even=0,odd=0;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in a SDA :");
        for(i=0;i<5;i++){
            a[i] = sc.nextInt();
        }
    }

    void count(){
     for(i=0;i<5;i++){
            if(a[i]%2==0)
            even=even+a[i];
            else if(a[i]%2!=0)
            odd = odd + a[i];
        }
        System.out.println("The number of even elements "+even+".");
        System.out.println("The number of odd elements "+odd+".");
    }

    public static void main(String[] args) {
        Count_8 ob = new Count_8();
        ob.input();
        ob.count();
    }
}