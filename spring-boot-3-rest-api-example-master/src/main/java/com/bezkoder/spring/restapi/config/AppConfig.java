package com.bezkoder.spring.restapi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {

 // for dummy user data
//    @Bean
//    public UserDetailsService userDetailsService() {
//        UserDetails user1 = User.builder().username("hari").password(passwordEncoder().encode("1234")).roles("Admin").build();
//        UserDetails user2 = User.builder().username("ashok").password(passwordEncoder().encode("456")).roles("User").build();
//        return new InMemoryUserDetailsManager(user1, user2);
//    }



    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }




}
