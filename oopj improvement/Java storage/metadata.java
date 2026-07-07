package oopj improvement.Java storage;
import java.sql.*;

public class DisplayColumnHeading {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String password = "root";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            // Get metadata
            ResultSetMetaData md = rs.getMetaData();

            int columns = md.getColumnCount();

            // Print column headings
            for(int i = 1; i <= columns; i++)
            {
                System.out.print(md.getColumnName(i) + "\t");
            }

            System.out.println();

            // Print records
            while(rs.next())
            {
                for(int i = 1; i <= columns; i++)
                {
                    System.out.print(rs.getString(i) + "\t");
                }

                System.out.println();
            }

            rs.close();
            stmt.close();
            con.close();

        }

        catch(Exception e)
        {
            System.out.println(e);
        }

    }

}