package com.example.service;

public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public String getUserNameById(int userId) {
        return repository.findNameById(userId);
    }
}
