package oopj improvement.PYQ;

import java.sql.*;

public class DisplayStudent {

    public static void main(String[] args) {

        // Database details
        String url = "jdbc:mysql://localhost:3306/collegeDB";
        String user = "root";
        String password = "root123";

        try {
            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection con = DriverManager.getConnection(url, user, password);

            // SQL Query
            String sql = "SELECT * FROM student";

            // Create Statement
            Statement stmt = con.createStatement();

            // Execute Query
            ResultSet rs = stmt.executeQuery(sql);

            // Display Records
            System.out.println("ID\tName\tAge\tCourse");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + "\t" +
                    rs.getString("name") + "\t" +
                    rs.getInt("age") + "\t" +
                    rs.getString("course")
                );
            }

            // Close Resources
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
