import java.util.Scanner;

public class Smallest_ar {
    double s[] = new double[5];
    int i;
   double min;
    void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of an array :");
        for(i=0;i<5;i++){
            s[i] = sc.nextInt();
        }
              min = s[0];
    }

    void Smallest(){
  
      for(i=0;i<5;i++){
        if(s[i]<min)
        min = s[i];
      }
    }

    void Display(){
        System.out.println("Smallest = "+min);
    }

    public static void main(String[]args){
        Smallest_ar Obj = new Smallest_ar();
        Obj.Input();
        Obj.Smallest();
        Obj.Display();
    }
}
