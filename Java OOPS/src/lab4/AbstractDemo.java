package lab4;

import java.util.Scanner;

abstract class Student {
    protected int rollNo;
    protected long regNo;

    public void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();

        System.out.print("Enter Registration No: ");
        regNo = sc.nextLong();
    }

    public abstract void course();
}

class Kiitian extends Student {

    public void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }

    public void display() {
        System.out.println("Rollno - " + rollNo);
        System.out.println("Registration no - " + regNo);
        course();
    }
}
public class AbstractDemo {
    public static void main(String[] args) {

        Kiitian k = new Kiitian();
        k.getInput();
        k.display();
    }
}