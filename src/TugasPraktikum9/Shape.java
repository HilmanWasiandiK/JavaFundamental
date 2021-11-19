package TugasPraktikum9;

abstract class Shape {
	private String shapeName;
	
	public Shape(String sName) {
		shapeName = sName;
	}
	
	public abstract double area();
	
	public String toString() {
		return "shape = " + shapeName;
	}
}
