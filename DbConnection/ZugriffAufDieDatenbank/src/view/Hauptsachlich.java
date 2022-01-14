package view;

import java.util.List;

import controller.NutzerDAO;
import model.Nutzer;

public class Hauptsachlich {

	public static void main(String[] args) {

		// Nutzer n = new Nutzer("Anne", "anne.laplace", "anne.laplace@mail.com");
		// Nutzer n = new Nutzer("Rosalinda", "rosalinda.parker", "rosalinda.parker@mail.com");
		Nutzer n = new Nutzer("Roberio", "roberio.teclados", "roberio.teclados@mail.com");
		
		NutzerDAO.insert(n);
		
		List<Nutzer> list = NutzerDAO.alles();
		list.forEach(i -> System.out.println(i.toString()));
		
		list.forEach(System.out::println);

	}

}
