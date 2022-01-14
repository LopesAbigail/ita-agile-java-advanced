package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

}
