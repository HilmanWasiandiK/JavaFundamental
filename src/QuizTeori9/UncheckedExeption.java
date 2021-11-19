package QuizTeori9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedExeption {
	public static void main(String args[]) {
		int number;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Masukkan angka favoritmu (int): ");
		try {
			number = scan.nextInt();
			System.out.println("\nAngka favoritmu adalah " + number);
		}
		catch (InputMismatchException ex) {
			System.out.println("\n" + ex.toString());
			System.out.println("Input bukan merupakan sebuah integer!");
		}
		finally {
			System.out.println("\n=====================================");
			System.out.println("Program berakhir");
		}
		scan.close();
	}
}
