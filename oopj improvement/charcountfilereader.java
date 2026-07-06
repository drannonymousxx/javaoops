package oopj improvement;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter File Name: ");
        String fileName = sc.nextLine();

        int lines = 0;
        int words = 0;
        int chars = 0;

        try {

            BufferedReader br =
                new BufferedReader(
                    new FileReader(fileName));

            String line;

            while((line = br.readLine()) != null) {

                lines++;

                chars += line.length();

                String w[] = line.split("\\s+");

                words += w.length;
            }

            br.close();

            System.out.println(
                "Number of Characters = "
                + chars);

            System.out.println(
                "Number of Words = "
                + words);

            System.out.println(
                "Number of Lines = "
                + lines);
        }

        catch(Exception e) {

            System.out.println(e);
        }

        sc.close();
    }
}
