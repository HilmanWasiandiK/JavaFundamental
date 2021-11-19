package TugasPraktikum9;

public class FlyingDutchMan extends SuperHero {
	public FlyingDutchMan(int powLevel, String nameHero) {
		super(powLevel, nameHero);
		
		//Menambahkan kekuatan FLyingDutchMan (Terbang dan Mata Laser)
		Power flying = new Flying();
		Power laserEye = new LaserEye();
		super.addPower(flying);
		super.addPower(laserEye);
	}
	
	@Override
	public void identity() {
		System.out.println("It's " + super.getName() + " The FlyngDutchMan! It has power level of " + super.getPowerLevel());
		super.identity();
		super.showPowers();
	}
}
