package dayOne;

class Demo
{
	String name="Ap";
	void display()
	{
		System.out.println("Hi");
	}
	void sum(int n1, int n2)
	{
		System.out.println(n1 + n2);
		this.display();
		System.out.println(this.name);
	}
	Demo()
	{
		this("Hyderabad");
		System.out.println("Default const");
		this.sum(10, 90);
	}
	Demo(String city)
	{
		System.out.println("Parameterised"+city);
	}
}
public class Demo_on_This {

	public static void main(String[] args)
	{
		Demo1 obj=new Demo1();
	}

}
