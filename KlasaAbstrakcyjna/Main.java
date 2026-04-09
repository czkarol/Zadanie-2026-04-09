public class Main {
	public static void main(String[] args) {
		Figura kolo = new Kolo("turkusowy", 6.5);
		Figura prostokat = new Prostokat("Fioletowy", 2, 4);
		
		System.out.println("--------------- Klasa abstrakcyjna -----------------");
		System.out.println();

		wyswietlInfo(kolo);
		System.out.println();
		wyswietlInfo(prostokat);
	}

	public static void wyswietlInfo(Figura f) {
		System.out.println(f);
		System.out.println("Pole: " + f.obliczPole());
		System.out.println("Obwod: " + f.obliczObwod());
		System.out.println("Kolor: " + f.getKolor());
	}
}
