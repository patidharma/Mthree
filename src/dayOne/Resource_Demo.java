package dayOne;
//class Shivam implements Runnable
//{
//	public void run()
//	{
//		for(int i=1;i<11;i++)
//		{
//			System.out.println("Shivam "+i);
//		}
//	}
//}
//class Dheeraj implements Runnable
//{
//	public void run()
//	{
//		for(int i=1;i<11;i++)
//		{
//			System.out.println("Dheeraj "+i);
//		}
//	}
//}
class Resource 
{
	void click(String name,int cnt)
	{
		System.out.println(name+" "+cnt);
	}
}
class MyThread extends Resource implements Runnable
{
	String name;
	Resource camera;
	MyThread(String name)
	{
		this.name=name;
		this.camera=new Resource();
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			camera.click(name, i);
		}
	}
}
public class Resource_Demo 
{
	public static void main(String[] args)
	{
		MyThread shivam=new MyThread("Shivam");
		MyThread dheeraj=new MyThread("Dheeraj");
		
		Thread Rai=new Thread(shivam);
		Thread Reddy=new Thread(dheeraj);
		
		Rai.start();
		Reddy.start();
		
	}

}
