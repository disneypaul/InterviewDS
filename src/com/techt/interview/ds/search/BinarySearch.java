package com.techt.interview.ds.search;

public class BinarySearch {

	//O(log(n) time | O(1) space  || N = length of array, log() bcz eliminating half of the array, only pointer is used for space
	public int binarySearch(int[] array, int target){
		
		return binarySearch(array, target, 0, array.length-1);
	}
	
	public int binarySearch(int[] array, int target, int left, int right){
		
		while(left<=right){
			int position = (left+right)/2;
			if(array[position]==target)
				return position;
			if(array[position]<target)
				left = position +1;
			else
				right = position-1;
		}
		
		return -1;
	}
	
}
