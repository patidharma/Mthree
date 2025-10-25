package dayOne;

//add(),set(),remove(),printArray(),getElement(),getSize()
//Time Complexity:Insertion,deletion:O(n)

//class Array
//{
//	private int size;
//	private int capacity;
//	private int[] arr;
//	Array(int cap)
//	{
//		capacity=cap;
//		size=0;
//		arr=new int[cap];
//	}
//	void add(int ele)
//	{
//		if(size==capacity)
//		{
//			reSize();
//		}
//		arr[size]=ele;
//		size++;
//	}
//	void print()
//	{
//		for(int i=0;i<size;i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//	}
//	
//	void set(int index,int val)
//	{
//		if(index<0 || index>=size)
//		{
//			throw new ArrayIndexOutOfBoundsException("Index out of bounds");
//		}
//		arr[index]=val;
//	}
//	
//	void remove(int index)
//	{
//		if(index<0 || index>=size)
//		{
//			throw new ArrayIndexOutOfBoundsException("Index out of bounds");
//		}
//		else 
//		{
//			for(int i=index;i<size-1;i++)
//			{
//				arr[i]=arr[i+1];
//			}
//			arr[size-1]=0;
//			size--;
//		}
//	}
//	
//	int getElement(int index)
//	{
//		if(index<0 || index>=size)
//		{
//			throw new ArrayIndexOutOfBoundsException("Index out of bounds");
//		}
//		return arr[index];
//	}
//	
//	int getSize()
//	{
//		return size;
//	}
//	
//	void reSize()
//	{
//		capacity*=2;
//		int newArray[]=new int[capacity];
//		System.arraycopy(arr, 0, newArray, 0, size);
//        arr=Arrays.copyOf(arr,capacity);
//		arr=newArray;
//	}
//}
public class Array_Demo
{
	public static void main(String[] args)
	{
//		Array arr=new Array(5);
//		arr.add(1);
//		arr.add(2);
//		arr.add(3);
//		arr.add(4);
//		arr.add(5);
//		arr.print();
//		arr.set(4,9);
//		arr.print();
//		arr.add(6);
//		arr.print();
//		arr.remove(5);
//		arr.set(4,5);
//		arr.print();
//		
//		int num=arr.getElement(2);
//		System.out.println(num);
//		
//		int len=arr.getSize();
//		System.out.println(len);
	}
}
