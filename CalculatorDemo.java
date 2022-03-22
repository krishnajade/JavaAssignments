class Calculator
{
	private int Add,Sub,mul,div,a,b;
	public void Display()
	{
		System.out.println("Addition: "+Add);
		System.out.println("Subtraction: "+Sub);
		System.out.println("Multiplication: "+mul);
		System.out.println("Division: "+div);
	}
	public void Calculate(int a,int b)
	{
		System.out.println("The numbers are "+a+"and"+b);
		Add= a+b;
		Sub= a-b;
		mul=a*b;
		div=a/b;
	}
}
public class CalculatorDemo
{
	public static void main(String []args)
	{
		Calculator c1=new Calculator();
		c1.Calculate(20,10);
		c1.Display();
	}
}