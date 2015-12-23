package Eshop.Beens;

public class Produkt {
	private int cisloProduktu;
	private String nazov = "Nazov produktu";
	private String popis = "Popis produktu";
	private double cena = 0;
	
	public Produkt(){}
	
	public Produkt(int cisloProduktu,String nazov,String popis,double cena){
		this.cisloProduktu = cisloProduktu;
		this.nazov = nazov;
		this.popis = popis;
		this.cena = cena;
	}
	
	public int getCisloProduktu() {
		return cisloProduktu;
	}

	public void setCisloProduktu(int cisloProduktu) {
		this.cisloProduktu = cisloProduktu;
	}

	public String getNazov() {
		return nazov;
	}
	public void setNazov(String nazov) {
		this.nazov = nazov;
	}
	public String getPopis() {
		return popis;
	}
	public void setPopis(String popis) {
		this.popis = popis;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}

	@Override
	public String toString() {
		return "[id:" + cisloProduktu + ", nazov=" + nazov + ", popis=" + popis + ", cena=" + cena
				+ "]";
	}
	
}
