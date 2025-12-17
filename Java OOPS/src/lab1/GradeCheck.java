/*Write a program to print the corresponding grade for the given
mark using if..else statement in Java*/

public class GradeCheck {
    public static void main(String[] args) {

        char grade = 'A';   

        if (grade == 'O') {
            System.out.println("Grade: Outstanding");
        } 
        else if (grade == 'E') {
            System.out.println("Grade: Excellent");
        } 
        else if (grade == 'A') {
            System.out.println("Grade: Very Good");
        } 
        else if (grade == 'B') {
            System.out.println("Grade: Good");
        } 
        else if (grade == 'C') {
            System.out.println("Grade: Average");
        } 
        else {
            System.out.println("Invalid Grade");
        }
    }
}
