package tests.mmd.com;



public class Aufgabe5JaggedArrays {

	public static void main(String[] args) {
		
		int[][] b = new int[10][0];
		
		
		for (int i = 0; i < 10; i++) {
			b[i] = new int[i+1];
			
			for (int j = 0; j < i+1; j++) {				
				b[i][j]=j;
			}			
		}
		
		
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < i+1; j++) {				
//				System.out.print( b[i][j] + " " );
//			}
//			System.out.println();
//		}
		
		for (int[] zeilenelement : b) {			
			for (int spaltenElement : zeilenelement) {
				System.out.print(spaltenElement + " ");
			}	
			System.out.println();
		}
		
		
		
	}

}
