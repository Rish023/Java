import java.util.Scanner;
    
class BinarySDASearchEvenOdd{
        Scanner sc = new Scanner(System.in);
        int a[] = new int[20];
        int i,e=0,o=0,n,k=0;
    
        void input(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 20 elements in a single dimensional array :");
            for(i=0;i<20;i++){
                a[i] = sc.nextInt();
            }
        }
    
        void search(){
           System.out.println("Enter any number to check whether it is present in a SDA or not.");
            n  = sc.nextInt();
            for(i=0;i<20;i++){
           if(n==a[i])
           k=1;
           continue;
        }
        if(n%2==0 && n>0)
        System.out.println("Positive Even Number");
        else if(n%2!=0 && n>0)
        System.out.println("Positive Odd Number");
        else if(n%2==0 && n<0)
        System.out.println("Negative Even Number");
        else if(n%2!=0 && n<0)
        System.out.println("Negative Odd Number");
           if(k==1){
            System.out.println("The number you have enter is present in an array.");
           }
            else{
                System.out.println("The number you have enter is not present in an array.");
            }
        }
    
        public static void main(String[] args) {
            BinarySDASearchEvenOdd ob = new BinarySDASearchEvenOdd();
            ob.input();
            ob.search();
        }
    }