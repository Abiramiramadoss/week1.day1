package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input = 153;
		int sum =0;
		 int org = input;
		while(input > 0) {
			 int rem = input % 10;
			sum =sum  +(rem*rem*rem);
			input = input / 10;
		}
		if (sum == org) {
			System.out.println("armstrong num");
			
		}
		else {
			System.out.println("not armstrong num");
			
		}

	}

}
