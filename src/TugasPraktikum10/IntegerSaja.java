package TugasPraktikum10;

import java.util.Scanner;

public class IntegerSaja {
	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Masukkan Integer: ");
		num = scan.nextInt();
		scan.close();
		
		System.out.println("Integer yang dimasukkan adalah " + num);
	}
}
