package com.openclassrooms.helloworld.model;

public class HelloWorld {
    public String value = "Hello Maty";

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
