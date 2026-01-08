package lab4;
import java.util.Scanner;

class Student {
    int rollNo;
    long regNo;

    Student(int rollNo, long regNo) {
        this.rollNo = rollNo;
        this.regNo = regNo;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj instanceof Student) {
            Student s = (Student) obj;
            return this.rollNo == s.rollNo && this.regNo == s.regNo;
        }
        return false;
    }
}

public class StudentEqualsDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No of Student 1: ");
        int r1 = sc.nextInt();
        System.out.print("Enter Registration No of Student 1: ");
        long reg1 = sc.nextLong();

        System.out.print("Enter Roll No of Student 2: ");
        int r2 = sc.nextInt();
        System.out.print("Enter Registration No of Student 2: ");
        long reg2 = sc.nextLong();

        Student s1 = new Student(r1, reg1);
        Student s2 = new Student(r2, reg2);

        if (s1.equals(s2))
            System.out.println("Both students are equal.");
        else
            System.out.println("Both students are NOT equal.");

        sc.close();
    }
}
