package com.example.service;

public class PaymentService {

    private final PaymentRepository repository;

    public PaymentService(PaymentRepository repository) {
        this.repository = repository;
    }

    public void processPayment(int amount) {
        repository.saveTransaction(amount);
    }
}
