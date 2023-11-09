import java.util.Scanner;

public class Largest_Element_2{
    int a[] = new int[5];
    int i,m=0;

void input(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter elements in an SDA :");
    for(i=0;i<5;i++){
          a[i]=sc.nextInt();
    }
}

void largest(){
    for(i=0;i<5;i++){
        if(a[i]>m)
        m = a[i];
    }
    System.out.print("The highest element in an array is "+m);
}

public static void main(String[] args){
    Largest_Element_2 ob = new Largest_Element_2();
    ob.input();
    ob.largest();
}
}