package core.string;

public class CountNumberOfOccurencesOfGivenCharacterInString {

	public static void main(String[] args) {
		method2("I am Soumya. Who are you?", 'a');

	}

	// Without taking any loop
	public static void method1(String input, char ch) {
		int count = input.length() - input.replace(ch + "", "").length();
		System.out.printf("Occurences of Character '%c' in String \"%s\" is : %d", ch, input, count);
	}

	// Using loop
	public static void method2(String input, char ch) {
		int count = 0;
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == ch) {
				count++;
			}
		}
		System.out.printf("Occurences of Character '%c' in String \"%s\" is : %d", ch, input, count);
	}

}
