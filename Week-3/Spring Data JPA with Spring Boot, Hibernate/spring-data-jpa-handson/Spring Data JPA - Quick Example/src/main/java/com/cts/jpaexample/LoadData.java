
package com.cts.jpaexample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadData {

    @Bean
    CommandLineRunner initDatabase(UserRepository repository) {
        return args -> {
            repository.save(new User("Shayam", "shayam@example.com"));
            repository.findAll().forEach(user -> System.out.println(user.getName() + " - " + user.getEmail()));
        };
    }
}
