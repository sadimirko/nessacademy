package Eshop.Dao;
import Eshop.Beens.*;
import java.util.*;
public class Objednavky {
	private List<Objednavka> zoznamObjednavok = new ArrayList<>();

	public Objednavky(List<Objednavka> zoznamObjednavok) {
		this.zoznamObjednavok = zoznamObjednavok;
	}
	public Objednavky(){
		
	}
		
	public void pridajObjednavku(Objednavka objednavka){
		zoznamObjednavok.add(objednavka);
	}
	public void zmazObjednavku(Objednavka objednavka){
		zoznamObjednavok.remove(objednavka);
	}
	public void zmazObjednavku(int cislo){
		zoznamObjednavok.remove(cislo);
	}
	
	@Override
	public String toString() {
		return "Objednavky [" + zoznamObjednavok + "]";
	} 
}
