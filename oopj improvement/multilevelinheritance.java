package oopj improvement;

import java.util.Scanner;

class Plate {

    double length;
    double width;

    Plate(double l, double w) {

        length = l;
        width = w;

        System.out.println("Plate Constructor Executed");
    }
}

class Box extends Plate {

    double height;

    Box(double l, double w, double h) {

        super(l, w);

        height = h;

        System.out.println("Box Constructor Executed");
    }
}

class WoodBox extends Box {

    double thick;

    WoodBox(double l, double w, double h, double t) {

        super(l, w, h);

        thick = t;

        System.out.println("WoodBox Constructor Executed");
    }

    void display() {

        System.out.println("\nLength = " + length);
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Thickness = " + thick);
    }
}

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        double l = sc.nextDouble();

        System.out.print("Enter Width: ");
        double w = sc.nextDouble();

        System.out.print("Enter Height: ");
        double h = sc.nextDouble();

        System.out.print("Enter Thickness: ");
        double t = sc.nextDouble();

        WoodBox wb = new WoodBox(l, w, h, t);

        wb.display();

        sc.close();
    }
}
