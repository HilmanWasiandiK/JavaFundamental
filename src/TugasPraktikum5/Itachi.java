package TugasPraktikum5;

public class Itachi extends Rikudo { 
	private String KekkeiGenkai = "Susanoo"; 
	private String Dojutsu = super.Dojutsu; //mengisi dengan value attribute superclass
	
	void printKekkeiGenkai() { 
		System.out.println(this.KekkeiGenkai); 
	} 
	
	void printDojutsu() { 
		System.out.println(this.Dojutsu); 
		setDojutsu(); //  <<--- MENAMBAHKAN (untuk mengubah value Dojutsu pada class ini)
		System.out.println(this.Dojutsu); 
	} 
	
	private void setDojutsu() { 
		this.Dojutsu = "Mangekyou Sharingan"; 
	} 
} 

