package com.abi.view;

import com.abi.controller.Comparator;
import com.abi.model.Animal;
import com.abi.model.Difference;
import com.abi.model.Enums;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Animal bird1 = new Animal("Bob", Enums.Color.Black.toString(), Enums.Type.Bird.toString());
        Animal bird2 = new Animal("Dylan", Enums.Color.White.toString(), Enums.Type.Bird.toString());

        List<Difference> difs = Comparator.compare(bird1, bird2);
        difs.forEach(System.out::println);
    }
}
