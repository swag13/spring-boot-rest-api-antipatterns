
package com.swag.myapp.models;

import jakarta.validation.constraints.NotEmpty;

public class LoginRequest {
    @NotEmpty
    private String email;

    @NotEmpty
    private String password;

    // Constructor
    public LoginRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Getters
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    // Setters (optional, if mutability is needed)
    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // toString method
    @Override
    public String toString() {
        return "LoginRequest{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    // equals and hashCode methods (optional, for object comparison)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoginRequest that = (LoginRequest) o;

        if (!email.equals(that.email)) return false;
        return password.equals(that.password);
    }

    @Override
    public int hashCode() {
        int result = email.hashCode();
        result = 31 * result + password.hashCode();
        return result;
    }
}
