package dayOne;

import java.util.*;
import java.util.Arrays;

//add(),set(),remove(),getSize(),getElement(),reSize()

class Array
{
	private int[] arr;
	private int size;
	private int capacity;
	
	Array(int cap)
	{
		capacity=cap;
		arr=new int[capacity];
		size=0;
	}
	
	public void add(int ele)
	{
		if(size == capacity)
		{
//			throw new ArrayIndexOutOfBoundsException("Index out of Bounds");
			reSize();
		}
		arr[size]=ele;
		size++;
	}
	public void reSize()
	{
		capacity*=2;
		arr=Arrays.copyOf(arr,capacity);
//		int newArray[]=new int[capacity];
//		System.arraycopy(arr, 0, newArray, 0, size);
//		arr=newArray;
	}
	
	public void printArray()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public void set(int index,int ele)
	{
		if(index<0 || index>=size)
		{
			throw new ArrayIndexOutOfBoundsException("Index out of Bounds");
		}
		arr[index]=ele;
	}
	
	public void remove(int index)
	{
		if(index<0 || index>=size)
		{
			throw new ArrayIndexOutOfBoundsException("Index out of Bounds");
		}
		for(int i=index;i<size-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[size-1]=0;
		size--;
	}
	
	public int getElement(int index)
	{
		if(index<0 || index>=size)
		{
			throw new ArrayIndexOutOfBoundsException("Index out of bounds");
		}
		return arr[index];
	}
	
	public int getSize()
	{
		return size;
	}
}

public class Array_Implementation
{
	public static void main(String ... args)
	{
		Array array = new Array(5);
		
		array.add(10);
		array.add(20);
		array.add(30);
		array.add(30);
		array.add(50);
		
		array.add(60);
		array.add(70);
		array.printArray();
		
		array.set(3,40);
		
		array.printArray();
		
		array.remove(3);
		
		array.printArray();
		
		int res=array.getElement(2);
		System.out.println(res);
		
		int res1=array.getSize();
		System.out.println(res1);
		
		array.printArray();
	}
}
