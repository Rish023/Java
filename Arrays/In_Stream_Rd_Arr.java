import java.util.Scanner;
import java.io.*;
public class In_Stream_Rd_Arr
{
    public static void main(String[]args) throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int i,sum=0;
        int m[] = new int[10];
        for (i = 0; i < 10; i++){
            System.out.println("Enter the marks of the students :"+i);
                m[i] = Integer.parseInt(in.readLine());
        }
        for(i=0;i<10;i++){
            sum = sum+m[i];
           // System.out.println("The sum of the array elements = "+sum);
        }
        System.out.println("The sum of the array elements = "+sum);
    }
}