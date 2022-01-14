package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Nutzer;

public class NutzerDAO {

	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static List<Nutzer> alles() throws RuntimeException {
		List<Nutzer> allesBenutzer = new ArrayList<>();
		
		try (Connection c = DriverManager.getConnection(
				"jdbc:postgresql://localhost/usuarios", "postgres", "postgres")){
			
			String sql = "SELECT * FROM usuario";
			
			PreparedStatement stm = c.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			
			while(rs.next()) {
				Nutzer user = new Nutzer(rs.getString("nome"), rs.getString("login"), rs.getString("email"));
				
				allesBenutzer.add(user);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Beim Verbindungsaufbau ist ein Fehler aufgetreten!", e);
		}
		
		return allesBenutzer;
	}
	
	public static void insert (Nutzer n) {
		
		try (Connection c = DriverManager.getConnection(
				"jdbc:postgresql://localhost/usuarios", "postgres", "postgres")){
			
			String sql = "INSERT INTO public.usuario(login, nome, email) VALUES (?, ?, ?)";
			
			PreparedStatement stm = c.prepareStatement(sql);
			stm.setString(1, n.getAnmeldung());
			stm.setString(2, n.getName());
			stm.setString(3, n.getEmail());

			stm.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Beim Verbindungsaufbau ist ein Fehler aufgetreten!", e);
		}
	}
	
}
