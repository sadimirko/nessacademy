package Eshop.Controler;
import Eshop.Dao.*;
import Eshop.Beens.*;
import java.util.*;

public class OrderControler {
	private static final Scanner sc = new Scanner(System.in);
	private Objednavky zoznamObjednavok = new Objednavky();
	private  Produkty zoznamProduktov = new Produkty();
	private int k = 0;
	private Uzivatel zakaznik ; 
	
	public void pridajOb() {
	
		List <Produkt> objednane = new ArrayList<Produkt>();		
		System.out.println();
		Integer znak = 99;
		while (znak != (0)){
			System.out.println("*---Vyber produkt ktory chces pridat do objednavky---* ");
			System.out.println();
			System.out.println(zoznamProduktov.toString());
			System.out.println("Zadaj cislo produktu");
			znak = sc.nextInt();
			objednane.add(zoznamProduktov.vyberProdukt(znak));
			System.out.println("chces pridat dalsi  ak nie stlac 0");
			znak = sc.nextInt();
		}
		Objednavka nova = new Objednavka(k++, objednane, false, zakaznik);
		zoznamObjednavok.pridajObjednavku(nova);
	}
}
