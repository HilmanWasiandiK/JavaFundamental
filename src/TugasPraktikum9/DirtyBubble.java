package TugasPraktikum9;

public class DirtyBubble extends SuperHero {
	public DirtyBubble(int powLevel, String nameHero) {
		super(powLevel, nameHero);
		
		//Menambahkan kekuatan DirtyBubble (Kekuatan Super dan Terbang)
		Power strength = new Strength();
		Power flying = new Flying();
		super.addPower(strength);
		super.addPower(flying);
	}
	
	@Override
	public void identity() {
		System.out.println("It's " + super.getName() + " The DirtyBubble! It has power level of " + super.getPowerLevel());
		super.identity();
		super.showPowers();
	}
}

