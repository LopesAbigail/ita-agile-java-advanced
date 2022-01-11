package view;

import java.util.List;

import controller.NutzerDAO;
import model.Nutzer;

public class Hauptsachlich {

	public static void main(String[] args) {

		List<Nutzer> list = NutzerDAO.alles();
		
		list.forEach(System.out::println);

	}

}
