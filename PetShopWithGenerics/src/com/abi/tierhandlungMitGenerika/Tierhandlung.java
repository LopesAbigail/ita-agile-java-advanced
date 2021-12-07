package com.abi.tierhandlungMitGenerika;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tierhandlung<E> {

    private List<E> list = new ArrayList<>();

    public void add(E tier){
        list.add(tier);
    }

    public E handhaben(){
        Random r = new Random(System.currentTimeMillis());
        return list.remove(r.nextInt(list.size()));
    }

    public boolean tiereHaben(){
        return !list.isEmpty();
    }
}
