public abstract class Figura {
	private String kolor;

	public Figura(String kolor) {
		this.kolor = kolor;
	}

	public abstract double obliczPole();
	public abstract double obliczObwod();

	public String getKolor() {
		return kolor;
	}

	@Override
	public String toString(){
		return "Figura[kolor=" + kolor + "]";
	}
}
