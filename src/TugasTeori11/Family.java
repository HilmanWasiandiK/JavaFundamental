package TugasTeori11;

import java.util.*;

public class Family {
	//menggunakan set karena tidak dibutuhkan data duplikat
	private Set<Uncle> uncles;
	private Set<Niece> nieces;
	
	Family() {
		uncles = new HashSet<Uncle>();
		nieces = new HashSet<Niece>();
	}
	
	public boolean addNiece(String name, int day, int month) {		
		if(this.findNiece(name) == null) {
			Niece niece = new Niece();
			niece.setNieceData(name, day, month);
			nieces.add(niece);
			return true;
		}
		System.out.println("Data Keponakan tersebut sudah ada!");
		return false;
	}
	
	public boolean addUncle(String name) {
		if(this.findUncle(name) == null) {
			Uncle uncle = new Uncle();
			uncle.setDataUncle(name);
			uncles.add(uncle);
			return true;
		}
		System.out.println("Data paman tersebut sudah ada!");
		return false;
	}
	
	public Niece findNiece(String name) {
		if(!nieces.isEmpty()) {
			Iterator<Niece> iterator = nieces.iterator();
			while(iterator.hasNext()) {
				Niece niece = iterator.next();
				if(niece.getName().equals(name)) {
					return niece;
				}
			}
		}
		return null;
	}
	
	public Uncle findUncle(String name) {
		if(!uncles.isEmpty()) {
			Iterator<Uncle> iterator = uncles.iterator();
			while(iterator.hasNext()) {
				Uncle uncle = iterator.next();
				if(uncle.getName().equals(name)) {
					return uncle;
				}
			}
		}
		return null;
	}
	
	public void listNieces() {
		TreeSet<Niece> sortedNieces = new TreeSet<Niece>(nieces);
		if(sortedNieces.isEmpty()) {
			System.out.println("Belum ada data keponakan perempuan");
		}
		else {
			System.out.println(sortedNieces);
		}
	}
	
	public void listUncles() {
		TreeSet<Uncle> sortedUncles = new TreeSet<Uncle>(uncles);
		if(sortedUncles.isEmpty()) {
			System.out.println("Belum ada data paman");
		}
		else {
			System.out.println(sortedUncles);
		}
	}
}
