package org.example.Dbconnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Company c=new Company();
            DBConnection db=new DBConnection();

            Scanner scanner =new Scanner(System.in);
            System.out.println("enter the name");
            String name= scanner.nextLine();
            c.name=name;
            System.out.println("enter the NoOfEmployees");
            String NoOfEmployees= scanner.nextLine();
            c.NoOfEmployees= Integer.parseInt(NoOfEmployees);
            System.out.println("enter the address");
            String address= scanner.nextLine();
            c.address=address;
            c.trainFreshers();

            try (Connection connection = db.getConnection()) {
                Statement statement = connection.createStatement();
                String createTableQuery = "CREATE TABLE if not exists Company("
                        + "NAME VARCHAR(50),"
                        + "NOOFEMPLOYEE VARCHAR(50),"
                        + "ADDRESS VARCHAR(50))";
      statement.execute(createTableQuery);
        System.out.println("Table created succesfully,");
      String query = STR."INSERT INTO Company(NAME,NOOFEMPLOYEE,ADDRESS)values('\{c.name}','\{c.NoOfEmployees}' ,'\{c.address}')";
        statement.executeUpdate(query);
      String querySelect = "SELECT * from Company";
        ResultSet result = statement.executeQuery(querySelect);
      System.out.println(result.getRow());}
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }












