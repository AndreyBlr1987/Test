

import java.net.URL;
import java.sql.*;

public class Main {
    private final static String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "1234567";


    public static void main(String[] args) {
        Connection connection;
        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            Statement statement = connection.createStatement();
         

        } catch (SQLException e) {
            System.out.println("Не удалось загрузить драйвер");
        }
    }
}
