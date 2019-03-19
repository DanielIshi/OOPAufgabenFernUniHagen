package tests.mmd.com;



public class Aufgabe5JaggedArrays {

	public static void main(String[] args) {
		
		int[][] treppchen = new int[10][0];
		
		for (int i = 0; i < 10; i++) {
			treppchen[i] = new int[i + 1];			
			for (int j = 0; j < i+1; j++) {				
				treppchen[i][j]=j;
			}			
		}


		
		for (int[] zeilenelement : treppchen) {			
			for (int spaltenElement : zeilenelement) {
				System.out.print(spaltenElement + " ");
			}	
			System.out.println();
		}
		
		
		
	}

}
