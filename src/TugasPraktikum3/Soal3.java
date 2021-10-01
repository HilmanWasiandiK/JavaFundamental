package TugasPraktikum3;
import java.util.Scanner;

public class Soal3 {
	public static void main(String[] args) {
		int A, B, Hasil = 0;
		String op;
		
		Scanner scan = new Scanner(System.in);
		A = scan.nextInt(); //membaca integer yang diinput
		op = scan.next(); // membaca string yang diinput
		B = scan.nextInt(); //membaca integer yang diinput
		scan.close();
		
		if((A >= 1 && A <= 1000) && (B >= 1 && B <= 1000)) { //sayarat range integer 1-1000
			switch(op) {
				case "+": Hasil = A + B; break;
				case "-": Hasil = A - B; break;
				case "*": Hasil = A * B; break;
				case "/": if((A % B) == 0) { //syarat menjalankan pembagian sesuai perintah soal, sisa bagi harus 0
						  	  Hasil = A / B;
						  }
						  else {
							  System.out.println("A tidak habis dibagi B!"); return;
						  } 
						  break;
				case "%": Hasil = A % B; break;
				default : System.out.println("Operator tidak valid!"); return;
			}
			System.out.println(Hasil);
		} 
		else {
			System.out.println("Angka diluar range 1-1000!");
		}
	}
}
