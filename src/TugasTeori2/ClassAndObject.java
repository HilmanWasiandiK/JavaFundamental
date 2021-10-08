package TugasTeori2;
import java.util.Scanner;

class Hero {
	private String Hname;
	private int Hpower;
	private String Hsay = "cciaaat!";
	
	public void setName(String name) {
		Hname = name;
	}
	public void setPower(int power) {
		Hpower = power;
	}
	public String getName() {
		return Hname;
	}
	public int getPower() {
		return Hpower;
	}
	public String getSay() {
		return Hsay;
	}
	public void setResult(int Mpower) {
		if(Hpower < Mpower) {
			Hsay = "=(";
		}
		else if(Hpower == Mpower) {
			Hsay = "=|";
		}
		else {
			Hsay = "=)";
		}
	}
}

class Monster{
	private String Mname;
	private int Mpower;
	private String Msay;
	
	public Monster() {
		Mname = "Monster";
		Mpower = 50;
		Msay = "rraawwwr!";
	}
	public String getName() {
		return Mname;
	}
	public int getPower() {
		return Mpower;
	}
	public String getSay() {
		return Msay;
	}
	public void setResult(int Hpower) {
		if(Hpower < Mpower) {
			Msay = "=)";
		}
		else if(Hpower == Mpower) {
			Msay = "=|";
		}
		else {
			Msay = "=(";
		}
	}
}

public class ClassAndObject {
	public static void main(String[] args) {
		Hero H = new Hero();
		Monster M = new Monster();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Masukkan Nama Hero : ");
		H.setName(scan.next());
		System.out.print("Masukkan Kekuatan Hero : ");
		H.setPower(scan.nextInt());
		
		System.out.println("\nHERO TELAH TIBA!!");
		System.out.println(H.getName() + ": " + H.getSay());
		System.out.println("MONSTER TELAH TIBA!!");
		System.out.println(M.getName() + ": " + M.getSay());
		
		System.out.println("\nPERTARUNGAN DIMULAI!!");
		System.out.println("Kekuatan Hero = " + H.getPower());
		System.out.println(H.getName() + ": " + H.getSay());
		System.out.println("Kekuatan Monster = " + M.getPower());
		System.out.println(M.getName() + ": " + M.getSay());
		
		System.out.println("\nPERTARUNGAN SELESAI!! PEMENANG SELALU TERSENYUM PADA AKHIRNYA!!");
		H.setResult(M.getPower());
		M.setResult(H.getPower());
		System.out.println(H.getName() + ": " + H.getSay());
		System.out.println(M.getName() + ": " + M.getSay());
		if(H.getPower() > M.getPower()) {
			System.out.println("HERO PEMENANGNYA!!");
		}
		else if(H.getPower() == M.getPower()) {
			System.out.println("TIDAK ADA PEMENANGNYA!!");
		}
		else if(H.getPower() < M.getPower()) {
			System.out.println("MONSTER PEMENANGNYA!!");
		}
	}
}
