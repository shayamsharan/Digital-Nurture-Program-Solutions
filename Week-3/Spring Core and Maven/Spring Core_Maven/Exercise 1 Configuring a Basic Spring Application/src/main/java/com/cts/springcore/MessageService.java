
package com.cts.springcore;

public class MessageService {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Your Message: " + message);
    }
}
