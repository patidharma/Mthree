package dayOne;
import java.util.*;
class Demo1 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				Thread.sleep(2000);
				System.out.println(i);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error"+e);
		}
	}
}
public class Multi_Thread_Demo 
{

	public static void main(String[] args)
	{
		Demo1 obj=new Demo1();
		obj.start();
	}
}
