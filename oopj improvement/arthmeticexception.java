package oopj improvement;

public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {

            int c = a / b;

            System.out.println("Result = " + c);

        }

        catch(ArithmeticException e) {

            System.out.println("Arithmetic Exception Caught");

        }

        finally {

            System.out.println("Finally Block Executed");

        }
    }
}