package TugasPraktikum4;

public class Barang { 
	String kode_barang; 
	String nama_barang; 
	private int stok; //menjadi private untuk enkapsulasi
	
	public Barang(String kode, String nama, int stk) {  
		kode_barang = kode; 
		nama_barang = nama;  
		stok = stk; 
	} 
	public void setStok(int stk) { //method setter
		stok += stk;
	}
	public int getStok() { //method getter
		return stok;
	}
} 

