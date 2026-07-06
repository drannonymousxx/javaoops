package oopj improvement;

import java.util.Scanner;

class Rectangle {

    double length;
    double breadth;

    // Default Constructor
    Rectangle() {
        length = 0;
        breadth = 0;
    }

    // Parameterized Constructor
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }
}

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Using Default Constructor
        Rectangle r1 = new Rectangle();

        System.out.println("Area using Default Constructor = " + r1.area());

        // User Input
        System.out.print("Enter Length: ");
        double l = sc.nextDouble();

        System.out.print("Enter Breadth: ");
        double b = sc.nextDouble();

        // Using Parameterized Constructor
        Rectangle r2 = new Rectangle(l, b);

        System.out.println("Area using Parameterized Constructor = " + r2.area());

        sc.close();
    }
}
