class Box
{
	private int volume,height,width,depth;
	public void showVolume()
	{
		System.out.println("Volume: "+volume);
	}
	public void setDimensions(int h,int w,int d)
	{
		System.out.println("Height of box: "+h);
		System.out.println("Width of box: "+w);
		System.out.println("Depth of box: "+d);
		volume= h*w*d;
	}
}
public class BoxDemo
{
	public static void main(String []args)
	{
		Box b1=new Box();
		b1.setDimensions(10,15,20);
		b1.showVolume();
	}
}