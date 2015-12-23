package Eshop.Beens;


public class Uzivatel {
	private int cisloUzivatela;
	private String meno = "Meno Uzivatela";
	private String priezvisko = "Priezvisko Uzivatela";
	private boolean admin = false;
	private String login = "login";
	private String heslo = "heslo";
	
	public Uzivatel(){
	}
	public Uzivatel(int cisloUzivatela,String meno, String priezvisko, boolean admin) {
		this.cisloUzivatela = cisloUzivatela;
		this.meno = meno;
		this.priezvisko = priezvisko;
		this.admin = admin;
	}

	public Uzivatel(int cisloUzivatela, String meno, String priezvisko, boolean admin, String login, String heslo) {
		super();
		this.cisloUzivatela = cisloUzivatela;
		this.meno = meno;
		this.priezvisko = priezvisko;
		this.admin = admin;
		this.login = login;
		this.heslo = heslo;
	}
	public int getCisloUzivatela() {
		return cisloUzivatela;
	}
	public void setCisloUzivatela(int cisloUzivatela) {
		this.cisloUzivatela = cisloUzivatela;
	}
	public String getMeno() {
		return meno;
	}
	public void setMeno(String meno) {
		this.meno = meno;
	}
	public String getPriezvisko() {
		return priezvisko;
	}
	public void setPriezvisko(String priezvisko) {
		this.priezvisko = priezvisko;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getHeslo() {
		return heslo;
	}
	public void setHeslo(String heslo) {
		this.heslo = heslo;
	}
	@Override
	public String toString() {
		return "[cislo=" + cisloUzivatela + ", meno=" + meno + ", priezvisko=" + priezvisko
				+ ", admin=" + admin + "]";
	}
}
