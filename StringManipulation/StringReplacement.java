import java.util.Scanner;

public class StringReplacement{
String str,str1="",str2="";
char a,m,n;
int i,len;

void input(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a String :");
str = sc.nextLine();
len = str.length();
}

void replacing(){
if (str.charAt(0)=='a' &&str.charAt(1)==' ')
{
  str1=str1+"an";
}
else{
  str1=str1+str.charAt(0);
}
for(i=1;i<len-1;i++){
m = str.charAt(i);
n = str.charAt(i+1);
a = str.charAt(i-1);
if((m=='a' && n==' ' && a==' ' )){
str1=str1+"an";
}
else{
str1=str1+m;
  }
 }
if (str.charAt(len-1)=='a' &&str.charAt(len-2)==' ')
{
  str1=str+"an";
}
else{
  str1=str1+str.charAt(len-1);
}
  System.out.println(str1);
}

public static void main(String[]args){
StringReplacement Obj1 = new StringReplacement();
  Obj1.input();
  Obj1.replacing();
}
}