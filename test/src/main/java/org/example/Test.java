package org.example;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class Test {
    public Connection getConnection() throws SQLexception {
        String url = "jdbc:h2:mem:Test"; //h2 database
        String user = "aa"; // Database username
        String password = "";  //Database password

        return Drivermanager.getConnection(url, user ,password);
    }
}
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQlexception;
import jave.sql.Statement;

