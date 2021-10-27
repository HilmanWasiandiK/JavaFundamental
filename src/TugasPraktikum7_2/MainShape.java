package TugasPraktikum7_2;

public class MainShape {

	public static void main(String[] args) {
		//atribut
		String color = "Biru Muda";
		boolean filled = true;
		
		//pembuatan instansi class sesuai konstruktor yang tersedia
		Shape sh = new Shape();
		Circle c1 = new Circle();
		Circle c2 = new Circle(10.0);
		Circle c3 = new Circle(10.0, color, filled);
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(3.0, 4.0);
		Rectangle r3 = new Rectangle(3.0, 4.0, color, filled);
		Square s1 = new Square();
		Square s2 = new Square(3.0);
		Square s3 = new Square(3.0, color, filled);
		
		//menampilkan data setiap instansi class
		System.out.println("=====SHAPE=====");
		System.out.println(sh.toString());
		System.out.println("\n=====CIRCLE=====");
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println("\n=====RECTANGLE=====");
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r3.toString());
		System.out.println("\n=====SQUARE=====");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}

}
