package lab4;
import java.util.Scanner;

class Student {
    int roll;
    long reg;

    Student(int r, long g) {
        roll = r;
        reg = g;
    }

    public boolean equals(Object o) {
        return (o instanceof Student) &&
               roll == ((Student) o).roll &&
               reg == ((Student) o).reg;
    }
}

public class StudentEqualsDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s1 = new Student(sc.nextInt(), sc.nextLong());
        Student s2 = new Student(sc.nextInt(), sc.nextLong());

        System.out.println(
            s1.equals(s2) ? 
            "Both students are equal." : 
            "Both students are NOT equal."
        );

        sc.close();
    }
}
