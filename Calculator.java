package week1.day2;

public class Calculator {
	
	public int add(int num1,int num2) {
         return num1+num2;
		
    }
	 
	public double sub(double num1,double num2) {
		return num1-num2;

	}
	public double mul (double num1,double num2) {
		return num1*num2;

	}
	public int divide (int num1,int num2) {
		return num1/num2;

	}


	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int add = calc.add(12, 13);
		double sub = calc.sub(20.6, 17.0);
		double mul = calc.mul(10.0, 2.0);
		int divide = calc.divide(50, 5);
		
				System.out.println(add);
				System.out.println(sub);
				System.out.println(mul);
				System.out.println(divide);
				
		
	}
	
	
	

}
