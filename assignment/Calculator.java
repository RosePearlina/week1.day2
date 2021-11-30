package week1.day2.assignment;

public class Calculator {
	public int add(int a, int b, int c)
	{
		int sum;
		sum=a+b+c;
		System.out.println("The addition value is: "+sum);
		
		return sum;
		
	}
	public int sub(int num1, int num2)
	{
		int sub;
		sub=num1-num2;
		System.out.println("The substraction value is: "+sub);
		return sub;
	}
	public double mul(double num1, double num2)
	{
		double mul;
		mul= num1*num2;
		System.out.println("The multiplication value is: "+mul);
		return mul;
	}

	public float  divide(float num1, float num2)
	{
		float div;
		div=num1/num2;	
		System.out.println("The division value is: "+div);
		return div;
	}
	public static void main(String[] args) {
		Calculator cal=new Calculator();		
		
	}

}
