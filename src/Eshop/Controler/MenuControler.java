package Eshop.Controler;

import java.util.Locale;
import java.util.Scanner;

public class MenuControler {
	private static final Scanner sc = new Scanner(System.in);
	private ProductControler products = new ProductControler();
	
	public void run() {
		System.out.println("Welcome in our Eshop");
		sc.useLocale(Locale.US);
		String znak = new String();
		//Eshop.menu();
		menu();
		while (!znak.equals("0")) {
			System.out.println("************************************************");
			znak = sc.nextLine();
			switch (znak) {
			case "1":
				System.out.println("*--- Produkty---*");
				//System.out.println(zoznamProduktov.toString());
				products.listProducts();
				break;
			case "2":
				System.out.println("*--- Pridanie produktu---*");
				//pridajPr();
				//System.out.println(zoznamProduktov.toString());
				break;
			case "3":
				System.out.println("*--- Zmazanie produktu---*");
				//ZmazPr();
				//System.out.println(zoznamProduktov.toString());
				break;
			case "4":
				System.out.println("*--- Objednavky ---*");
				//System.out.println(zoznamObjednavok.toString());
				break;
			case "5":
				System.out.println("*--- Pridanie objednavky ---*");
				//pridajOb();
				//System.out.println(zoznamObjednavok.toString());
				break;
			case "6":
				System.out.println("*--- Vypisanie uzivatelov ---*");
				//System.out.println(zoznamUzivatelov.toString());
				break;
			case "7":
				System.out.println("*--- pridaj uzivatela ---*");
				//pridajUz();
				//System.out.println(zoznamUzivatelov.toString());
				break;		
			case "9":
				menu();
				break;		
			default:
				System.out.println("Zadaj znova.");
				break;
			}	
		}
		System.out.println("*---Dovidenia.---*");
	}
	public void menu(){
		System.out.println();
		System.out.println("*****************   MENU   *********************");
		System.out.println("Stlacte 1 - vypisanie produktov");
		System.out.println("Stlacte 2 - pridanie produktu");
		System.out.println("Stlacte 3 - zmazanie produktu");
		System.out.println("Stlacte 4 - vypisanie objednavok");
		System.out.println("Stlacte 5 - pridanie objednavky");
		System.out.println("Stlacte 6 - vypisanie uzivatelov");
		System.out.println("Stlacte 7 - pridaj uzivatela");
		System.out.println("Stlacte 9 - zobrazenie Menu");
		System.out.println("Ak chcete skoncit stlacte 0.");
	}
}
