package TugasPraktikum4;

class KelasSatu{
	//INITIALIZER BLOCK
	{
		System.out.println(11);
	}
	//STATIC BLOCK
	static {
		System.out.println(2);
	}
	//CONSTRUCTOR OVERLOADING
	public KelasSatu(int i) { //menggunakan 1 parameter
		System.out.println(3);
	}
	public KelasSatu() { //tanpa parameter
		System.out.println(4);
	}
}