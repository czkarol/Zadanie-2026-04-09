public class Samochod implements Pojazd, Silnikowy {
	private String nazwa;
	private int pojemnoscSilnika;
	private boolean silnikWlaczony;

	public Samochod(String nazwa, int pojemnoscSilnika, boolean silnikWlaczony) {
		this.nazwa = nazwa;
		this.pojemnoscSilnika = pojemnoscSilnika;
		this.silnikWlaczony = silnikWlaczony;
	}

	@Override
	public void jedz() {
		if (silnikWlaczony){
			System.out.println("Samochod jedzie");
		}
		else {
			System.out.println("Samochod ma wylaczony silnik");
		}
	}

	@Override
	public void zatrzymajSie() {
		System.out.println(nazwa + " hamuje");
	}

	@Override
	public String getNazwa() {
		return nazwa;
	}

	@Override
	public int getPojemnoscSilnika() {
		return pojemnoscSilnika;
	}

	@Override
	public void uruchomSilnik() {
		silnikWlaczony = true;
		System.out.println(nazwa + ": silnik uruchomiony. Pojemnosc: " + getPojemnoscSilnika() + "cm^3");
	}
}
