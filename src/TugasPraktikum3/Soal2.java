package TugasPraktikum3;
import java.util.Scanner;

public class Soal2 {
	public static void main(String[] args) {
		String[] Fword = new String[3];
		int[] Fnum = new int[3];
		String word;
		int i, num;
		
        Scanner scan = new Scanner(System.in);
        for(i = 0;i < 3;i++) {
        	word = scan.next(); //membaca string yang diinput
            if(word.length() <= 10) { //syarat panjang string maksimal 10
            	num = scan.nextInt(); //membaca integer yang diinput
            	if(1 <= num && num <= 999) { //syarat range integer 1-999
            		Fword[i] = word;
            		Fnum[i] = num;
            	}
            	else {
            		System.out.println("Integer di luar range 1-999");
            		return;
            	}
            }
            else {
            	System.out.println("Panjang string melebihi 10");
            	return;
            }
        }
        
        System.out.println("\n================================");
        for(i = 0;i < 3;i++)
        {
            System.out.printf("%-15s%03d%n", Fword[i], Fnum[i]); //print dengan format string mulai dari kiri dengan panjang maks 15 dan integer dengan panjang 3 (dimulai dengan 0 jika panjang < 3)
        }
        System.out.println("================================");
	}
}
