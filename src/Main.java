package TugasPraktikum14;

public class Main {
	public static void main(String[] args) {
		City c1 = new City("Bandung");
		City c2 = new City("Jakarta");
		City c3 = new City("Yogyakarta");
		
		c1.start();
//		try {
//			c1.join();
//		}
//		catch(InterruptedException ex) {
//			ex.printStackTrace();
//		}
		
		c2.start();
//		try {
//			c2.join();
//		}
//		catch(InterruptedException ex) {
//			ex.printStackTrace();
//		}
		
		c3.start();
	}
}
