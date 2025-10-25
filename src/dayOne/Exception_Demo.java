package dayOne;

import java.io.IOException;

class DemoNew
{
	void myMethod(int age)throws IOException, ClassNotFoundException
	{
		if(age<18)
		{
			throw new IOException("Not eligible to vote");
		}
		else
		{
			throw new ClassNotFoundException("IO Exception Occured");
		}
	}
}
public class Exception_Demo
{
	public static void main(String[] args) 
	{
		try
		{
//			DemoNew obj=new DemoNew();
//			obj.myMethod(18);
			try
			{
				String str="Dharma";
				int num=Integer.parseInt(str);
				System.out.println(num);
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
//			catch(NumberFormatException e)
//			{
//				System.out.println("Explicitly thrown "+e);
//			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			int[] arr= {1,2,3,4};
			System.out.println(arr[6]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Closing the resource");
		}

	}

}
