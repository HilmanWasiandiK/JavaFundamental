package TugasPraktikum6;

public class Dependence {

	public static void main(String[] args) {
		Hero H = new Hero("Hyakkujugo", 75, 75);
		Condition cond = new Condition();
		H.getInfo();
		H.checkHeroCondition(cond);
		
	}

}

class Hero {
	private String heroName;
	private int heroPower;
	private int heroStamina;
	
	public Hero(String Name, int Power, int Stamina) {
		heroName = Name;
		heroPower = Power;
		heroStamina = Stamina;
	}
	
	public void getInfo() {
		System.out.println("Nama Hero     : "+heroName);
		System.out.println("Kekuatan Hero : "+heroPower);
		System.out.println("Stamina Hero  : "+heroStamina);
	}
	
	public void checkHeroCondition(Condition c) {
		System.out.print("Kondisi Hero  : "); 
		if(heroStamina < 50) {
			c.condBad();
		}
		else {
			c.condGood();
		}
	}
}

class Condition {
	public void condBad() {
		System.out.println("Kondisi hero kurang baik!");
	}
	
	public void condGood() {
		System.out.println("Hero dalam kondisi prima!");
	}
}