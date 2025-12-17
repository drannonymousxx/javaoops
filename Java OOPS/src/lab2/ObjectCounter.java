import java.util.Scanner;

public class ObjectCounter {

    private static int count = 0; // static counter

    // Constructor increments count when an object is created
    public ObjectCounter() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many objects you want to create: ");
        int n = sc.nextInt();

        // create n number of objects
        for (int i = 0; i < n; i++) {
            new ObjectCounter();  
        }

        System.out.println("Number of objects created = " + ObjectCounter.getCount());
        sc.close();
    }
}
