package TugasPraktikum7_2;

public class Square extends Rectangle {
	//konstruktor 1
	public Square() {
		super();
	}
	
	//konstruktor 2
	public Square(double side) {
		super(side, side);
	}
	
	//konstruktor 3
	public Square(double side, String clr, boolean fill) {
		super(side, side, clr, fill);
	}
	
	//mengambil value sisi persegi (width/length)
	public double getSide() {
		return super.getLength();
	}
	
	//mengubah value sisi persegi
	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	@Override
	//mengubah value width (length harus juga karena persegi)
	public void setWidth(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	@Override
	//mengubah value length (width harus juga karena persegi)
	public void setLength(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	@Override
	public String toString() {
		return "Square["+super.toString()+"]";
	}
}
