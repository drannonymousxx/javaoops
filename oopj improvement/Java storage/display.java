package oopj improvement.Java storage;
import java.sql.*;
import java.util.Scanner;

public class DisplayParticularStudent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String password = "root";

        try {

            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection con = DriverManager.getConnection(url, user, password);

            // Create Statement
            Statement stmt = con.createStatement();

            // Execute Query
            ResultSet rs = stmt.executeQuery(
                "SELECT * FROM student WHERE RollNo = " + roll);

            // Display Record
            if (rs.next()) {

                System.out.println(
                    rs.getInt("RollNo") + "\t" +
                    rs.getString("Name") + "\t" +
                    rs.getInt("Marks")
                );

            } else {

                System.out.println("Record Not Found");

            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}
