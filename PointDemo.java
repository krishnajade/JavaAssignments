class Point
{
	private int xx,yy;
	public void showPoint()
	{
		System.out.println("Point Co-ordinates: "+"["+xx+","+yy+"]");
	}
	public void setOrdinates(int x,int y)
	{
		xx=x;
		yy=y;
	}
}
public class PointDemo
{
	public static void main(String []args)
	{
		Point p1=new Point();
		p1.setOrdinates(10,20);
		p1.showPoint();
	}
}