package com.swag.myapp.services;

import java.sql.Connection;
import java.sql.DriverManager;

public class OrderService {
    public void connectDB() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "pass"); // ❌ JDBC Access
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
