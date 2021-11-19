package TugasPraktikum9;

import java.util.*;

public class AvengedSimulator {
	public static void main(String args[]) {
		//Membuat List kelas SuperHero serta mengisinya
		List<SuperHero> heroList = new ArrayList<SuperHero>();
		SuperHero h1 = new ManRay(0, "Gennichiro"); heroList.add(h1);
		SuperHero h2 = new FlyingDutchMan(225, "Shirai"); heroList.add(h2);
		SuperHero h3 = new ManRay(553, "Gyoubu Masataka Oniwa"); heroList.add(h3);
		SuperHero h4 = new DirtyBubble(666, "Arnastria"); heroList.add(h4);
		SuperHero h5 = new FlyingDutchMan(36556, "Tatenari"); heroList.add(h5);
		
		//Menyortir isi List kelas SuperHero. reverseOrder() agar diurutkan secara descending
		Collections.sort(heroList, Collections.reverseOrder());
		//Collections.sort(heroList); //jika method compareTo sudah me-return secara descending, maka langsung saja
		
		for(SuperHero heroes : heroList) {
			System.out.println("=============================================================");
			heroes.identity();
			System.out.println("=============================================================");
		}
	}
}
