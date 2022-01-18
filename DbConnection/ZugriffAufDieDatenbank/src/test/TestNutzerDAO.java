package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controller.NutzerDAO;
import model.Nutzer;

class TestNutzerDAO {
	
	JdbcDatabaseTester jdt;

	@BeforeEach
	void setUp() throws Exception {
		jdt = new JdbcDatabaseTester("org.postgresql.Driver", "jdbc:postgresql://localhost/usuarios", "postgres", "postgres");
		FlatXmlDataFileLoader loader = new FlatXmlDataFileLoader();
		jdt.setDataSet(loader.load("/init.xml"));
		
		jdt.onSetup();
	}

	@Test
	void recoverAlles() {
		List<Nutzer> list = NutzerDAO.alles();
		
		assertEquals(2, list.size());
		assertEquals("Johannes", list.get(0).getName());
	}
	
	@Test
	void insertNutzer() {
		Nutzer n = new Nutzer("Weiga", "weiga.rosbife", "weiga.rosbife@mail.com");
		NutzerDAO.insert(n);
		
		List<Nutzer> list = NutzerDAO.alles();
		
		assertEquals(3, list.size());
		assertEquals("Weiga", list.get(2).getName());
	}
	
	@Test
	void insertNewNutzer() throws Exception {
		Nutzer n = new Nutzer("Benjamin", "benjamin.roterdan", "benjamin.roterdan@mail.com");
		NutzerDAO.insert(n);
		
		IDataSet currentDataSet = jdt.getConnection().createDataSet();
		ITable currentTable = currentDataSet.getTable("USUARIO");
		
		FlatXmlDataFileLoader loader = new FlatXmlDataFileLoader();
		IDataSet expectedDataSet = jdt.setDataSet(loader.load("/verify.xml"));
		ITable expectedTable = expectedDataSet.getTable("USUARIO");
		
		assertEquals(expectedTable, currentTable);
	}

}
