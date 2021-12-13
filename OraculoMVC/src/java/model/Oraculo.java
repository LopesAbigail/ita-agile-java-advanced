/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author conta
 */
public class Oraculo {
    public List<String> bestProducts(String type) {
        List<String> list = new ArrayList<String>();
        if("Doce de leite".equals(type)) {
            list.add("Viçosa");
            list.add("Boreal");
        } else if("Queijo mineiro".equals(type)) {
            list.add("Candido Tostes");
            list.add("Humaitá");
        }
        return list;
    }
}
