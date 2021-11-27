package TugasPraktikum10;

import java.util.Scanner;

public class HexCheck {
	public static void main(String args[]) {
		String hex;
		int dec;
		Scanner scan =  new Scanner(System.in);
		
		System.out.print("Masukkan bilangan: ");
		hex = scan.next();
		scan.close();
		
		dec = HexToDec(hex);
		if(dec != 0) {
			System.out.println("Bilangan tersebut merupakan Hexadecimal.");
			System.out.println("Bilangan Decimal-nya: "+ dec);
		}
		else {
			System.out.println("Bilangan tersebut bukanlah Hexadecimal!");
		}
		
	}
	
	public static int HexToDec(String hex) {
		try {
			return Integer.parseInt(hex, 16);
		}
		catch (NumberFormatException ex) {
			return 0;
		}
	}
}
