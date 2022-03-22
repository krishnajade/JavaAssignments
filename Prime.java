public class Prime
{
    public static void main(String []s)
  {
	 int a= 15;
	 boolean x= true;
	 for(int i=2;i<a;i++)
	 {
	    if(a%i==0)
	   { x=false;
	     break;
	   }
	 }
	if(x=false){
		System.out.println("The number"+a+" is not a prime number");
	       }
	else {
	      System.out.println("The number"+a+" is a prime number");
	     }
  }
}