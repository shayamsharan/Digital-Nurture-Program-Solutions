package com.example.injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Engine engine() {
        return new Engine("V8 Engine");
    }

    @Bean
    public Car car() {
        Car car = new Car(engine());
        car.setColor("Red");
        return car;
    }
}
