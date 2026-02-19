package lab8;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        // Creating Scanner object for user input
        Scanner sc = new Scanner(System.in);
        String str1, str2, str3;
        String original;    
        // i) Change the case
        System.out.print("Enter a String    :  ");
        str1 = sc.nextLine();

        original = str1;   // Storing original for later use
        String changedCase = "";
        // Changing lowercase to uppercase and vice versa
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            if (Character.isLowerCase(ch))
                changedCase += Character.toUpperCase(ch);
            else
                changedCase += Character.toLowerCase(ch);
        }
        System.out.println("The string after changing the case is " + changedCase);
        // ii) Reverse the string
        // a) Without using predefined function
        String reverse1 = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            reverse1 += str1.charAt(i);
        }
        System.out.println("The string after reversing is  " + reverse1);
        // b) Using predefined function (StringBuffer)
        StringBuffer sb = new StringBuffer(str1);
        System.out.println("The string after reversing using function is " + sb.reverse());
        // iii) Compare two strings
        System.out.print("\nEnter the second string for comparision : ");
        str2 = sc.nextLine();
        // compareTo() returns ASCII difference
        int diff = str1.compareTo(str2);
        System.out.println("The difference between ASCII value is " + diff);
        // iv) Insert one string into another
        System.out.print("\nEnter the string to be inserted into first string : ");
        str3 = sc.nextLine();
        String inserted = original + " " + str3;
        System.out.println("The string after insertion is : " + inserted);
        // v) Convert to upper and lower case
        System.out.print("\nEnter a String : ");
        String str4 = sc.nextLine();
        System.out.println("Uppercase: " + str4.toUpperCase());
        System.out.println("Lowercase: " + str4.toLowerCase());
        // vi) Check character position
        System.out.print("\nEnter a String : ");
        String str5 = sc.nextLine();
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);
        int position = str5.indexOf(ch);
        if (position != -1)
            System.out.println("Position of entered character: " + (position + 1));
        else
            System.out.println("Entered character is not present");
        sc.nextLine(); // clearing buffer
        // vii) Check palindrome
        System.out.print("\nEnter a String :  ");
        String str6 = sc.nextLine();
        String rev = "";
        for (int i = str6.length() - 1; i >= 0; i--) {
            rev += str6.charAt(i);
        }
        if (str6.equals(rev))
            System.out.println("Entered string is palindrome");
        else
            System.out.println("Entered string is not a palindrome");
        // viii) Count words, vowels, consonants
        System.out.print("\nEnter a String :    ");
        String str7 = sc.nextLine();
        // Counting words
        int words = str7.trim().split("\\s+").length;
        int vowels = 0, consonants = 0;
        for (int i = 0; i < str7.length(); i++) {
            char c = Character.toLowerCase(str7.charAt(i));
            if (Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println("No. of words: " + words);
        System.out.println("No. of vowels: " + vowels);
        System.out.println("No. of consonants: " + consonants);

        sc.close();
    }
}
