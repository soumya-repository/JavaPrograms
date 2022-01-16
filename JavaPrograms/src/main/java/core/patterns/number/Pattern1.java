package core.patterns.number;

import java.util.Scanner;

public class Pattern1 {
/*
 * 		            1
 * 				   2 2
 * 				  3 3 3
 * 				 4 4 4 4
 * 				5 5 5 5 5
 * 			   6 6 6 6 6 6
 * 			  7 7 7 7 7 7 7
 * 			 8 8 8 8 8 8 8 8
 * 			9 9 9 9 9 9 9 9 9
 * 
 */
	public static void main(String[] args) {
		System.out.println("Enter Number of Rows...");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=rows; j++) {
				if(j<=rows-i) System.out.print(" ");
				else System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
