package TugasPraktikum2;

import java.util.Scanner;

public class Soal1 {
	public static void main(String[] args) {
        	int i, n;
		Scanner scan = new Scanner(System.in);
		
		//memasukkan jumlah percobaan yang akan dilakukan
		System.out.println("Enter the number of trials to be performed");
		n = scan.nextInt();

		//percobaan sebanyak jumlah yang dimasukkan sebelumnya
        	for(i = 0;i < n;i++) {
			//bidang try
			try {
				System.out.println("\nEnter the number to be tested");
                		long x = scan.nextLong(); //memasukkan angka yang akan diuji
                		System.out.println(x + " can be fitted in:");
                		if(x>=-128 && x<=127)System.out.println("* byte"); //range byte
                		if(x>=-32768 && x<=32767)System.out.println("* short"); //range short
                		if(x>=-2147483648 && x<= 2147483647)System.out.println("* int"); //range int
                		if(x>=-9223372036854775808L && x<= 9223372036854775807L)System.out.println("* long"); //range long
           		}
			//bidang catch untuk menangkap jika ada error pada bidang try
          		catch(Exception e) {
          		      System.out.println(scan.next()+" can't be fitted anywhere.");
          		}
        	}
    	}
}

