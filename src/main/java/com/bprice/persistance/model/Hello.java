package com.bprice.persistance.model;

import lombok.Data;

@Data
public class Hello {
    public Hello(String greeting) {
        this.greeting = greeting;
    }
    private String greeting;
}
