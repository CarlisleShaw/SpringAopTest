package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Car")
public class Car {
    @Autowired
    private Tire tire;
    private String name = "";

    public Car(Tire t) {
        this.tire = t;
    }

    public String setName(String s) {
        this.name = s;
        return this.name;
    }

    public String getName() {
        return this.name;
    }

    public int setTire(int t) {
        this.tire.setSize(t);
        return this.tire.getSize();
    }

    public int getTire() {
        return this.tire.getSize();
    }

}
