package com.abi.tierhandlungMitGenerika.sammlungen;

public class Personen {
    private final String name;
    private final String jahreAlt;

    public Personen(String name, String jahreAlt){
        super();
        this.name = name;
        this.jahreAlt = jahreAlt;
    }

    @Override
    public String toString() {
        return "{ Hallo! Ich heisse " + name + " und Ich bin " + jahreAlt + " Jahre alt! }";
    }
}
