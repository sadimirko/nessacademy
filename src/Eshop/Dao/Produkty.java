package Eshop.Dao;
import Eshop.Beens.*;
import java.util.*;

public class Produkty {
	private List<Produkt> zoznamProduktov = new ArrayList<>();

	public Produkty(){
		
	}
	public Produkty(List<Produkt> zoznamProduktov) {
		this.zoznamProduktov = zoznamProduktov;
	}
	
	public void pridajProdukt(Produkt produkt){
		zoznamProduktov.add(produkt);
	}
	public void zmazProdukt(Produkt produkt){
		zoznamProduktov.remove(produkt);
	}
	public void zmazProdukt(int cislo){
		zoznamProduktov.remove(cislo);
	}
	public Produkt vyberProdukt(int i){
		return zoznamProduktov.get(i);
	}
	

	@Override
	public String toString() {
		return "Produkty [" + zoznamProduktov + "]";
	}
		
}
