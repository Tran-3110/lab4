package main;

import java.util.Arrays;

public class Task1 {
	// sort by descending order
	public static void selectionSort(int[] array) {
		int min = -1;
		int index = 0;
		for (int i = 0; i < array.length-1; i++) {
			min = array[i];
			index = i;
			for (int j = i+1; j < array.length; j++) {
				if(min > array[j]) {
					min = array[j];
					index = j;
				}
			}
			array[index] = array[i];
			array[i] = min;
		}
	}
	
	// sort by descending order
	public static void bubbleSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
		for (int j = 0; j < array.length-i; j++) {
			if(array[j] > array[j+1]) {
				int temp = array[j+1];
				array[j+1] = array[j];
				array[j] = temp;
			}
		}
	 }
	}
	
	// sort by descending order
	public static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int j = i;
			int value = array[i];
			while(j>0) {
				if(value<array[j-1]) {
					array[j] = array[j-1];
					j--;
				}
				else {
					break;
				}
			}
			array[j] = value;
		}
	}

	public static void main(String[] args) {
		int[] array = {3, 6, 2, 1, 2, 7, 9, 5, 2, 4, 8, 1, 9, 12};
		insertionSort(array);
		System.out.println(Arrays.toString(array));
	}
}

