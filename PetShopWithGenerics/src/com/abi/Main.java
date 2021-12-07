package com.abi;

import com.abi.tierhandlungMitGenerika.sammlungen.Tier;
import com.abi.tierhandlungMitGenerika.Tierhandlung;

public class Main {

    public static void main(String[] args) {
        Tierhandlung<Tier> tierhandlung = new Tierhandlung<>();
        tierhandlung.add(new Tier("Katze", "Schwarz"));
        tierhandlung.add(new Tier("Hund", "Weiß"));
        tierhandlung.add(new Tier("Giraffe", "Gelb"));
        tierhandlung.add(new Tier("Panda", "Rot"));
        tierhandlung.add(new Tier("Waschbär", "Grau"));
        tierhandlung.add(new Tier("Schlange", "Grün"));

        while(tierhandlung.tiereHaben()){
            System.out.println(tierhandlung.handhaben());
        }
    }
}
