public class Prostokat extends Figura {
	private double szerokosc;
	private double wysokosc;

	public Prostokat(String kolor, double szerokosc, double wysokosc) {
		super(kolor);
		this.szerokosc = szerokosc;
		this.wysokosc = wysokosc;
	}

	@Override
	public double obliczPole() {
		return wysokosc * szerokosc;
	}

	@Override
	public double obliczObwod() {
		return (2 * szerokosc) + (2 * wysokosc);
	}

	@Override
	public String toString() {
		return "Prostokat[" + szerokosc + "x" + wysokosc + ", kolor=" + getKolor() + "]";
	}
}
