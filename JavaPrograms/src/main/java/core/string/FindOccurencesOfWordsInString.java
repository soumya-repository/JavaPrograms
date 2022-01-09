package core.string;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindOccurencesOfWordsInString {

	public static void main(String[] args) {

		method2("Hi I am Soumya. I am good. How are you. Hoping you are good also");
	}

	// using Collection
	public static void method1(String input) {
		String[] arr = input.replaceAll("\\.", "").split("\\s");
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i]) + 1);
			else
				map.put(arr[i], 1);
		}

		System.out.println(map.toString());
	}

	// Without using collection
	public static void method2(String input) {
		String[] arr = input.replaceAll("\\.", "").split("\\s");
		for (int i = 0; i < arr.length; i++) {
			int temp =1;
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					temp++;
					arr[j]="";
				}
			}
			if(arr[i] != "")
				System.out.println(arr[i]+" : "+temp);
		}
	}

}
