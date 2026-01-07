import java.util.Scanner;

// 2D Class
class TwoD {
    double length;
    double breadth;

    // Method to read dimensions
    void input2D() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length (in feet): ");
        length = sc.nextDouble();
        System.out.print("Enter breadth (in feet): ");
        breadth = sc.nextDouble();
    }

    // Method to calculate cost of sheet
    void calculateSheetCost() {
        double area = length * breadth;
        double cost = area * 40;
        System.out.println("Area of sheet: " + area + " sq.ft");
        System.out.println("Cost of plastic sheet: Rs " + cost);
    }
}

// 3D Class inheriting from 2D
class ThreeD extends TwoD {
    double height;

    // Method to read dimensions
    void input3D() {
        Scanner sc = new Scanner(System.in);
        input2D();  // call 2D input
        System.out.print("Enter height (in feet): ");
        height = sc.nextDouble();
    }

    // Method to calculate cost of box
    void calculateBoxCost() {
        double volume = length * breadth * height;
        double cost = volume * 60;
        System.out.println("Volume of box: " + volume + " cu.ft");
        System.out.println("Cost of plastic box: Rs " + cost);
    }
}

// Main Class
public class PlasticCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Plastic Sheet (2D)");
        System.out.println("2. Plastic Box (3D)");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            TwoD sheet = new TwoD();
            sheet.input2D();
            sheet.calculateSheetCost();
        } 
        else if (choice == 2) {
            ThreeD box = new ThreeD();
            box.input3D();
            box.calculateBoxCost();
        } 
        else {
            System.out.println("Invalid choice");
        }
    }
}
