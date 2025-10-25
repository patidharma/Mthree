package dayOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
class Student implements Comparable<Student>
{
	private String name;
	private int id;
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public int compareTo(Student s1)
	{
		return this.id - s1.id;
	}
	public String toString()
	{
		return this.id+" "+this.name;
	}
}
public class Comparable_Demo
{
	public static void main(String[] args)
	{
		List<Student> students = new ArrayList<>();
        students.add(new Student(3, "John"));
        students.add(new Student(1, "Alice"));
        students.add(new Student(2, "Bob"));
		
		Collections.sort(students);
		
		students.sort((a,b)->a.compareTo(b));
		
		System.out.println(students.toString());
		
//		System.out.println(names.toString());
	}

}
