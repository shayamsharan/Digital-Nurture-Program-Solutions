
package com.cts.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        MessageService messageService = (MessageService) context.getBean("messageService");
        messageService.printMessage();
    }
}
