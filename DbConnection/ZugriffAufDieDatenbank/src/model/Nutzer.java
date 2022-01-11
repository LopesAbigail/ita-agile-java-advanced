package model;

public class Nutzer {
	
	private String name;
	private String anmeldung;
	private String email;
	
	public Nutzer(String name, String anmeldung, String email) {
		this.name = name;
		this.anmeldung = anmeldung;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAnmeldung() {
		return anmeldung;
	}
	
	public void setAnmeldung(String anmeldung) {
		this.anmeldung = anmeldung;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Nutzer [name=" + name + ", anmeldung=" + anmeldung + ", email=" + email + "]";
	}

}
