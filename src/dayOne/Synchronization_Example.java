package dayOne;
//class Camera
//{
//	synchronized void click()
//	{
//		for(int i=1;i<11;i++)
//		{
//			System.out.println(Thread.currentThread().getName());
//		}
//	}
//}
class Camera
{
	 void click()
	{
		synchronized(this)
		{
			for(int i=1;i<11;i++)
			{
				System.out.println(Thread.currentThread().getName());
			}
		}
	}
}
class Rai extends Thread
{
	Camera c;
	Rai(Camera c)
	{
		this.c=c;
	}
	public void run()
	{
		c.click();
	}
	
}
class Reddy extends Thread
{
	Camera c;
	Reddy(Camera c)
	{
		this.c=c;
	}
	public void run()
	{
		c.click();
	}	
}
public class Synchronization_Example
{
	public static void main(String[] args)
	{
		Camera c=new Camera();
		
		Rai th1=new Rai(c);
		Reddy th2=new Reddy(c);
		
		th1.setName("Shivam");
		th2.setName("Dheeraj");
		
		th1.start();
		th2.start();
		
	}
}
