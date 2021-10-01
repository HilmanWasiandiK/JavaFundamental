package TugasPraktikum3;
import java.util.Scanner;

public class Soal5 {
	public static void main(String[] args) {
		String noPlat;
		long num, formula;
		
		Scanner scan = new Scanner(System.in);
		noPlat = scan.nextLine(); //membaca nomor semua plat
		scan.close();
		
		num = Long.parseLong(noPlat.replaceAll("\\s", "")); //menghilangkan spasi kemudian menjadikan bertipe long
		formula = (num - 999999) % 5; //perhitungan sesuai soal
		if(formula == 0) { //jika hasil perhitungan sama dengan 0
			System.out.println("jalan");
		}
		else { //jika hasil perhitungan tidak sama dengan 0
			System.out.println("berhenti");
		}
	}
}