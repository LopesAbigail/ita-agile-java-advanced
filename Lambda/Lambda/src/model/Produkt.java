package model;

public class Produkt {
	
	private String name;
	private int wert;
	
	public Produkt(String name, int wert) {
		super();
		this.name = name;
		this.wert = wert;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWert() {
		return wert;
	}

	public void setWert(int wert) {
		this.wert = wert;
	}

}
