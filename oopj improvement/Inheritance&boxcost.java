package oopj improvement;

import java.util.Scanner;

class Sheet2D {

    double length;
    double breadth;

    void read2D(Scanner sc) {

        System.out.print("Enter Length: ");
        length = sc.nextDouble();

        System.out.print("Enter Breadth: ");
        breadth = sc.nextDouble();
    }

    double calculateCost() {

        double area = length * breadth;

        return area * 40;
    }
}

class Box3D extends Sheet2D {

    double height;

    void read3D(Scanner sc) {

        read2D(sc);

        System.out.print("Enter Height: ");
        height = sc.nextDouble();
    }

    double calculateBoxCost() {

        double volume = length * breadth * height;

        return volume * 60;
    }
}

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Sheet2D sheet = new Sheet2D();

        System.out.println("2D Sheet");

        sheet.read2D(sc);

        System.out.println("Cost of Sheet = Rs " +
                sheet.calculateCost());

        Box3D box = new Box3D();

        System.out.println("\n3D Box");

        box.read3D(sc);

        System.out.println("Cost of Box = Rs " +
                box.calculateBoxCost());

        sc.close();
    }
}