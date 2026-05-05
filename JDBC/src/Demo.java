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
        String sql = "SELECT name FROM student WHERE id=2";

        try {
            Class.forName("org.postgresql.Driver");  // load and register (optional)
        } catch (ClassNotFoundException e){
            System.err.println("Driver not found");
            e.printStackTrace();
        }

        try (Connection con = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connection successful!");

            Statement st = con.createStatement();  // create statement
            ResultSet rs = st.executeQuery(sql);  // execute statement
            rs.next();  // move the cursor to the first row of the result set
            String name = rs.getString("name");  // process the result
            System.out.println("Name of student: " + name);

            con.close();  // close connection
            System.out.println("Connection closed!");
        } catch (SQLException e) {
            System.err.println("Connection failed!");
            e.printStackTrace();
        }
    }
}
