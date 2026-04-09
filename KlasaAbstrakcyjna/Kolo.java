public class Kolo extends Figura {
	private double promien;

	public Kolo(String kolor, double promien) {
		super(kolor);
		this.promien = promien;
	}

	@Override
	public double obliczPole() {
		return Math.PI * promien * promien;
	}

	@Override
	public double obliczObwod() {
		return 2 * Math.PI * promien;
	}

	public double getPromien() {
		return promien;
	}

	@Override
	public String toString() {
		return "Kolo[kolor=" + getKolor() + ", promien=" + getPromien() + "]";
	}
}
