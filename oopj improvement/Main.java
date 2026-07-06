package oopj improvement;

import java.util.Scanner;

class Rectangle {

    double length, breadth;
    double perimeter, area;

    void read() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
    }

    void calculate() {

        perimeter = 2 * (length + breadth);
        area = length * breadth;
    }

    void display() {

        System.out.println("The area = " + area);
        System.out.println("The perimeter = " + perimeter);
    }
}

public class Main {

    public static void main(String[] args) {

        Rectangle r = new Rectangle();

        r.read();
        r.calculate();
        r.display();
    }
}
