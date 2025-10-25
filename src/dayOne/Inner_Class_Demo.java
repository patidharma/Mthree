package dayOne;

class Outer
{
	String name="M.H";
	static String nameTwo="Andhra Pradesh";
	class Inner
	{
		void cityName()
		{
			System.out.println("Nagpur");
			System.out.println(name);
		}
	}
	static class InnerTwo
	{
		void cityNameTwo()
		{
			System.out.println("Maharastra");
		}
	}
	static class InnerThree
	{
		static void cityNameThree()
		{
			System.out.println("Hyderabad");
		}
	}
}
public class Inner_Class_Demo {

	public static void main(String[] args) 
	{
		Outer o=new Outer();
		System.out.println(o.name);
		
		Outer.Inner i1=o.new Inner();
		i1.cityName();
		
		Outer.InnerTwo i2=new Outer.InnerTwo();
		i2.cityNameTwo();
		
		Outer.InnerThree.cityNameThree();
		System.out.println(Outer.nameTwo);

	}

}
