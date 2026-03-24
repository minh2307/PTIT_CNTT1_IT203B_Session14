package com.example.flashsale.main;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/flashsaledb?useSSL=false&serverTimezone=UTC",
                    "root",
                    "quan2908"
            );

            System.out.println("Connect DB SUCCESS!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}