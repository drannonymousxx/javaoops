package oopj improvement;

import java.util.Scanner;

class NegativeNumberException extends Exception {

    NegativeNumberException(String msg) {
        super(msg);
    }
}

public class Main {

    static void processInput(int num)
            throws NegativeNumberException {

        if(num < 0) {

            throw new NegativeNumberException(
                    "Number should be positive");

        }

        System.out.println(
                "Double value = " + (num * 2));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");

        int num = sc.nextInt();

        try {

            processInput(num);

        }

        catch(NegativeNumberException e) {

            System.out.println(
                    "Caught the Exception");

            System.out.println(
                    "Exception occurred: " + e);
        }

        sc.close();
    }
}
