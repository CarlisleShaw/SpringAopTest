package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        Car car = (Car)context.getBean("Car");
        car.setName("car1");
        car.setTire(10);
        System.out.println(car.getName());
        System.out.println(car.getTire());


	}

}
