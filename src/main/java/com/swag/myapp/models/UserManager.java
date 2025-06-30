package com.swag.myapp.models;

public class UserManager {
    public void createUser() {
        UserService userService = new UserService(); // ❌ Manual service instantiation instead of using Factory/DI
    }
}

class UserService {
    public void doSomething() {}
}
