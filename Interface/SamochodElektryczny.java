public class SamochodElektryczny implements Pojazd, Elektryczny {
	private String nazwa;
	private int poziomNaladowania;

	public SamochodElektryczny(String nazwa, int poziomNaladowania) {
		this.nazwa = nazwa;
		this.poziomNaladowania = poziomNaladowania;
	}

	@Override
	public void jedz() {
		if(poziomNaladowania > 0) {
			System.out.println(nazwa + " jedzie. Bateria: " + poziomNaladowania + "%");
			poziomNaladowania -= 10;
		}
		else {
			System.out.println(nazwa + " bateria rozladowana");
		}
	}
}
