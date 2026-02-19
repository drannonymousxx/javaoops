package lab7;
import java.util.Scanner;
class NegativeNumberException extends Exception {

    public NegativeNumberException(String message) {
        super(message);
    }
}
public class NegativeNumberExceptionDemo {
    static void ProcessInput(int number) throws NegativeNumberException {

        if (number < 0) {
            throw new NegativeNumberException("number should be positive");
        }
        else {
            System.out.println("Double value: " + (number * 2));
        }
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        try {
            ProcessInput(num);
        }
        catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }

        sc.close();
    }
}

