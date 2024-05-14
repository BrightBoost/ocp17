package org.example.workingwithjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static void main(String[] args) {
        // Database URL syntax: jdbc:postgresql://host:port/database
        String url = "jdbc:postgresql://localhost:5432/postgres";
        //String user = "postgres";
        //String password = "your_password";

        try {
            // Registering the JDBC driver
            // Class.forName("org.postgresql.Driver");

            // Opening a connection
            Connection conn = DriverManager.getConnection(url);//, user, password);

            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }

            // Clean up environment
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
