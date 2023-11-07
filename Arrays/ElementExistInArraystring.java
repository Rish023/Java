import java.util.Scanner;

public class ElementExistInArraystring {
  String s[] = new String[5];
  String st,st1="";
  int i, n;

  void input(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter elements of an string array :");
    for(i=0;i<5;i++){
    s[i]=sc.nextLine();
    }
    System.out.println("Enter string element to check it exists or not");
     String st=sc.nextLine();
  }

  void display(){
for(i=0;i<5;i++){
    if(s[i].equals(st))
      System.out.println("String Exists");
    else
      System.out.println("String does not exist");
    }
  }

public static void main(String [] args){
  ElementExistInArraystring obj = new ElementExistInArraystring();
  obj.input();
  obj.display();
}
}