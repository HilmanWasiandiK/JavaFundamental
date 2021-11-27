package TugasPraktikum10;

public class Array {
	public static void main(String[] args) {
		int value;
		int array[] = null;
		
//		System.out.println("kasus array kosong");
//		value = array[0];
		
//		System.out.println("kasus melebihi indeks array");
//		array = new int[3];
//		value = array[5];
		
		System.out.println("kasus indeks array negatif");
		array = new int[-10];
		value = array[-3];
	}
}
