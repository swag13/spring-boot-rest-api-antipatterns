package com.swag.myapp.entities;

public class AccessChecker {
    public void checkAccess(User user) {
        if (user.getRole().equals("ADMIN")) {
            System.out.println("Admin access granted");
        } else if (user.getRole().equals("USER")) {
            System.out.println("User access granted");
        }
    }
}

class User {
    private String role;

    public User(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}