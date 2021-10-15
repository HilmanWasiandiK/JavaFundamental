package TugasPraktikum5;

public class RestaurantMain {
	public static void main(String[] args) { 
		Restaurant menu = new Restaurant(); 
		
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20); 
		Restaurant.nextId();
		menu.tambahMenuMakanan("Gehu", 1_000, 20); 
		Restaurant.nextId(); 
		menu.tambahMenuMakanan("Tahu", 1_000, 0); 
		Restaurant.nextId(); 
		menu.tambahMenuMakanan("Molen", 1_000, 20); 
		
		//menampilkan menu
		System.out.println("===============MENU MAKANAN===============");
		menu.tampilMenuMakanan(); 
		System.out.println("==========================================\n\n");
		
		//percobaan pemesanan pertama kemudian mengupdate menu
		System.out.println("Memesan molen 21 buah, maka :");
		menu.pesanMakanan("Molen", 21);
		System.out.println("===============MENU MAKANAN===============");
		menu.tampilMenuMakanan(); 
		System.out.println("==========================================\n");
		
		//percobaan pemesanan kedua kemudian mengupdate menu
		System.out.println("Memesan bala-bala 9 buah, maka :");
		menu.pesanMakanan("Bala-Bala", 9);
		System.out.println("===============MENU MAKANAN===============");
		menu.tampilMenuMakanan(); 
		System.out.println("==========================================\n");
	}
}