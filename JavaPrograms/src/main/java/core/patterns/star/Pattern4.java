package core.patterns.star;

public class Pattern4 {

	/*
	 * 			     * 
	 * 			    ** 
	 * 			   *** 
	 * 			  **** 
	 * 			 ***** 
	 * 			******
	 * 
	 */

	public static void main(String[] args) {

		pattern(10);
	}

	public static void pattern(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row; j++) {
			if(j<=row-i)
				System.out.print("   ");
			else
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
