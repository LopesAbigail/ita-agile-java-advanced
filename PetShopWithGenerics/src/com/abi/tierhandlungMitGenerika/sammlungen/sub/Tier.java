package com.abi.tierhandlungMitGenerika.sammlungen.sub;

import com.abi.tierhandlungMitGenerika.sammlungen.Individuell;

public class Tier extends Individuell {
    private final String farbe;

    public Tier(String name, String farbe){
        super(name);
        this.farbe = farbe;
    }

    @Override
    public String toString() {
        return "{ Hallo! Ich bin ein(e) " + farbe + " " + name + " }";
    }
}
