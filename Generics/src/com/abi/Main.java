package com.abi;

import com.abi.aktivitaten.FruchtSalat;
import com.abi.artikel.Frucht;
import com.abi.sammlungen.Korb;

public class Main {

    public static void machFruchtSalad(Korb<Frucht> korb)
    {
        FruchtSalat fruchtSalat = new FruchtSalat();

        if(korb.habenDinge(korb))
        {
            Frucht frucht = fruchtSalat.fangen();
            fruchtSalat.schneiden();
            korb.insert(frucht);

            System.out.println("Yey! Eine Frucht wurde gefunden!");
        }
        else
        {
            System.out.println("O-ou! Wir haben in diesem Korb kein Obst gefunden...");
        }
    }

    public static void main(String[] args)
    {
        Korb<Frucht> meinKorb = new Korb<>();
        machFruchtSalad(meinKorb);
    }
}
