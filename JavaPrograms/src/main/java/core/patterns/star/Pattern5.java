package core.patterns.star;

public class Pattern5 {

	/*
	 * 			     * 
	 * 			    *** 
	 * 			   ***** 
	 * 			  ******* 
	 * 			 ********* 
	 * 			***********
	 * 			 *********
	 * 			  *******
	 * 			   *****
	 * 				***
	 * 				 *
	 * 
	 */

	public static void main(String[] args) {

		pattern(11);
	}

	public static void pattern(int row) {
		if(row<3) row = row+3;
		if(row%2 == 0) row = row+1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row; j++) {
			if(i<=(row+1)/2) {
			if(j<=((row+1)/2)-i || j>=((row+1)/2)+i)
				System.out.print("   ");
			else
				System.out.print(" * ");
			}
			else {
				if(j<=(i-(row+1)/2) || j>(row-(i-(row+1)/2)))
					System.out.print("   ");
				else
					System.out.print(" * ");
			}
			}
			System.out.println();
		}
	}

}
