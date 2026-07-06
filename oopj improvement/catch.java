package oopj improvement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int arr[] = new int[4];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 4 numbers:");

        for(int i=0;i<4;i++) {
            arr[i] = sc.nextInt();
        }

        try {

            System.out.println(arr[4]);

        }

        catch(ArrayIndexOutOfBoundsException e) {

            System.out.println("Exception Caught: " + e);
        }

        sc.close();
    }
}
