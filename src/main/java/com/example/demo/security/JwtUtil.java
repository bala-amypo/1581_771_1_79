// package com.example.demo.security;
// import io.jsonwebtoken.*;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.stereotype.Component;
// import java.util.Date;
// @Component
// public class JwtUtil {
//     @Value("${jwt.secret}")
//     private String secret;
//     @Value("${jwt.expiration}")
//     private long validityInMs;
//     public String generateToken(Long userId, String email, String role) {
//         Claims claims = Jwts.claims().setSubject(email);
//         claims.put("userId", userId);
//         claims.put("role", role);

//         Date now = new Date();
//         Date validity = new Date(now.getTime() + validityInMs);

//         return Jwts.builder()
//                 .setClaims(claims)
//                 .setIssuedAt(now)
//                 .setExpiration(validity)
//                 .signWith(SignatureAlgorithm.HS256, secret)
//                 .compact();
//     }
//     public boolean validateToken(String token) {
//         try {
//             Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
//             return true;
//         } catch (JwtException | IllegalArgumentException e) {
//             return false;
//         }
//     }
//     public String getEmailFromToken(String token) {
//         return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().getSubject();
//     }
//     public String getRoleFromToken(String token) {
//         return (String) Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().get("role");
//     }
// }