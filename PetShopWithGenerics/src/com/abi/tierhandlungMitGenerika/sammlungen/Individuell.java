package com.abi.tierhandlungMitGenerika.sammlungen;

import com.abi.tierhandlungMitGenerika.Tierhandlung;
import com.abi.tierhandlungMitGenerika.sammlungen.sub.HausTier;
import com.abi.tierhandlungMitGenerika.sammlungen.sub.Personen;
import com.abi.tierhandlungMitGenerika.sammlungen.sub.Tier;

public class Individuell {
    protected String name;

    public Individuell(String name){
        this.name = name;
    }

    public Individuell(){

    }

    public void printListe(Class clazz) {

        Tierhandlung<Object> tierhandlung = new Tierhandlung<>();

        if(Tier.class.equals(clazz)) {
            tierhandlung.add(new HausTier("Katze", "Schwarz"));
            tierhandlung.add(new HausTier("Hund", "Weiß"));
            tierhandlung.add(new Tier("Giraffe", "Gelb"));
            tierhandlung.add(new Tier("Panda", "Rot"));
            tierhandlung.add(new Tier("Waschbär", "Grau"));
            tierhandlung.add(new Tier("Schlange", "Grün"));

        } else {
            tierhandlung.add(new HausTier("Katze", "Schwarz"));
            tierhandlung.add(new HausTier("Hund", "Weiß"));
            tierhandlung.add(new Tier("Giraffe", "Gelb"));
            tierhandlung.add(new Tier("Panda", "Rot"));
            tierhandlung.add(new Tier("Waschbär", "Grau"));
            tierhandlung.add(new Tier("Schlange", "Grün"));
            tierhandlung.add(new Personen("Hannah", "15"));
        }

        while(tierhandlung.tiereHaben()){
            System.out.println(tierhandlung.handhaben());
        }
    }
}
