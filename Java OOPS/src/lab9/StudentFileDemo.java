package lab9;
import java.io.*;
import java.util.Scanner;

public class StudentFileDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Roll No: ");
            int rollNo = sc.nextInt();
            sc.nextLine();  

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Subject: ");
            String subject = sc.nextLine();

            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter existing file name: ");
            String fileName = sc.nextLine();
            FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Roll No: " + rollNo);
            bw.newLine();
            bw.write("Name: " + name);
            bw.newLine();
            bw.write("Subject: " + subject);
            bw.newLine();
            bw.write("Marks: " + marks);
            bw.newLine();
            bw.write("---------------------------");
            bw.newLine();

            bw.close();

            System.out.println("\nStudent details written successfully.\n");
            System.out.println("Displaying File Content:\n");

            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
