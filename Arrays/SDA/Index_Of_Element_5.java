import java.util.Scanner;

public class Index_Of_Element_5 {
    int a[] = new int[5];
    int i,j,index=0;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in an array :");
        for(i=0;i<5;i++){
            a[i] = sc.nextInt();
        }
    }

    void index(){
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter element to check what its index/position :");
        j = sc.nextInt();
        for(i=0;i<5;i++){
            if(j==a[i])
           // break;
            index++;

        }
        System.out.println(index);
    }

    public static void main(String[] args){
        Index_Of_Element_5 ob = new Index_Of_Element_5();
        ob.input();
        ob.index();
    }
}
