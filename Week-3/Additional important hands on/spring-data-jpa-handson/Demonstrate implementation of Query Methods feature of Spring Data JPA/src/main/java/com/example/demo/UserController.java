package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {

    private final UserRepository repo;

    public UserController(UserRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/name/{name}")
    public List<User> getByName(@PathVariable String name) {
        return repo.findByName(name);
    }

    @GetMapping("/age/{age}")
    public List<User> getByAgeGreaterThan(@PathVariable int age) {
        return repo.findByAgeGreaterThan(age);
    }

    @GetMapping("/email/{suffix}")
    public List<User> getByEmailEndingWith(@PathVariable String suffix) {
        return repo.findByEmailEndingWith(suffix);
    }
}
