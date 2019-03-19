package tests.mmd.com;

public class ArrayTestZweiDimBoolean {

	public static void main(String[] args) {	
		
		String[] toppings = {"Cheese", "Pepperoni", "Black Olives"};
		
		Ave instanzDerAveKlasse = new Ave();
		instanzDerAveKlasse.main( toppings); 
		
		
		
		boolean[][] b = new boolean[2][5];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				
				System.out.println(b[i][j]);
			}
			
		}
	}

}
