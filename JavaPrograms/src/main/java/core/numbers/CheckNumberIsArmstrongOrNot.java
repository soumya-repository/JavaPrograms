package core.numbers;

public class CheckNumberIsArmstrongOrNot {
/*
 * A number is called an Armstrong number if it is equal to 
 * sum of its digits each raised to the power of number of 
 * digits in it. For example: 153, 371, 407, 9474, 54748 are 
 * some Armstrong numbers.
 *  
 */	
	public static void main(String[] args) {
		checkArmstrong(54748);

	}
	
	public static void checkArmstrong(int num) {
		int sum =0;
		int power = (num+"").length();
		int duplicate = num;
		while(num!=0) {
			int temp =1;
			for(int i=0; i<power;i++) {
				temp*=num%10;
			}
			sum+=(temp);
			num /=10;
		}
		if(sum==duplicate) System.out.printf("%d is a Armstrong number",duplicate);
		else System.out.printf("%d is not a Armstrong number",duplicate);
	}

}
