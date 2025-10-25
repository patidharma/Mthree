package dayOne;

import java.util.Arrays;

public class Binary_Search
{
	static int binarySearch(int[] arr,int ele, int low, int high)
	{
		int mid=(low+high)/2;
		while(high>=low)
		{
			if(arr[mid]==ele)
			{
				return mid;
			}
			else if(ele>arr[mid])
			{
				return binarySearch(arr,ele,mid+1,high);
			}
			else
			{
				return binarySearch(arr,ele,low,mid-1);
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,6,7,8,12,11};
		
		Arrays.sort(arr);
		
		int ele=7;
		
		int res=binarySearch(arr,ele,0,arr.length);
		if(res!=-1)
		{
			System.out.println("Element is present at index "+res);
		}
		else 
		{
			System.out.println("Element not found");
		}
	}

}
