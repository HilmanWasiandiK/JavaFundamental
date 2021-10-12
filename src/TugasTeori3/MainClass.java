package TugasTeori3;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Hero H = new Hero(); //DEPENDENCY RELATIONSHIP
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Masukkan Nama Pahlawan : ");
		H.setName(scan.next());
		System.out.print("Masukkan Kekuatan Pahlawan : ");
		H.setPower(scan.nextInt());
		System.out.print("\nkondisi Pahlawan : ");
		System.out.println(H.getCon(H.getPower()));;
		System.out.println(H.getName() + "(power = " + H.getPower() + ") : " + H.getConSay(0));
	}
}

class Human {
	private String name;
	private int power;
	Condition con = new Condition(); //AGGREGATION RELATIONSHIP
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getCon(int pwr) {
		return con.HeroCon(pwr);
	}
	public String getConSay(int pwr) {
		return con.HeroConSay(pwr);
	}
	public String getName() {
		return this.name;
	}
	public int getPower() {
		return this.power;
	}
}

class Hero extends Human { //INHERITANCE RELATIONSHIP
	Hero() {
		System.out.println("Pahlawan Manusia Telah Diciptakan!");
	}
}

class Condition {
	public String HeroCon(int power) {
		if (power < 50) {
			return "Rentan";
		}
		else if (power == 50) {
			return "Normal";
		}
		else {
			return "Tangguh";
		}
	}
	public String HeroConSay(int power) {
		if (power < 50) {
			return "cciatt!";
		}
		else if (power == 50) {
			return "hiiyaa!";
		}
		else {
			return "rrawrr!";
		}
	}
}
