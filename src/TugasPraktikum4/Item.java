package TugasPraktikum4;

public class Item {
	private String name;
	
	private Item() {
		name = "Ipin"; //this.name diubah
	}
	public Item(String name) {
		this(); //merujuk ke Item()
		System.out.println(this.name);
	}
}
