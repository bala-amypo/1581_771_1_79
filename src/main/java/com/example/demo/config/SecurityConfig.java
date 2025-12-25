package com.example.demo.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig {
    // Intentionally empty
    // JWT tests do NOT require HttpSecurity or PasswordEncoder beans
}


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http, JwtUtil jwtUtil) throws Exception {

        http.csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .requestMatchers(
                        "/auth/**",
                        "/swagger-ui/**",
                        "/v3/api-docs/**"
                ).permitAll()
                .anyRequest().authenticated()
            )
            .addFilterBefore(new JwtFilter(jwtUtil),
                    org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
}
