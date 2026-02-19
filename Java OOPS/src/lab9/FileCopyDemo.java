package lab9;
import java.io.*;
import java.util.Scanner;

public class FileCopyDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the source file name: ");
        String sourceFile = sc.nextLine();

        System.out.print("Enter the destination file name: ");
        String destinationFile = sc.nextLine();

        // -------- Character Stream Copy --------
        try {
            FileReader fr = new FileReader(sourceFile);
            FileWriter fw = new FileWriter(destinationFile);

            int ch;

            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("\nFile Copied Successfully using Character Stream.");

        } catch (IOException e) {
            System.out.println("Error in Character Stream: " + e.getMessage());
        }

        // -------- Byte Stream Copy --------
        try {
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream("byte_" + destinationFile);

            int data;

            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            fis.close();
            fos.close();

            System.out.println("File Copied Successfully using Byte Stream.");

        } catch (IOException e) {
            System.out.println("Error in Byte Stream: " + e.getMessage());
        }
        sc.close();
    }
}

