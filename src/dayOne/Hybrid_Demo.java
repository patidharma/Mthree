package dayOne;
interface A
{
	void show();
}
interface B extends A
{
	void displayB();
}
interface C extends B
{
	void displayC();
}
class D implements B,C
{
	public void show()
	{
		System.out.println("Hi this is from interface A");
	}
	public void displayB()
	{
		System.out.println("This is from interface B");
	}
	public void displayC()
	{
		System.out.println("This is from interface C");
	}
}
public class Hybrid_Demo {

	public static void main(String... args) 
	{
		D obj=new D();
		D obj1=new D();
		obj.displayB();
		obj.displayC();
		obj.show();
		String str=null;
		System.out.println(str);
		System.out.println(obj.equals(obj1));
		System.out.println(obj==obj1);
		
	}

}
