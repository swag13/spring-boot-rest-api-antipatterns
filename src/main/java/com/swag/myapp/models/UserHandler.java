package com.swag.myapp.models;

public class UserHandler {
    private EmailServiceImpl emailService = new EmailServiceImpl(); // DIP violation

    public void handleUser() {
        emailService.send();
    }
}

class EmailServiceImpl {
    public void send() {
        System.out.println("Email sent");
    }
}