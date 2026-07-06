package oopj improvement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = sc.nextLine();

        int vowels = 0;
        int consonants = 0;

        String[] words = s.trim().split("\\s+");

        for(int i = 0; i < s.length(); i++) {

            char ch = Character.toLowerCase(s.charAt(i));

            if(ch >= 'a' && ch <= 'z') {

                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Words = " + words.length);
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);

        sc.close();
    }
}