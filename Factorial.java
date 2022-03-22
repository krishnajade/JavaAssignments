public class Factorial
{
	public static void main(String []s)
	{
		int a=5,fact=1;
		for(int i=1;i<=a;i++)
		{
			fact*=i;
		}
		System.out.println("Factorial of "+a+" is "+fact);	
	}
}