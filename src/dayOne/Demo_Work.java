package dayOne;

import java.util.*;

class Employee
{
	private String name;
	private int id;
	private float salary;
	
	Employee(String name,int id,float salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public float getSalary() {
		return salary;
	}
	@Override
	public String toString() 
	{
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
}

class IdComparator implements Comparator<Employee> // For Method1, Method 4
{
    public int compare(Employee e1, Employee e2)
    {
        return e1.getId() - e2.getId();
    }
}
   
      
public class Demo_Work 
{
	public static void main(String[] args) 
	{
		ArrayList<Employee>details=new ArrayList<Employee>();
		details.add(new Employee("Aditya",101,90000));
		details.add(new Employee("Dharma",103,50000));
		details.add(new Employee("Dheeraj",102,70000));
		details.add(new Employee("Amogh",109,80000));
		details.add(new Employee("Akash",106,95000));
		
		details.sort( new IdComparator()); //Method1
		
		Collections.sort(details, new Comparator<Employee>() //Method 2
		{
			@Override
			public int compare(Employee o1, Employee o2) 
			{
				return Integer.compare(o1.getId(),o2.getId());
			}
			
		});
		
		details.sort((o1, o2) -> Integer.compare(o1.getId(), o2.getId())); //Method 3
		
		 IdComparator ic = new IdComparator();  //Method 4
	     Collections.sort(details, ic); 
		
		//For Iteration and printing
		Iterator<Employee> itr=details.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().toString());
		}
	}
}
