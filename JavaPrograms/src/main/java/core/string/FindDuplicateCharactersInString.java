package core.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateCharactersInString {

	public static void main(String[] args) {

		String input = "Heyyy How Are You";
		method1(input);

	}

	// Using Set of Entry and Iterator
	public static void method1(String input) {
		String str = input.replaceAll("\\s", "");
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else
				map.put(str.charAt(i), 1);
		}

		Set<Entry<Character, Integer>> entry = map.entrySet();
		Iterator<Entry<Character, Integer>> itr = entry.iterator();
		while (itr.hasNext()) {
			Entry<Character, Integer> temp = itr.next();
			if (temp.getValue() > 1) {
				System.out.println(temp.getKey() + " : " + temp.getValue());
			}
		}
	}

	// Using Entry and foreach
	public static void method2(String input) {
		String str = input.replaceAll(" ", "");
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else
				map.put(str.charAt(i), 1);
		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
	}

	// Using keySet and foreach loop
	public static void method3(String input) {
		String str = input.replaceAll(" ", "");
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else
				map.put(str.charAt(i), 1);
		}

		for (Character ch : map.keySet()) {
			if (map.get(ch) > 1) {
				System.out.println(ch + " : " + map.get(ch));
			}
		}
	}

	// Using keySet and Set and Iterator
	public static void method4(String input) {
		String str = input.replaceAll(" ", "");
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else
				map.put(str.charAt(i), 1);
		}

		Set<Character> set = map.keySet();
		Iterator<Character> itr = set.iterator();
		while (itr.hasNext()) {
			Character c = itr.next();
			if (map.get(c) > 1) {
				System.out.println(c + " : " + map.get(c));
			}
		}
	}

	// without Using collection and taking a int array
	public static void method5(String input) {
		// Convert String to array. Don't use String its immutable
		char [] str = input.replaceAll(" ", "").toCharArray();
		int [] arr = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			int temp = 1;
			for(int j = i+1; j < str.length; j++) {
				if(str[i] == str[j]) {
					temp++;
					str[j] = '\u0000';
				}
			}
			
			arr[i] = temp;
		}
		
		for(int i =0; i< arr.length; i++) {
			if(str[i] != '\u0000' && arr[i]>1) 
				System.out.println(str[i]+" : "+arr[i]);
		}
		
	}
	
	// without Using collection and without taking a int array
	public static void method6(String input) {
		// Convert String to array. Don't use String its immutable
		char [] str = input.replaceAll(" ", "").toCharArray();
		for (int i = 0; i < str.length; i++) {
			int temp = 1;
			for(int j = i+1; j < str.length; j++) {
				if(str[i] == str[j]) {
					temp++;
					str[j] = '\u0000';
				}
			}
				if(str[i] != '\u0000' && temp>1) 
					System.out.println(str[i]+" : "+temp);
			}
	}

}
