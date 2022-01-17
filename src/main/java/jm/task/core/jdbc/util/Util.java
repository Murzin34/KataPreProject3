package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {

    private final static String URL = "jdbc:mysql://localhost:3306/users";
    private final static String LOGIN = "root";
    private final static String PASSWORD = "78877887";
    private static Connection connection;

    public static void createNewConnection() throws SQLException {
        connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
        System.out.println("Соединение установлено");
    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                createNewConnection();
            } catch (SQLException e) {

            }
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {

        }
    }
}
