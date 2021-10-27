package TugasPraktikum7_2;

public class Circle extends Shape {
	private double radius;
	
	//konstruktor 1
	public Circle() {
		radius = 1.0;
	}
	
	//konstruktor 2
	public Circle(double rad) {
		radius = rad;
	}
	
	//konstruktor 3
	public Circle(double rad, String clr, boolean fill) {
		radius = rad;
		super.setColor(clr);
		super.setFilled(fill);
	}
	
	//mengambil value radius
	public double getRadius() {
		return radius;
	}
	
	//mengubah value radius
	public void setRadius(double rad) {
		radius = rad;
	}
	
	//mengambil value yang merepresentasikan luas lingkaran
	public double getArea() {
		return radius*radius*Math.PI; 
	}
	
	//mengambil value yang merepresentasikan keliling lingkaran
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	@Override
	public String toString() {
		return "Cirlce["+super.toString()+",radius="+radius+"]";
	}
}
