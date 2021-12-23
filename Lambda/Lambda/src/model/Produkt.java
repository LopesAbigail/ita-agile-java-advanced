package model;

public class Produkt {
	
	private String name;
	private int wert;
	
	public Produkt(String name, int wert) {
		super();
		this.name = name;
		this.wert = wert;
	}
	
	public void rabatt() {
		int prozentsatz = 10;
		wert = wert*(1+(prozentsatz/100));
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

	@Override
	public String toString() {
		return "Produkt [name=" + name + ", wert=" + wert + "]";
	}

}
