package TugasTeori1;
import java.util.Scanner;

public class Tugas1 {
	public static void main (String[] args) {
		double Tugas, UTS, UAS, Total; //deklarasi variabel

		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan nilai rekapitulasi tugas: ");
		Tugas = scan.nextDouble(); //memasukkan nilai Tugas
		System.out.print("Masukkan nilai Ujian Tengah Semester (UTS): ");
		UTS = scan.nextDouble();   //memasukkan nilai UTS
		System.out.print("Masukkan nilai Ujian Akhir Semester (UAS): ");
		UAS = scan.nextDouble();   //memasukkan nilai UAS
		scan.close();
		Total = (0.2 * Tugas)+(0.35 * UTS)+(0.45 * UAS); //menghitung nilai akhir
		
		if(Total > 85) { //syarat nilai A
			System.out.println("Nilai siswa tersebut adalah: A");
		}
		else if(75 <= Total && Total <= 84) { //syarat nilai B
			System.out.println("Nilai siswa tersebut adalah: B");
		}
		else if(65 <= Total && Total <= 74) { //syarat nilai C
			System.out.println("Nilai siswa tersebut adalah: C");
		}
		else if(49 <= Total && Total <= 64) { //syarat nilai D
			System.out.println("Nilai siswa tersebut adalah: D");
		}
		else if(Total < 50) { //syarat nilai E
			System.out.println("Nilai siswa tersebut adalah: E");
		}
	}
}
