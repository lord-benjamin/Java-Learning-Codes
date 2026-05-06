import io.github.cdimascio.dotenv.Dotenv;
import java.sql.*;  // import package

public class Demo {
    public static void main(String[] args) {
        /* 7 Steps for JDBC:
            import package
            load and register
            create connection
            create statement
            execute statement
            process the result
            close connection
         */

        Dotenv dotenv = Dotenv.load();

        String url = dotenv.get("DB_URL");  // connector:dbms://ip:port/database  // port for postgresql is 5432, for mysql is 3306
        String user = dotenv.get("DB_USER");
        String password = dotenv.get("DB_PASSWORD");
        String sql1 = "SELECT name FROM student WHERE id=2";
        String sql2 = "SELECT * FROM student";
        String sql3 = "INSERT INTO student VALUES (5, 'Egor', 35)";
        String sql4 = "UPDATE student SET name='Frank' WHERE id=4";
        String sql5 = "DELETE FROM student WHERE id=5";
        String sql6 = "DELETE FROM student WHERE id=6";
        int sid = 6;
        String sname = "Gauss";
        int smarks = 85;
        String sql7 = "INSERT INTO student VALUES (?,?,?)";  // parameterized query to prevent SQL injection and for dynamic data
        // Put question mark at place of dynamic data, but we have to set the values of these question marks before executing the query using PreparedStatement interface

        try {
            Class.forName("org.postgresql.Driver");  // load and register (optional)
        } catch (ClassNotFoundException e){
            System.err.println("Driver not found");
            e.printStackTrace();
        }

        try (Connection con = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connection successful!");

            Statement st = con.createStatement();  // create statement
            ResultSet rs = st.executeQuery(sql1);  // execute statement
            rs.next();  // move the cursor to the first row of the result set
            String name = rs.getString("name");  // process the result
            System.out.println("Name of student: " + name);
            System.out.println();

            // CRUD operations:
            // Read:
            rs = st.executeQuery(sql2);  // executeQuery is only for SELECT queries
            while(rs.next()){   // Gives pointer to the next row and also checks if there is a next row
                System.out.print(rs.getInt(1) + " - ");  // Accessing by column number
                System.out.print(rs.getString(2) + " - ");
                System.out.println(rs.getInt(3));
            }
            System.out.println();

            // Create, Update:
            boolean status = st.execute(sql3);  // execute is mainly for queries other than SELECT  // returns false for other statements and true for SELECT statements
            PreparedStatement ps = con.prepareStatement(sql7);  // for parameterized queries and to improve performance compared to Statement
            ps.setInt(1, sid);  // prepared_statement.setXXX(column_number,data)
            ps.setString(2, sname);
            ps.setInt(3, smarks);
            ps.execute();
            st.execute(sql4);
            rs = st.executeQuery(sql2);
            while(rs.next()){
                System.out.print(rs.getInt(1) + " - ");
                System.out.print(rs.getString(2) + " - ");
                System.out.println(rs.getInt(3));
            }
            System.out.println("status: " + status);
            System.out.println();

            // Delete:
            st.execute(sql5);
            st.execute(sql6);
            rs = st.executeQuery(sql2);
            while(rs.next()){
                System.out.print(rs.getInt(1) + " - ");
                System.out.print(rs.getString(2) + " - ");
                System.out.println(rs.getInt(3));
            }
            System.out.println();

            con.close();  // close connection
            System.out.println("Connection closed!");
        } catch (SQLException e) {
            System.err.println("Connection failed!");
            e.printStackTrace();
        }
    }
}
