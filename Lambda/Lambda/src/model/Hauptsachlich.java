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

	}

}
