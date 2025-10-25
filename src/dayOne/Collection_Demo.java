package dayOne;

import java.util.*;
import java.util.function.Consumer;


public class Collection_Demo
{
	public static void main(String[] args) 
	{	
		List<Integer>list=Arrays.asList(10,20,30,25,49);
		
//		Consumer<Integer>con=new Consumer<Integer>() 1way
//				{
//					@Override
//					public void accept(Integer num) 
//					{
//						System.out.println(num);
//					}
//			
//				};
//		list.forEach(con);
		
//		list.forEach((n)->System.out.println(n)); //2nd way
//		list.forEach(n->System.out.println(n));
		System.out.println("Dharma is AMDG");
		list.stream().sorted().filter(x->x%2==0).forEach(System.out::print);
	}

}
