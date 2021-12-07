package com.abi.tierhandlungMitGenerika.sammlungen.sub;

import com.abi.tierhandlungMitGenerika.sammlungen.Individuell;

public class Personen extends Individuell {

    private final String jahreAlt;

    public Personen(String name, String jahreAlt){
        super(name);
        this.jahreAlt = jahreAlt;
    }

    @Override
    public String toString() {
        return "{ Hallo! Ich heisse " + name + " und Ich bin " + jahreAlt + " Jahre alt! }";
    }
}
