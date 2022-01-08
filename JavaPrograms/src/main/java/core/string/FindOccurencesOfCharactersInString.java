package core.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class FindOccurencesOfCharactersInString {

	public static void main(String[] args) {

		String input = "Heyyy How Are You";
		method2(input);

	}
	
	//Using HashMap
	public static void method1(String input) {
		String str = input.replaceAll("\\s", "");
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else
				map.put(str.charAt(i), 1);
		}
		System.out.println(map);
	}
	
	// without Using collection
	public static void method2(String input) {
		// Convert String to array. Don't use String its immutable
		char [] str = input.replaceAll("\\s", "").toCharArray();
		for (int i = 0; i < str.length; i++) {
			int temp = 1;
			for(int j = i+1; j < str.length; j++) {
				if(str[i] == str[j]) {
					temp++;
					str[j] = '\u0000';
				}
			}
				if(str[i] != '\u0000') 
					System.out.println(str[i]+" : "+temp);
			}
	}

}
