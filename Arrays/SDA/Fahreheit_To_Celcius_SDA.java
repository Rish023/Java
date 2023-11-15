package SDA;
import java.util.Scanner;

public class Fahrenheit_To_Celsius_SDA {
    double f[] = new double[20];
    double c;
    int i;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 20 Temperatures in Fahrenheit:");
        for (i = 0; i < 20; i++) {
            f[i] = sc.nextDouble();
        }
    }

    void convert() {
        for (i = 0; i < 20; i++) {
            c = (f[i] - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + c);
        }
    }

    public static void main(String[] args) {
        Fahrenheit_To_Celsius_SDA ob = new Fahrenheit_To_Celsius_SDA();
        ob.input();
        ob.convert();
    }
}
