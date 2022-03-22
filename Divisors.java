public class Divisors
{
	public static void main(String []s)
	{
		int a = 24;

		System.out.print("Divisors of " + a + " are ");
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				System.out.print(i);
				System.out.print(" ");
			}
		}	
	}	
}