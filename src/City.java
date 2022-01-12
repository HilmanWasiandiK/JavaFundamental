package TugasPraktikum14;

public class City extends Thread {
	public City(String city) {
		super(city);
	}
	
	public void run() {
		String cityName = getName();
		for(int i = 1; i < 3; i++) {
			try {
				sleep(1000);
			}
			catch(InterruptedException ex) {
				ex.printStackTrace();
			}
			System.out.println("Penduduk " + i + " tiba pada kota " + cityName);
		}
	}
}
