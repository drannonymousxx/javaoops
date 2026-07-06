package oopj improvement;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Subject: ");
            String subject = sc.nextLine();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter File Name: ");
            String fileName = sc.nextLine();

            FileWriter fw = new FileWriter(fileName);

            fw.write("Roll No: " + roll + "\n");
            fw.write("Name: " + name + "\n");
            fw.write("Subject: " + subject + "\n");
            fw.write("Marks: " + marks + "\n");

            fw.close();

            System.out.println("\nData Written Successfully");

            BufferedReader br =
                    new BufferedReader(
                            new FileReader(fileName));

            String line;

            System.out.println("\nFile Contents:");

            while((line = br.readLine()) != null) {

                System.out.println(line);
            }

            br.close();
        }

        catch(Exception e) {

            System.out.println(e);
        }

        sc.close();
    }
}
