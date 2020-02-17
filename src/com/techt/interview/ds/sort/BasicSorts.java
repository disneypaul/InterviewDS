package com.techt.interview.ds.sort;

import org.junit.Assert;
import org.junit.Test;

public class BasicSorts {
	
	int [] sortedArray = {1,2,5,6,9,15};

	public int[] bubbleSort(int[] array){
		
		boolean sorted = false;
		int counter = 0;
		
		while(!sorted){
			sorted = true;
			for(int i=0; i<array.length-1-counter; i++){
				if(array[i]>array[i+1]){
					sorted = false;
					swap(i, i+1, array);
				}
			}
			counter++;
		}
		return array;
	}
	
	public int[] insertionSort(int[] array){
		for(int i=1; i<array.length; i++){
			int j=i;
			while(j>0 && array[j]<array[j-1]){
				swap(j-1,j,array);
				j--;
			}
		}
		return array;
	}
	
	public int[] selectionSort(int[] array){
		int i=0;
		while(i<array.length-1){
			int smallIndex = i;
			for(int j=smallIndex+1; j<array.length; j++){
				if(array[smallIndex]>array[j]){
					smallIndex = j;
				}
			}
			swap(smallIndex,i,array);
			i++;
		}
		return array;
	}
	
	public void swap(int sourcePos, int targetPos, int[] array){
		int temp = array[targetPos];
		array[targetPos] = array[sourcePos];
		array[sourcePos] = temp;
	}
	
	@Test
	public void selectionSortTest(){
		
		int [] origArray = {15,2,9,6,1,5};
		int [] returnedArray = selectionSort(origArray);
		
		Assert.assertArrayEquals(returnedArray, sortedArray);
	}
	
	@Test
	public void insertionSortTest(){
		
		int [] origArray = {15,2,9,6,1,5};
		int [] returnedArray = insertionSort(origArray);
		
		Assert.assertArrayEquals(returnedArray, sortedArray);
	}
	
	@Test
	public void bubbleSortTest(){
		
		int [] origArray = {15,2,9,6,1,5};
		int [] returnedArray = bubbleSort(origArray);
		
		Assert.assertArrayEquals(returnedArray, sortedArray);
	}
	
}
