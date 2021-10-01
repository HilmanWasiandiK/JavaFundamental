package TugasPraktikum3;

public class Soal7 {
	 public static void main(String[] args) { 
		 int i, j, k;
		 
		 //One Dimensional Arrays 
		 int[] fisrtArray = {2, 5, 3};  
		 int[] secondArray = {9, 5, 3};  
		 int[] thirdArray = {2, 4, 9};  
		 int[] fourthArray = {10, 11, 12};  
		 int[] fifthArray = {13, 14, 15};  
		 int[] sixthArray = {16, 17, 18};  
		 int[] seventhArray = {19, 20, 21};  
		 int[] eighthArray = {22, 23, 24};  
		 int[] ninthArray = {25, 26, 27};  
		 
		 //Two Dimensional Arrays 
		 int[][] twoDimensionalArray1 = {fisrtArray, secondArray,  thirdArray};  
		 int[][] twoDimensionalArray2 = {fourthArray, fifthArray,  sixthArray}; 
		 int[][] twoDimensionalArray3 = {seventhArray, eighthArray,  ninthArray}; 
		 
		 //Three Dimensional Array 
		 int[][][] threeDimensionalArray = {twoDimensionalArray1,  twoDimensionalArray2, twoDimensionalArray3}; 
	  
		 //perulangan untuk menampilkan output array 3d sesuai dengan perintah soal
		 for (i = 0; i < threeDimensionalArray.length; i++) {
			 System.out.print("{ ");
			 for (j = 0; j < threeDimensionalArray.length ; j++) {
				 System.out.print("{ ");
			     for (k = 0; k < threeDimensionalArray.length; k++) {
			    	 System.out.print(threeDimensionalArray[i][j][k] + " ");
			     }
			     System.out.print("} ");   
			 }
			 System.out.println("}");
		 }
	 }
}
