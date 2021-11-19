package TugasPraktikum9;

public class ManRay extends SuperHero {
	public ManRay(int powLevel, String nameHero) {
		super(powLevel, nameHero);
		
		//Menambahkan kekuatan ManRay (Mata Laser dan Kekuatan Super)
		Power laserEye = new LaserEye();
		Power strength = new Strength();
		super.addPower(laserEye);
		super.addPower(strength);
	}
	
	@Override
	public void identity() {
		System.out.println("It's " + super.getName() + " The ManRay! It has power level of " + super.getPowerLevel());
		super.identity();
		super.showPowers();
	}
}

