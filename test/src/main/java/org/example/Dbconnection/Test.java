package org.example.Dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
        public Connection getConnection() throws SQLException {
            String url = "jdbc:h2:mem:Test"; //h2 database
            String user = "sa"; // Database username
            String password = "";  //Database password

            return DriverManager.getConnection(url, user ,password);
        }
    }


