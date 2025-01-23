package dev.exonbyte.pettycash.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig {
    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        UserDetails john = User.builder().username("john").password("{noop}asd123").role("EMPLOYEE").build;

        return new InMemoryUserDetailsManager(john);
    }
}
