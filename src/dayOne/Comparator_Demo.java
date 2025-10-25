package dayOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Person1
{
	String name;
	int id;
	int runs;
	Person1(int id,String name,int runs)
	{
		this.id=id;
		this.name=name;
		this.runs=runs;
	}
}
//class Name_Sort implements Comparator<Person1>
//{
//	public int compare(Person1 p1,Person1 p2)
//	{
//		return p1.name.compareTo(p2.name);
//	}
//}
//class Id_Sort implements Comparator<Person1>
//{
//	public int compare(Person1 p1,Person1 p2)
//	{
//		return p1.id-p2.id;
//	}
//}
public class Comparator_Demo
{
	public static void main(String[] args)
	{
		List<Person1>list=new ArrayList<>();
		list.add(new Person1(1,"Dharma",49));
		list.add(new Person1(2,"Kalyan",69));
		list.add(new Person1(3,"Abhi",86));
		list.add(new Person1(4,"Siva",83));
		list.add(new Person1(5,"Manav",129));
		
//		Collections.sort(list, new Name_Sort());
//		//Either any way
//		Collections.sort(list, new Id_Sort());
		
		list.sort(Comparator.comparingInt(x->x.id));
		
		list.sort((e1,e2)->e1.name.compareTo(e2.name));
		
		
	}

}
