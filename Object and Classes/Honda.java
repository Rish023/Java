import java.util.Scanner;
import java.util.Scanner;

public class Honda
{
    private int type;
    private int cost;
    private double newCost;

    public void gettype() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter type: ");
        type = in.nextInt();
        System.out.print("Enter cost: ");
        cost = in.nextInt();
    }

    public void find() {
        switch (type) {
            case 2:
                newCost = cost + (cost * 0.1);
                break;

            case 4:
                newCost = cost + (cost * 0.12);
                break;

            default:
                System.out.println("Incorrect type");
                break;
        }
    }

    public void printcost() {
        System.out.println("Type: " + type);
        System.out.println("New cost: " + newCost);
    }

    public static void main(String args[]) {
        Honda obj = new Honda();
        obj.gettype();
        obj.find();
        obj.printcost();
    }
}