
import java.sql.*;;
import java.util.*;
        import java.util.stream.*;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/myDb";
            String username = "root";
            String password = "12345";

            Connection conn = DriverManager.getConnection(url, username, pswd);

            Statement stmt = conn.createStatement();

            stmt.executeUpdate("CREATE TABLE Books(BookID INTEGER, BookName VARCHAR(20), BookPrice INT);");

            stmt.executeUpdate("INSERT INTO Books VALUES (101, C Programming, 550)");
            stmt.executeUpdate("INSERT INTO Books VALUES (102, Python Programming, 450)");
            stmt.executeUpdate("INSERT INTO Books VALUES (103, C++ Programming, 600)");

            ResultSet rs = stmt.executeQuery("SELECT * FROM BOOKS");

            while(rs.next()) {
                System.out.println(rs.getInt("BookID") + "    " + rs.getString("BookName") +  "      " +  rs.getInt("BookPrice"));
            }

        }

        catch(Exception e){}
    }
}
