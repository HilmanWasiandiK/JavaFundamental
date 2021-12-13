package TugasTeori11;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		Family fam = new Family();
		List<Niece> nieces = new ArrayList<Niece>();
		List<Uncle> uncles =  new ArrayList<Uncle>();
		
		System.out.println("======KETIKA BELUM ADA DATA PAMAN DAN KEPONAKAN======");
		System.out.print("KEPONAKAN	: " ); fam.listNieces();
		System.out.print("PAMAN		: " ); fam.listUncles();
		System.out.println("=====================================================\n");

		System.out.println("======KETIKA SUDAH ADA DATA PAMAN DAN KEPONAKAN======");
		fam.addNiece("Aisyah", 15, 11);
		fam.addNiece("Syifa", 9, 1);
		
		fam.addUncle("Albert");
		fam.addUncle("John");
		fam.addUncle("Bob");
		
		System.out.print("KEPONAKAN (by birth date)	: " ); fam.listNieces();
		System.out.print("PAMAN (by name)			: " ); fam.listUncles();
		System.out.println("=====================================================\n");
		
		System.out.println("======KETIKA BELUM ADA DATA HADIAH YANG DIBERI=======");
		Niece niece1 = fam.findNiece("Syifa");
		Niece niece2 = fam.findNiece("Aisyah");
		Uncle uncle1 = fam.findUncle("Albert");
		Uncle uncle2 = fam.findUncle("Bob");
		Uncle uncle3 = fam.findUncle("John");
		
		nieces.add(niece1); nieces.add(niece2);
		uncles.add(uncle1); uncles.add(uncle2); uncles.add(uncle3);
		
		System.out.println("[LIST HADIAH KEPONAKAN]");
		for(int i = 0; i <nieces.size(); i++) {
			nieces.get(i).listPresents();
		}
		System.out.print("\n");
		System.out.println("[LIST HADIAH PAMAN]");
		for(int i = 0; i < uncles.size(); i++) {
			uncles.get(i).listPresents();
		}
		System.out.println("=====================================================\n");
		
		System.out.println("======KETIKA SUDAH ADA DATA HADIAH YANG DIBERI=======");
		System.out.println("percobaan hadiah yang sama untuk keponakan berbeda");
		uncle1.addPresent(niece1, "notebook");
		uncle1.addPresent(niece2, "notebook");
		
		System.out.println("\npercobaan hadiah yang sudah diberikan oleh paman lain");
		uncle2.addPresent(niece1, "notebook");
		
		System.out.println("\npercobaan hadiah yang beda untuk keponakan berbeda");
		uncle2.addPresent(niece1, "novel");
		uncle2.addPresent(niece2, "earphone");
		
		System.out.println("\npercobaan mengubah hadiah yang akan diberikan");
		uncle2.addPresent(niece1, "pulpen");
		
		System.out.println("\npercobaan tidak memberikan hadiah");
		uncle3.addPresent(niece1, null);		
		uncle1.addPresent(niece2, null);
		
		System.out.println("\nmengisi sisanya");
		uncle3.addPresent(niece2, "tupperwear");
		
		
		System.out.print("\n");
		System.out.println("[LIST HADIAH KEPONAKAN]");
		for(int i = 0; i <nieces.size(); i++) {
			nieces.get(i).listPresents();
		}
		System.out.print("\n");
		System.out.println("[LIST HADIAH PAMAN]");
		for(int i = 0; i < uncles.size(); i++) {
			uncles.get(i).listPresents();
		}
		System.out.println("=====================================================\n");
		
		System.out.println("========MENGHAPUS HADIAH DARI LIST KEPONAKAN=========");
		System.out.println("percobaan menghapus hadiah dari list Aisyah");
		niece2.clearPresents();
		
		System.out.print("\n");
		System.out.println("[LIST HADIAH KEPONAKAN]");
		for(int i = 0; i <nieces.size(); i++) {
			nieces.get(i).listPresents();
		}
		System.out.print("\n");
		System.out.println("[LIST HADIAH PAMAN]");
		for(int i = 0; i < uncles.size(); i++) {
			uncles.get(i).listPresents();
		}
	}
}
