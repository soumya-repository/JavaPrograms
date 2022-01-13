package core.string;

import java.util.Scanner;

public class CountNumberOfWordsInString {

	public static void main(String[] args) {
		System.out.println("Enter the String...");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		countWords2(str);
	}
	
	public static void countWords1(String input) {
		String[] arr = input.trim().split("\\s");
		int temp = 0;
		for(String st : arr) {
			if(! (st.equals("\\s") || st.equals("") || st.equals("\\t")))
				temp++;
		}
		System.out.printf("Number of words in String %s is : %d",input,temp);
	}
	
	public static void countWords2(String input1) {
		String input = input1.trim();
		int words = 1;
		for(int i=0; i<input.length()-1; i++) {
			if(input.charAt(i)==' ' && input.charAt(i+1) != ' ')
				words++;
		}
		System.out.printf("Number of words in String %s is : %d",input,words);
	}

}
