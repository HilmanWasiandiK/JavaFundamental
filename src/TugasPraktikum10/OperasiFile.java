package TugasPraktikum10;

import java.io.*;

public class OperasiFile {
	public static void main(String[] args) {
		File tempFile = new File("C:\\test.txt");
		FileReader tempFileReader = new FileReader(tempFile);
		tempFileReader.close();
	}
}
