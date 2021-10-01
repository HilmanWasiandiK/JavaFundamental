package TugasPraktikum3;
import java.util.Scanner;

public class Soal4 {
	public static void main(String[] args) {
		int jmlJual, gajiTotal = 0, gajiPokok = 500000, hrgItem = 50000;
		
		Scanner scan = new Scanner(System.in);
		jmlJual = scan.nextInt(); //membaca jumlah barang terjual
		
		if(jmlJual < 15) { //jika barang terjual kurang dari 15
			gajiTotal = gajiPokok - ((15 - jmlJual) * hrgItem * 15/100);
		}
		else if(jmlJual > 80) { //jika barang terjual lebih dari 80
			gajiTotal = gajiPokok + (jmlJual * hrgItem * 35/100);
		}
		else if(jmlJual >= 40) { //jika barang terjual minimal 40
			gajiTotal = gajiPokok + (jmlJual * hrgItem * 25/100);
		}
		else { //jika jumlah barang terjual 15 hingga 39
			gajiTotal = (jmlJual * hrgItem * 10/100) + gajiPokok;
		}
		System.out.print(gajiTotal);
		
	}
}
