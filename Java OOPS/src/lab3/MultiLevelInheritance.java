import java.util.Scanner;

// Base class
class Plate {
    double length, width;

    // Constructor of Plate
    Plate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter width: ");
        width = sc.nextDouble();
    }

    void display() {
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
    }
}

// Derived class
class Box extends Plate {
    double height;

    // Constructor of Box
    Box() {
        super(); // calls Plate constructor
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }

    void display() {
        super.display();
        System.out.println("Height = " + height);
    }
}

// Derived class of Box
class WoodBox extends Box {
    double thickness;

    // Constructor of WoodBox
    WoodBox() {
        super(); // calls Box constructor
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thickness: ");
        thickness = sc.nextDouble();
    }

    void display() {
        super.display();
        System.out.println("Thickness = " + thickness);
    }
}

// Main class
public class MultiLevelInheritance {
    public static void main(String[] args) {
        System.out.println("Enter the dimensions:");
        WoodBox wb = new WoodBox();

        System.out.println("\nDisplaying dimensions:");
        wb.display();
    }
}
