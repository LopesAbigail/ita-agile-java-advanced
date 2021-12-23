package model;

import java.util.ArrayList;
import java.util.List;

public class Hauptsachlich {

	public static void main(String[] args) {
		List<Produkt> list = new ArrayList<>();
		
		list.add(new Produkt("Käse", 15));
		list.add(new Produkt("Apfel", 10));
		list.add(new Produkt("Lasagne", 20));
		list.add(new Produkt("Hühnerpastete", 30));
		
		// Method reference
		list.forEach(System.out::println);
		
		// Lambda reference
		list.forEach(item -> System.out.println(item.getName()));
		
		// Rabatt
		list.forEach(p -> p.setWert(p.getWert() * 90/100));
		list.forEach(System.out::println);
		
		// Rabatt - another way
		list.forEach(Produkt::rabatt);
		
		
		
	}

}
