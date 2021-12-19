package TugasTeori12;

import java.util.*;

public class Pemesan {
	private String nama;
	private String alamat;
	private String noTelp;
	private long total;
	private Set<String> menu = new HashSet<String>();

	
	public Pemesan(String nama, String alamat, String noTelp,long total,Set<String>
	menu) {
		this.nama = nama;
		this.alamat = alamat;
		this.noTelp = noTelp;
		this.total = total;
		this.menu = menu;
	}
	
	@Override
	public String toString() {
		String text;
		
		text = 	"Nama : " + nama + "\n" +
				"Alamat : " + alamat + "\n" + 
				"Telp : " + noTelp + "\n" +
				"----------------------------------------------\n" +
				"Pesanan : \n";
					for(String str : menu) {
						text = text.concat(" -" + str + "\n");
					}
		text = text.concat("----------------------------------------------\n" +
				"Total Bayar\n" +
				"\tRp" + total);
		return text;
	}
}
