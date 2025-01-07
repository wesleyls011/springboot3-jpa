package com.projetospring.spring.config;


import com.projetospring.spring.entities.User;
import com.projetospring.spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Ana Clara", "ana@email.com", "9912121212","123456");
        User u2 = new User(null, "Wesley Sanches", "wesley@email.com", "991111111","123456");

        userRepository.saveAll(Arrays.asList(u1, u2));

    }
}
