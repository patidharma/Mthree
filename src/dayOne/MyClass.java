package dayOne;

class Home 
{
	{
		System.out.println("This is block 1");
	}
	{
		System.out.println("This is block 2");
	}
	Home()
	{
		System.out.println("This is default constructor");
	}
	static 
	{
		System.out.println("this is static");
	}
	
}

public class MyClass {

	public static void main(String[] args)
	{
		Home h1=new Home();
		
	}

	

}
