// AuthRequest.java
package com.example.demo.dto;
import lombok.Data;

@Data
public class AuthRequest {
    private String email;
    private String password;
}

// AuthResponse.java
package com.example.demo.dto;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class AuthResponse {
    private String token;
    private Long userId;
    private String email;
    private String role;
}