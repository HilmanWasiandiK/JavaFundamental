package TugasPraktikum6;

public class Aggregation {
	public static void main(String[] args) {
		Cinema c1 = new Cinema(173, "Plex Megablitz", "Bandung");
		Cinema c2 = new Cinema(31, "XIX", "Jakarta");
		
		Movie m1 = new Movie(1, "The King of The Sea");
		Movie m2 = new Movie(2, "Fire Fist");
		Movie m3 = new Movie(3, "Celestial Dragon");
		Movie m4 = new Movie(4, "Truth of Void Century");
		Movie m5 = new Movie(5, "Law");
		Movie m6 = new Movie(6, "Surgeon of Death");
		Movie m7 = new Movie(7, "Conqueror");
		
		c1.setMovieList(m1);
		c1.setMovieList(m3);
		c1.setMovieList(m5);
		c1.setMovieList(m7);
		
		c2.setMovieList(m2);
		c2.setMovieList(m3);
		c2.setMovieList(m4);
		c2.setMovieList(m5);
		c2.setMovieList(m6);
		
		System.out.println("===============Info Cinema 1===============");
		c1.getInfo();
		System.out.println("\n\n===============Info Cinema 2===============");
		c2.getInfo();
	}
}

class Cinema {
	private int count;
	private int cinemaID;
	private String cinemaName;
	private String cinemaLocation;
	private Movie m[];
	
	public Cinema(int ID, String Name, String Loc) {
		count = 0;
		cinemaID = ID;
		cinemaName = Name;
		cinemaLocation = Loc;
		m = new Movie[7];
	}
	
	public void setMovieList(Movie mov) {
		m[count] = mov;
		count++;
	}
	
	public void getInfo() {
		System.out.println("Cinema ID : "+cinemaID);
		System.out.println("Cinema Name : "+cinemaName);
		System.out.println("Cinema Location (city) : "+cinemaLocation);
		System.out.println("\nList Movie yang tersedia :");
		for(int i = 0; i < count; i++) {
			m[i].getInfo();
		}
	}
}

class Movie {
	private int movieID;
	private String movieName;
	
	public Movie(int ID, String Name) {
		movieID = ID;
		movieName = Name;
	}
	
	public void getInfo() {
		System.out.println("  -(ID:"+movieID+") "+movieName);
	}
}
