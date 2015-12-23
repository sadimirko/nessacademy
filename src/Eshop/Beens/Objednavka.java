package Eshop.Beens;

import java.util.*;

public class Objednavka {
	private int cisloObjednavky;
	private List<Produkt> zoznamProduktov = new ArrayList<>();
	private double celkovaCena = 0;
	private boolean zaplatena = false;
	private Uzivatel zakaznik ;
	
	public Objednavka(int cisloObjednavky, List<Produkt> zoznamProduktov, boolean zaplatena,
			Uzivatel zakaznik) {
		this.cisloObjednavky = cisloObjednavky;
		this.zoznamProduktov = zoznamProduktov;
		this.zaplatena = zaplatena;
		this.zakaznik = zakaznik;
	}

	public int getCisloObjednavky() {
		return cisloObjednavky;
	}

	public void setCisloObjednavky(int cisloObjednavky) {
		this.cisloObjednavky = cisloObjednavky;
	}

	public List<Produkt> getZoznamProduktov() {
		return zoznamProduktov;
	}

	public void setZoznamProduktov(List<Produkt> zoznamProduktov) {
		this.zoznamProduktov = zoznamProduktov;
	}

	public double getCelkovaCena() {
		return celkovaCena;
	}

	public void setCelkovaCena(double celkovaCena) {
		this.celkovaCena = celkovaCena;
	}

	public boolean isZaplatena() {
		return zaplatena;
	}

	public void setZaplatena(boolean zaplatena) {
		this.zaplatena = zaplatena;
	}

	public Uzivatel getZakaznik() {
		return zakaznik;
	}

	public void setZakaznik(Uzivatel zakaznik) {
		this.zakaznik = zakaznik;
	}

	@Override
	public String toString() {
		return "Objednavka [cisloObjednavky=" + cisloObjednavky + ", zoznamProduktov=" + zoznamProduktov
				+ ", celkovaCena=" + celkovaCena + ", zaplatena=" + zaplatena + ", zakaznik=" + zakaznik + "]";
	}
	
	
}
