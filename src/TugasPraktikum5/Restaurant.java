package TugasPraktikum5;

public class Restaurant {
	public static byte id=0; 
	private Makanan[] M;
	
	public Restaurant() { 
		M = new Makanan[10];
	} 
	
	public void tambahMenuMakanan(String nama, double harga, int stok) { 
		this.M[id] = new Makanan(nama, harga, stok);
	} 
	
	public void tampilMenuMakanan() { 
		for(int i = 0;i <= id;i++) { 
			if(!isOutOfStock(i)) { //jika stok tidak nol
				 M[i].tampilMakanan();
			} 
		} 
	} 
	
	public boolean isOutOfStock(int id) { 
		return M[id].getStokMakanan() == 0;
	} 
	
	public static void nextId() { 
		id++; 
	} 
	
	public void pesanMakanan(String nama, int jumlah) {
		for(int i = 0;i <= id;i++) {
			if(nama.equals(M[i].getNamaMakanan())) { //validasi makanan yang dipilih
				if(jumlah <= M[i].getStokMakanan()) { //validasi jika stok cukup
					System.out.println(M[i].getNamaMakanan() + " terjual sebanyak " + jumlah);
					M[i].kurangiStokMakanan(jumlah);
				}
				else { //validasi jika stok kurang
					System.out.println("stok tidak memenuhi permintaan pembelian!");
				}
			}
		}
	}
}

class Makanan {
	private String nama_makanan;
	private double harga_makanan; 
	private int stok; 
	
	public Makanan(String nama, double harga, int stok) {
		this.nama_makanan = nama; 
		this.harga_makanan = harga;
		this.stok = stok; 
	}
	
	public String getNamaMakanan() {
		return this.nama_makanan;
	}
	
	public int getStokMakanan() {
		return this.stok;
	}
	
	public void tampilMakanan() {
		System.out.println(nama_makanan + "[" + stok + "]\tRp." + harga_makanan);
	}
	
	public void kurangiStokMakanan(int jumlah) {
		this.stok -= jumlah;
	}
}