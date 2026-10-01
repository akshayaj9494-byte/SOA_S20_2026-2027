package com.example.jwtcreation;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.SecretKey;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtService {

    String key = "this-is-spring-book-jwt-creation-secret-key-123456";

    SecretKey secretkey = Keys.hmacShaKeyFor(key.getBytes());

    public String generateJwt(User u1) {

        return Jwts.builder()
                .claim("id", u1.getId())
                .claim("username", u1.getUsername())
                .claim("role", u1.getRole())
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + 84600000))
                .signWith(secretkey)
                .compact();
    }

    public Map<String, Object> validateJWT(String token) throws Exception {

        Claims claim = Jwts.parser()
                .verifyWith(secretkey)
                .build()
                .parseSignedClaims(token)
                .getPayload();

        if (claim == null || claim.getExpiration().before(new Date())) {
            throw new Exception("Token Failed");
        }

        Map<String, Object> parsedJWT = new HashMap<>();

        parsedJWT.put("id", claim.get("id"));
        parsedJWT.put("username", claim.get("username"));
        parsedJWT.put("role", claim.get("role"));

        return parsedJWT;
    }
}