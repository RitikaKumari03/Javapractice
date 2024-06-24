package org.example.Dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
        public Connection getConnection() throws SQLException {
            String url = "jdbc:mysql://localhost:3306/ems";
            String user = "root"; // Database username
            String password = "root";  //Database password

            return DriverManager.getConnection(url, user ,password);
        }
    }


