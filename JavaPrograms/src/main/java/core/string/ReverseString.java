package core.string;

public class ReverseString {

	public static void main(String[] args) {
		//method3("Soumya Ranjan Patri");
		System.out.println(method4("Soumya Ranjan Patri"));

	}

	// Using StringBuilder
	public static void method1(String str) {
		System.out.println(new StringBuilder(str).reverse());
	}

	// Using StringBuffer
	public static void method2(String str) {
		System.out.println(new StringBuffer(str).reverse());
	}

	// Using loop
	public static void method3(String str) {
		for(int i = str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
	// Using Recursion
	public static String method4(String str) {
		if(str == null || str.length()<=1)
			return str;
		else
			return method4(str.substring(1)) + str.charAt(0);
	}
}
