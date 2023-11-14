import java.util.Scanner;

class Smallest_Largest_9{
    int a[] = new int[5];
    int temp=0;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements :");
        for(int i=0;i<5;i++){
            
                 a[i] = sc.nextInt();
            
        }
    }

    void calc(){
        for(int i=0;i<5;i++){
        for(int j=i+1;j<5;j++){
             if(a[i]>a[j]){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
             }
        }
    }
    System.out.println("The second largest element in java "+a[1]);
    for(int i=0;i<5;i++){
    System.out.println(a[i]);
    }
    }

    public static void main(String[] args){
        Smallest_Largest_9 ob = new Smallest_Largest_9();
        ob.input();
        ob.calc();
        }
    }