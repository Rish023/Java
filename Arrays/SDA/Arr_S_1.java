package SDA;

import java.util.Scanner;

class Arr_S_1 {
    int a[] = new int[10];

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 elements in an array :");
        for(int i = 0; i < 10; i++){
            a[i] = sc.nextInt();
        }
    }

    void sum(){
        int s = 0;
        for(int i = 0; i < 10; i++){
            s = s + a[i];
        }
        display(s);
    }

    void display(int result){
        System.out.println("Sum of the elements in the array: " + result);
    }

    public static void main(String[] args){
        Arr_S_1 ob = new Arr_S_1();
        ob.input();
        ob.sum();
    }
}
