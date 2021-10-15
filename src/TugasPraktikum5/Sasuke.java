package TugasPraktikum5;

public class Sasuke extends Itachi {  
	String Dojutsu = "Sharingan"; 
	
	void printDojutsu() { 
		super.printDojutsu(); //  <<--- MENAMBAHKAN (memanggil method dari superclass yang memliki nama yang sama)
		System.out.println(this.Dojutsu); 
	} 
}