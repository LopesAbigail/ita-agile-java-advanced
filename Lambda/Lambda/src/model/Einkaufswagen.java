package model;

import java.util.List;

import integration.Kondition;

public class Einkaufswagen {
	
	private List<Produkt> produktList;
	
	public Einkaufswagen(List<Produkt> list) {
		this.produktList = list;
	}
	
	public void rabatt(int prozentsatz, Kondition<Produkt> kondition) {
		produktList.forEach(p -> {
			if(kondition.enthalten(p)) {
				p.setWert(p.getWert()*(100-prozentsatz)/100);
			}
		});
	}

	public List<Produkt> getProduktList() {
		return produktList;
	}

	public void setProduktList(List<Produkt> produktList) {
		this.produktList = produktList;
	}
	
	

}
