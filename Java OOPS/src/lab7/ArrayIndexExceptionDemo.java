package lab7;
import java.util.Scanner;
public class ArrayIndexExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        System.out.println("Enter 5 numbers:");
        try {
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in thread \"main\" " + e);
        }

        sc.close();
    }
}
