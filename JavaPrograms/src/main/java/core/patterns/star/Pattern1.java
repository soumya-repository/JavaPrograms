package core.patterns.star;

public class Pattern1 {

	/*
	 * 			******
	 * 			*****
	 * 			****
	 * 			***
	 * 			**
	 * 			*
	 * 
	 */
		
	public static void main(String[] args) {
		
		pattern(10);
	}
	
	public static void pattern(int row) {
		for(int i = 1; i<=row; i++) {
			for(int j = row; j>=i; j--) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
