package com.abi;

import com.abi.tierhandlungMitGenerika.sammlungen.Individuell;
import com.abi.tierhandlungMitGenerika.sammlungen.sub.Tier;

public class Main {

    public static void main(String[] args) {
        Individuell exec = new Individuell();
        exec.printListe(Tier.class);
        System.out.println(" --- ");
        exec.printListe(null);
    }
}
