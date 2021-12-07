package com.abi.tierhandlungMitGenerika.sammlungen;

public class Tier {
    private final String name;
    private final String farbe;

    public Tier(String name, String farbe){
        super();
        this.name = name;
        this.farbe = farbe;
    }

    @Override
    public String toString() {
        return "{ Hallo! Ich bin ein(e) " + farbe + " " + name + " }";
    }
}
