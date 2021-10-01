package TugasPraktikum3;
import java.util.Scanner;

public class Soal1 {
	public static void main(String[] args) {
		String s;
		
		Scanner scan = new Scanner(System.in);
		s = scan.nextLine(); //membaca string yang diinput
		scan.close();
		String[] split = s.replaceAll("^[\\W+\\s+]", "").split("[\\s!,?._'@]+");
		
		System.out.println(split.length);
		for(String string : split) {
			System.out.println(string);
		}
	}
}
