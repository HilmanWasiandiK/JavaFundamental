package TugasPraktikum7_2;

public class Rectangle extends Shape {
	private double width;
	private double length;
	
	//konstruktor 1
	public Rectangle() {
		width = 1.0;
		length = 1.0;
	}
	
	//konstruktor 2
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	//konstruktor 3
	public Rectangle(double width, double length, String clr, boolean fill) {
		this.width = width;
		this.length = length;
		super.setColor(clr);
		super.setFilled(fill);
	}
	
	//mengambil value width
	public double getWidth() {
		return width;
	}
	
	//mengubah value width
	public void setWidth(double width) {
		this.width = width;
	}
	
	//mengambil value length
	public double getLength() {
		return length;
	}
	
	//mengubah value length
	public void setLength(double length) {
		this.length = length;
	}
	
	// mengambil value yang merepresentasikan luas persegi panjang
	public double getArea() {
		return length*width;
	}
	
	// mengambil value yang merepresentasikan keliling persegi panjang
	public double getPerimeter() {
		return (2*length)+(2*width);
	}
	
	@Override
	public String toString() {
		return "Rectangle["+super.toString()
			+",width="+width
			+",length="+length+"]";
	}
}
