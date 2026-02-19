package lab8;

import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking number of subjects
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int marks[] = new int[n];

        // Taking marks input
        System.out.println("Enter marks:");

        for (int i = 0; i <= n; i++) {   // ❌ Intentional Error Here
            marks[i] = sc.nextInt();
        }

        int total = 0;

        // Calculating total
        for (int i = 0; i < n; i++) {
            total += marks[i];
        }

        double average = total / n;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        sc.close();
    }
}
