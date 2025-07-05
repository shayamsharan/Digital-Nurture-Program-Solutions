package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {

    private final UserRepository repo;

    public UserController(UserRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/hql/{name}")
    public List<User> getUsersByName(@PathVariable String name) {
        return repo.findByNameHQL(name);
    }

    @GetMapping("/native/{email}")
    public List<User> getUsersByEmail(@PathVariable String email) {
        return repo.findByEmailNative(email);
    }
}
