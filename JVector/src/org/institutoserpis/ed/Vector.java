package org.institutoserpis.ed;

import java.util.Random;

public class Vector {
	
	public static void main (String[]args){
		int index = indexOf(new int[]{13,64,14,54,74},13);
		System.out.println("Vector index = "+index);
	}
	
	public static int indexOf(int[] v, int data){
		int index = 0;
		while(index < v.length && v[index] != data)
			index++;
		if(index == v.length)
			return -1;
		return index;
	}
	
	public static void selectionSortjj(int[] v) {
		
		for(int itemIndex= 0; itemIndex < v.length; itemIndex++){
			int indexOfMin = itemIndex;
			for(int index = itemIndex + 1; index < v.length; index++){
				if(v[index] < v[indexOfMin])
					indexOfMin = index;
			}
		}
		
	}
	
	private static int indexOfMin(int[] v, int initialIndex){
		int indexOfMin = initialIndex;
		for(int index = initialIndex + 1; index < v.length; index++)
			if(v[index] < v[indexOfMin])
				indexOfMin = index;
		return indexOfMin;
	}
	
	private static void swap(int[] v, int indexOne, int indexTwo){
		int aux = v[indexOne];
		v[indexOne] = v[indexTwo];
		v[indexTwo] = aux;
	}
	
	public static void selectionSort(int[] v) {
		
		for(int itemIndex= 0; itemIndex < v.length; itemIndex++){
			int indexOfMin = indexOfMin(v, itemIndex);
			swap(v, itemIndex, indexOfMin);			
		}
		
	}
	
}
