package com.abi.model;

public class Difference {

    private String property;
    private Object newValue;
    private Object oldValue;

    public Difference(String property, Object newValue, Object oldValue) {
        this.property = property;
        this.newValue = newValue;
        this.oldValue = oldValue;
    }

    @Override
    public String toString() {
        return "Diference{" +
                "property='" + property + '\'' +
                ", newValue=" + newValue +
                ", oldValue=" + oldValue +
                '}';
    }
}
