package QuizTeori9;

import java.util.Scanner;

public class UserDefinedException {
	public static void main(String args[]) {
		int number;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Masukkan integer genap: ");
		try {
			number = scan.nextInt();
			scan.close();
			if(number%2 == 0) {
				System.out.println("\nSelamat angka yang anda masukkan merupakan integer genap!");
			}
			else {
				throw new MyException("angka yang anda masukkan merupakan integer ganjil!");
			}
		}
		catch(MyException ex) {
			System.out.println(ex);
		}
		finally {
			System.out.println("\n=====================================");
			System.out.println("Program berakhir");
		}
	}
}

class MyException extends Exception {
	String str1;
	
	MyException(String str2) {
		str1 = str2;
	}
	
	public String toString() {
		return ("\nException: " + str1);
	}
}
