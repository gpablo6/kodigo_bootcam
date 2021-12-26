package csf4.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import jdk.jfr.internal.Logger;

public class App 
{
    String dbURL = "jdbc:sqlite:trans.db";
    public static void main( String[] args )
    {
        Connection sqlite3 = connect(dbURL);
        Query.select(sqlite3, , 'transactions');
    }
}
