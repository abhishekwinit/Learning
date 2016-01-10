package com.datastructure;

import java.lang.reflect.Array;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] elementlist={10,14,20,40,44};

		int result=BinarySearch(elementlist,0,elementlist.length,200);
		System.out.println(result);
		
	}

	public static int BinarySearch(int arr[],int l,int r,int value)
	{
		if(l<=r)
			return -1;
		//mid =baseaddress+midElementAddress;
		int mid =l+(r-l)/2;
		

		if(arr[mid]==value)
		return mid;
		else if(arr[mid]>value)
			return BinarySearch(arr, l, mid-1, value);
		else if(arr[mid]<value)
			return BinarySearch(arr, mid+1, r, value);
		else 
		return -1;
		
				
		
				
	}
	
}
