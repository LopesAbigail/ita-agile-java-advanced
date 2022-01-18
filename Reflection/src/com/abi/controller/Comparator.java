package com.abi.controller;

import com.abi.model.Difference;
import com.abi.model.Ignore;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Comparator {

    public static <E> List<Difference> compare(E oldObject, E newObject)
            throws InvocationTargetException, IllegalAccessException {
        List<Difference> differences = new ArrayList<>();

        Class<?> clazz = oldObject.getClass();
        for(Method method : clazz.getMethods())
        {
            if(method.getName().startsWith("get")
                    && method.getParameterCount() == 0
                    && method.getReturnType() != void.class
                    && !method.isAnnotationPresent(Ignore.class))
            {
                Object oldValue = method.invoke(oldObject);
                Object newValue = method.invoke(newObject);

                if(!newValue.equals(oldValue))
                {
                    Difference d = new Difference(method.getName(), newValue, oldValue);
                    differences.add(d);
                }
            }
        }

        return differences;
    }
}