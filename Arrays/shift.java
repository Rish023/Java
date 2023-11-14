import java.util.Scanner;
public class shift{
    int[][]m=new int[4][4];
    void input()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 4x4 matrix values:");
    for(int i=0;i<4;i++)
    for(int j=0;j<4;j++)
    m[i][j]=s.nextInt();
}

void perform()
    {
        int[]t=m[0];
        for(int i=0;i<3;i++)
        m[i]=m[i+1];
        m[3]=t;
        System.out.println("Matrix after cyclic row shifting:");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            System.out.print(m[i][j]+" ");
            System.out.println();
        }
    }
    public static void main(String[]a)
    {
        Row_Shifting o=new Row_Shifting();
        o.input();
        o.perform();
    }
    }
