package com.abi;

import com.abi.tierhandlungMitGenerika.Tierhandlung;
import com.abi.tierhandlungMitGenerika.sammlungen.Individuell;
import com.abi.tierhandlungMitGenerika.sammlungen.sub.HausTier;
import com.abi.tierhandlungMitGenerika.sammlungen.sub.Personen;
import com.abi.tierhandlungMitGenerika.sammlungen.sub.Tier;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static void allgemeineDingeHinzufugen() {

        Tierhandlung<Individuell> tierhandlung = new Tierhandlung<>();

        tierhandlung.add(new HausTier("Katze", "Schwarz"));
        tierhandlung.add(new HausTier("Hund", "Weiß"));
        tierhandlung.add(new Tier("Giraffe", "Gelb"));
        tierhandlung.add(new Tier("Panda", "Rot"));
        tierhandlung.add(new Tier("Waschbär", "Grau"));
        tierhandlung.add(new Tier("Schlange", "Grün"));
        tierhandlung.add(new Personen("Hannah", "15"));

        List<Personen> personen = new ArrayList<>();
        personen.add(new Personen("Pietro", "14"));
        personen.add(new Personen("Nabila", "31"));

        tierhandlung.addAlles(personen);

        System.out.println("Volle Liste: ");
        while(tierhandlung.tiereHaben()){
            System.out.println(tierhandlung.handhaben());
        }
    }

    private static void printListe(Class clazz) {

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

    public static void main(String[] args) {
        printListe(Tier.class);
        System.out.println(" --- ");
        printListe(String.class);
        System.out.println(" --- ");
        allgemeineDingeHinzufugen();
    }
}
