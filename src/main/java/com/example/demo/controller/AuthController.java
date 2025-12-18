// package com.example.demo.controller;

// import com.example.demo.model.User;
// import com.example.demo.dto.AuthRequest;
// import com.example.demo.dto.AuthResponse;
// import com.example.demo.service.UserService;
// import com.example.demo.security.JwtUtil;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.web.bind.annotation.*;

// @RestController
// @RequestMapping("/api/auth")
// public class AuthController {

//     @Autowired
//     private UserService userService;

//     @Autowired
//     private JwtUtil jwtUtil;

//     @Autowired
//     private PasswordEncoder passwordEncoder;

//     @PostMapping("/register")
//     public ResponseEntity<?> register(@RequestBody User user) {
//         if (userService.existsByEmail(user.getEmail())) {
//             return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Email already exists");
//         }
//         // Hash password before saving
//         user.setPassword(passwordEncoder.encode(user.getPassword()));
//         user.setRole("USER"); // Default role as per SRS
//         User savedUser = userService.saveUser(user);
//         return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
//     }

//     @PostMapping("/login")
//     public ResponseEntity<?> login(@RequestBody AuthRequest authRequest) {
//         User user = userService.findByEmail(authRequest.getEmail());
        
//         if (user != null && passwordEncoder.matches(authRequest.getPassword(), user.getPassword())) {
//             // Generate token with userId, email, and role claims
//             String token = jwtUtil.generateToken(user.getId(), user.getEmail(), user.getRole());
//             return ResponseEntity.ok(new AuthResponse(token, user.getId(), user.getEmail(), user.getRole()));
//         }
        
//         return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
//     }
// }