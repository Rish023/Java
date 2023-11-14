import java.util.Scanner;

public class CityStdCodeMatrix {
    String cities[] = new String[8]; String c="";
    int s[] = new int[8];
    int i,j,f=0,c1=0;
    
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 8 cities name :");
        for(i=0;i<8;i++){
            cities[i] = sc.nextLine();
        }
        
        System.out.println("Enter 8 cities code number :");
        for(j=0;j<8;j++){
            s[j] = sc.nextInt();
        }
    }

    void search(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the city name to be search in a string array :");
        c = sc.nextLine();
        for(i=0;i<8;i++){
           if(c.equals(cities[i]))
            f=1;
            c1++;
            break;
        }
        if(f==1)
        System.out.println(c+" "+c1);
        else
        System.out.println("Not Found");
    }

    public static void main(String[] args){
        CityStdCodeMatrix ob = new CityStdCodeMatrix();
        ob.input();
        ob.search();
    }
}
