package Eshop.Dao;
import Eshop.Beens.*;
import java.util.*;
public class Uzivatelia {
	private List<Uzivatel> zoznamUzivatelov = new ArrayList<>();

	public Uzivatelia(List<Uzivatel> zoznamUzivatelov) {
		this.zoznamUzivatelov = zoznamUzivatelov;
	}
	public Uzivatelia(){
		
	}
		
	public void pridajUzivatela(Uzivatel uzivatel){
		zoznamUzivatelov.add(uzivatel);
	}
	public void zmazUzivatela(Uzivatel uzivatel){
		zoznamUzivatelov.remove(uzivatel);
	}
	public void zmazProdukt(int cislo){
		zoznamUzivatelov.remove(cislo);
	}

	@Override
	public String toString() {
		return "Uzivatelia [zoznamUzivatelov=" + zoznamUzivatelov + "]";
	} 
	
}
