package TugasPraktikum9;

import java.util.*;

abstract class SuperHero implements Comparable<SuperHero> {
	private int powerLevel;
	private String name;
	private List<Power> powerList;
	
	public SuperHero(int powLevel, String nameHero) {
		powerLevel = powLevel;
		name = nameHero;
		powerList = new ArrayList<Power>();
	}
	
	public int getPowerLevel() {
		return powerLevel;
	}
	
	public String getName() {
		return name;
	}
	
	public void addPower(Power power) {
		powerList.add(power);
	}
	
	public void identity() {
		System.out.println(".....HEED ME.....");
		System.out.println("FOR MY NAAAAAAAME IS " + name.toUpperCase());
	}
	
	public void showPowers() {
		System.out.println("TIME TO SHOW YOU MY POWERS");
		for(Power pow : powerList) {
			pow.doPower();
		}
	}
	
	//method untung menbandingkan powerLevel objek dari kelas SuperHero
	public int compareTo(SuperHero hero) {
		return powerLevel - hero.powerLevel;   //untuk return secara ascending
		//return hero.powerLevel - powerLevel; //untuk return secara descending
	}
}
