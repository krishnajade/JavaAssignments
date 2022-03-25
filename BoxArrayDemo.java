
//Create array of 3 boxes. Display volume calculated for each box.Use class Box which is already created

class Box 
{
    private int volume=1;
	int [][]arr={ { 10, 20, 30 }, { 20, 30, 40 }, { 30, 40, 50 } };
    
    public void displayVolume(int num) {
		for(int i=0;i<3;i++)
		{
			int j=num-1;
       		volume*=arr[j][i];	
		}
          System.out.println("Volume of box-"+num+": "+ volume);
    }
}

public class BoxArrayDemo 
{
    public static void main(String[]args) 
	{
        Box b1 = new Box();
        b1.displayVolume(1);

        Box b2 = new Box();
        b2.displayVolume(2);

        Box b3 = new Box();
        b3.displayVolume(3);
    }
}
