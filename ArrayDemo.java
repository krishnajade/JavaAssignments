//Create array of 5 integers and assign some values . Find out max, min and average of this array
class Array
{
	int []arr = new int [5];
	{arr[0]=5;
	arr[1]=12;
	arr[2]=26;
	arr[3]=18;
	arr[4]=30;}
	
	public void max()
	{
		int Max=arr[0];
		for(int i=1;i<5;i++)
		{
			if(arr[i]>Max)
				Max= arr[i];
		}
		System.out.println("Max element of the given array is "+Max);
	}
	public void min()
	{
		int Min=arr[0];
		for(int i=1;i<5;i++)
		{
			if(arr[i]<Min)
				Min= arr[i];
		}
		System.out.println("Max element of the given array is "+Min);	
	}
	public void average()
	{
		int avg=0;
		for(int i=1;i<5;i++)
		avg+=arr[i];
		avg/=5;
		System.out.println("Average of the given array is "+avg);	
	}	
}
public class ArrayDemo
{
	public static void main(String []args)
	{
		Array a1=new Array();
		a1.max();
		a1.min();
		a1.average();
	}
}