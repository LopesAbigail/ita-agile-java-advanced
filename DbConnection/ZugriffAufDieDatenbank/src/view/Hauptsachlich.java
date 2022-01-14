package view;

import java.util.List;

import controller.NutzerDAO;
import model.Nutzer;

public class Hauptsachlich {

	public static void main(String[] args) {

		List<Nutzer> list = NutzerDAO.alles();
		
		list.forEach(i -> System.out.println(i.toString()));
		
		Nutzer n = new Nutzer("Anne", "anne.laplace", "anne.laplace@mail.com");
		
		NutzerDAO.insert(n);
		
		list.forEach(System.out::println);

	}

}
