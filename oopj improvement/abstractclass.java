package oopj improvement;

import java.util.Scanner;

abstract class Student {

    int rollNo;
    long regNo;

    void getInput() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();

        System.out.print("Enter Registration No: ");
        regNo = sc.nextLong();
    }

    abstract void course();
}

class Kiitian extends Student {

    void course() {

        System.out.println("Course : B.Tech (Computer Science & Engg)");
    }

    void display() {

        System.out.println("Roll No : " + rollNo);
        System.out.println("Registration No : " + regNo);

        course();
    }
}

class Main {

    public static void main(String[] args) {

        Kiitian k = new Kiitian();

        k.getInput();

        System.out.println("\nStudent Details");

        k.display();
    }
}
