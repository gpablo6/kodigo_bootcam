package csf4.demo;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Query {
    public static ResultSet select(Connection sqlite3, ArrayList<String> columns, String table){
        this.conn = sqlite3;
        String query = String.format("SELECT %s FROM %s", columns, table);
        Statement statement = conn.createStatement();
        return statement.executeQuery(query);
    }
}
