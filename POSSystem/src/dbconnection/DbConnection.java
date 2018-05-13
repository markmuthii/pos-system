
package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String SQLCONN = "jdbc:mysql://localhost/posdb";
    
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(SQLCONN, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error Connecting to DB:");
            e.printStackTrace();
        }
        return null;
    }
    
}
