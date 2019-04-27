package com.example.demo;

import org.springframework.stereotype.Component;

@Component("Tire")
public class Tire {

    private int size = 0;

    public Tire() {
    }

    public Tire(int s) {
        this.size = s;
    }

    public int getSize() {
        return size;
    }

    public int setSize(int s) {
        this.size = s;
        return this.size;
    }
}
