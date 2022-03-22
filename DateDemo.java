class Date
{
	private int dd,mm,yy;
	public void showDate()
	{
		System.out.println("Date: "+dd+"/"+mm+"/"+yy);
	}
	public void setDate(int d,int m,int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
}
public class DateDemo
{
	public static void main(String []args)
	{
		Date d1=new Date();
		d1.setDate(22,03,2022);
		d1.showDate();
	}
}