package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerExample {
    private static final Logger logger = LoggerFactory.getLogger(LoggerExample.class);

    public static void main(String[] args) {
        logger.info("Application started.");
        
        try {
            int result = divide(10, 0);
            logger.info("Result: {}", result);
        } catch (ArithmeticException e) {
            logger.error("Error occurred while dividing: {}", e.getMessage());
        }

        logger.warn("This is a warning message.");
        logger.info("Application finished.");
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
