package Eshop.Controler;
import Eshop.Dao.*;
import java.util.Scanner;
import Eshop.Beens.*;

public class ProductControler {
	private  Produkty zoznamProduktov = new Produkty();
	private int i = 0;
	private static final Scanner sc = new Scanner(System.in);
	
	public  void pridajPr() {
		String nazov;
		String popis;
		double cena;
		System.out.println("Zadaj nazov produktu");
		nazov = sc.nextLine();
		System.out.println("Zadaj popis produktu");
		popis = sc.nextLine();
		System.out.println("Zadaj cenu produktu");
		cena = sc.nextDouble();
		Produkt produkt = new Produkt(i++, nazov, popis, cena);
		zoznamProduktov.pridajProdukt(produkt);
	}
	public void zmazPr() {
		int znak;
		System.out.println("*---Vyber produkt ktory chces zmazat---* ");
		System.out.println();
		System.out.println(zoznamProduktov.toString());
		System.out.println("Zadaj cislo produktu ktory chces zmazat");
		znak = sc.nextInt();
		zoznamProduktov.zmazProdukt(znak);
		System.out.println("Produkt cislo "+znak+"bol zmazany");
	}
	public void listProducts(){
		zoznamProduktov.toString();
	}

}
