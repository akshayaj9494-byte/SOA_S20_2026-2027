package com.example.jwtcreation;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository repo;

    @Autowired
    JwtService jwtService;

    public Object signup(User u1) {

        Map<String, Object> response = new HashMap<>();

        try {

            User user = repo.findByUsername(u1.getUsername());

            if (user == null) {

                u1.setRole(0);
                repo.save(u1);

                response.put("code", 200);
                response.put("message", "User registered");

            } else {

                response.put("code", 501);
                response.put("message", "User already exists");
            }

        } catch (Exception e) {

            response.put("code", 500);
            response.put("message", e.getMessage());
        }

        return response;
    }

    public Object signin(User u1) {

        Map<String, Object> response = new HashMap<>();

        try {

            User user = repo.findByUsername(u1.getUsername());

            if (user == null ||
                    !u1.getPassword().equals(user.getPassword())) {

                response.put("code", 501);
                response.put("message", "Authentication failed");

            } else {

                response.put("code", 200);
                response.put("jwt", jwtService.generateJwt(user));
            }

        } catch (Exception e) {

            response.put("code", 500);
            response.put("message", e.getMessage());
        }

        return response;
    }
}