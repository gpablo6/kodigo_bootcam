package csf4.demo;

import java.sql.DriverManager;
import java.sql.SQLException;
import jdk.jfr.internal.Logger;

public class Connection {
    public Connection connect(String url) {
        Connection conn = null;
        try{
            // db parameters
            
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            Logger.log(null, null, "Connection to SQLite has been established.");
        } catch (SQLException e) {
            Logger.log(null, null, e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return conn;
    }
}
