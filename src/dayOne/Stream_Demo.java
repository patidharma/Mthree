package dayOne;

import java.util.stream.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
class Person
{
	String name;
	int runs;
	int id;
	Person(int id,String name,int runs)
	{
		this.id=id;
		this.name=name;
		this.runs=runs;
	}
	
}
public class Stream_Demo
{

	public static void main(String[] args) 
	{
//		List<Integer>list=Arrays.asList(10,20,30,25,49,10,25);
//		int num=(int) list.stream().count();
//		System.out.println(num);
//		List<Integer>myNewList=list.stream().sorted().distinct().filter(x->x%2==0).map(x->x*2).collect(Collectors.toList());
//		System.out.println(myNewList);
//		int sub=list.stream().reduce(1,(n,m)->n*m);
//		System.out.println(sub);
////		
//		
//		list.sort((a,b)->a.compareTo(b));
//		Collections.sort(list,(a,b)->a.compareTo(b));
//		System.out.println(list);
		
		
		List<Person>list=new ArrayList<>();
		list.add(new Person(1,"Dharma",49));
		list.add(new Person(2,"Kalyan",69));
		list.add(new Person(3,"Abhi",86));
		list.add(new Person(4,"Siva",83));
		list.add(new Person(5,"Manav",129));
		
		for(Person p:list)
		{
			System.out.println(p.id+" "+p.name+" "+p.runs);
		}
		
		List<Person>names=list.stream().filter(p->p.runs>=55).collect(Collectors.toList());
		names.stream().forEach(x->System.out.println(x.name)); 
		
		int sum=list.stream().map(p->p.runs).reduce(0,(x,y)->x+y);
		System.out.println(sum);
		
		Person minruns=list.stream().min(Comparator.comparingInt(p->p.runs)).orElse(null);
		System.out.println(minruns.name);
		
		Person maxruns=list.stream().max(Comparator.comparingInt(p->p.runs)).orElse(null);
		System.out.println(maxruns.name);
		
		Collections.sort(list,(o1,o2)->Integer.compare(o2.runs, o1.runs));
		Collections.sort(list,(o1,o2)->o1.name.compareTo(o2.name));
		
		for(Person p:list)
		{
			System.out.println(p.id+" "+p.name+" "+p.runs);
		}
	}
}
