package TugasPraktikum7_2;

public class Shape {
	private String color;
	private boolean filled;
	
	public Shape() {
		color = "red";
		filled = true;
	}
	
	public Shape(String clr, boolean fill) {
		color = clr;
		filled = fill;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String clr) {
		color = clr;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean fill) {
		filled = fill;
	}
	
	public String toString() {
		return "Shape[color="+color+",filled="+filled;
	}
}