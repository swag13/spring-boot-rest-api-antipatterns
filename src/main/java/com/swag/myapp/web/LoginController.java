package com.swag.myapp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swag.myapp.entities.Person;
import com.swag.myapp.models.LoginRequest;
import com.swag.myapp.services.PersonService;

@RestController
public class LoginController {

    @Autowired
    private PersonService personService;

    @PostMapping("/api/login")
    public ResponseEntity<Person> login(
            @RequestBody @Validated LoginRequest loginRequest) {
        return personService.login(loginRequest.getEmail(), loginRequest.getPassword())
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
    }
}
