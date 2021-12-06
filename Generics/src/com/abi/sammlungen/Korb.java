package com.abi.sammlungen;

public class Korb<E> {

    public void insert(E item){}

    public void loschen(E item){}

    public boolean habenDinge(Korb<E> korb)
    {
        return korb != null;
    }

}
