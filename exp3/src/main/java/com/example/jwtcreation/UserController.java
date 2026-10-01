package com.example.jwtcreation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exp3")
public class UserController {

    @Autowired
    UserService us;

    @GetMapping("/")
    public String home() {
        return "JWT Application is running";
    }

    @PostMapping("/register")
    public Object signup(@RequestBody User u1) {
        return us.signup(u1);
    }

    @PostMapping("/login")
    public Object signin(@RequestBody User u1) {
        return us.signin(u1);
    }
}