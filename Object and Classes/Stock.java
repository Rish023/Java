import java.util.Scanner;
public class Stock {
    String title;
    String author;
    String pub;
    int noc;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the title of the book :");
        title = sc.nextLine();
        System.out.println("Enter the author name of the book :");
        author = sc.nextLine();
        System.out.println("Enter the publisher name of the book :");
        pub = sc.nextLine();
        System.out.println("Enter the number of copies :");
        noc = sc.nextInt();
    }
   void purchase(int t, String p,int n){

    }
    public static void main(String[] args) {

    }

}
