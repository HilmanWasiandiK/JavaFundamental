package TugasPraktikum3;
import java.math.BigInteger;
import java.util.Scanner;

public class Soal6 {
	public static void main(String[] args) {
		BigInteger num1, num2;
		
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextBigInteger(); //membaca big integer yang diinput
		if(num1.toString().length() <= 200) { //syarat panjang big integer maksimal 200
			num2 = scan.nextBigInteger();
			if(num2.toString().length() > 200) { //syarat panjang big integer maksimal 200
				System.out.println("angka melebihi range!");
				return;
			}
		}
		else {
			System.out.println("angka melebihi range!");
			return;
		}
	
		System.out.println(num1.add(num2)); //menampilkan hasil operasi penambahan big integer
		System.out.println(num1.multiply(num2)); //menampilkan hasil operasi perkalian big integer
	}
}
