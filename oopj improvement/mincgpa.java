package oopj improvement;

import java.util.Scanner;

class Student {

    int roll;
    String name;
    double cgpa;

    void read(Scanner sc) {

        System.out.print("Enter Roll No: ");
        roll = sc.nextInt();

        sc.nextLine(); // clears the newline

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter CGPA: ");
        cgpa = sc.nextDouble();
    }

    void display() {

        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        double minCgpa = Double.MAX_VALUE;
        String minName = "";

        for(int i = 0; i < n; i++) {

            s[i] = new Student();

            System.out.println("\nStudent " + (i + 1));

            s[i].read(sc);

            if(s[i].cgpa < minCgpa) {
                minCgpa = s[i].cgpa;
                minName = s[i].name;
            }
        }

        System.out.println("\n----- Student Details -----");

        for(int i = 0; i < n; i++) {
            s[i].display();
            System.out.println();
        }

        System.out.println("Student with Lowest CGPA = " + minName);

        sc.close();
    }
}