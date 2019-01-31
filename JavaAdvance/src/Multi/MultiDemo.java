package Multi;

class MultiDemo implements Runnable
{

	@Override
	public void run() 
	{
		try
		{
			System.out.println("Theread "+Thread.currentThread().getId()+" is runing");
		}
		catch (Exception e) 
		{
			System.out.println("Exception is caught");
		}
	}

}
