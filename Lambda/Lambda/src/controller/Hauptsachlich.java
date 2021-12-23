package controller;

import java.util.ArrayList;
import java.util.List;

import model.Einkaufswagen;
import model.Produkt;

public class Hauptsachlich {

	public static void main(String[] args) {
		List<Produkt> list = new ArrayList<>();
		
		list.add(new Produkt("Käse", 15));
		list.add(new Produkt("Apfel", 10));
		list.add(new Produkt("Lasagne", 20));
		list.add(new Produkt("Hühnerpastete", 30));
		
		/*
		// Method reference
		list.forEach(System.out::println);
		
		// Lambda reference
		list.forEach(item -> System.out.println(item.getName()));
		
		// Rabatt
		list.forEach(p -> p.setWert(p.getWert() * 90/100));
		list.forEach(System.out::println);
		
		// Rabatt - another way
		list.forEach(Produkt::rabatt);
		*/
		
		Einkaufswagen einkaufswagen = new Einkaufswagen(list);
		einkaufswagen.rabatt(20, p -> p.getWert() < 100);
		einkaufswagen.getProduktList().forEach(System.out::println);
		
		
		
	}

}
