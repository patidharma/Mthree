package dayOne;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_Demo 
{
	public static void main(String[] args)
	{
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(1, "Dharma");
		hm.put(2, "Siva");
		hm.put(3, "Abhi");
		hm.put(4, "Kalyan");
		
//		System.out.println(hm);
		
		
//		for(Map.Entry<Integer, String> itr:hm.entrySet())
//		{
//			System.out.println(itr.getKey()+" "+itr.getValue());
//		}
		
		Iterator<Integer> itr=hm.keySet().iterator();
		while(itr.hasNext())
		{
			Integer key=itr.next();
			String value=hm.get(key);
			System.out.println(key +" "+ value);
		}
		
		
	}

}
