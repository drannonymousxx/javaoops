//Accept 10 numbers from command line and check how many of them are even and how many are odd.

import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0, odd = 0;
        System.out.println("Enter 10 integers:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Number " + i + ": ");
            int num = sc.nextInt();
            if (num % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Number of even numbers = " + even);
        System.out.println("Number of odd numbers = " + odd);
        sc.close();
    }
}
