package Multi;

public class test 
{
	public static void main(String[] args) 
	{
		int n = 8;
		for(int i = 0; i < 10; i++) 
		{
			Thread object = new Thread(new MultiDemo());
			object.start();
		}
	}
}
