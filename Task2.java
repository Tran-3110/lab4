package main;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
	// sort by descending order
	public static void mergeSort(int[] array) {
		int[] arr = mergeSortHelp(array, 0, array.length-1);
		System.out.println(Arrays.toString(arr));
	}

	public static int[] mergeSortHelp(int[] array, int first, int last) {
		if (first == last) {
			return new int[] {array[first]};
		}
		int k = (first + last) / 2;

		int[] arr1 = mergeSortHelp(array, first, k);
		int[] arr2 = mergeSortHelp(array, k + 1, last);
		return gopMang(arr1, arr2);
	}

	public static int[] gopMang(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int index = 0;
		while (index < result.length) {
			if (i < arr1.length && j < arr2.length) {
				if (arr1[i] < arr2[j]) {
					result[index] = arr1[i];
					index++;
					i++;
				} else {
					result[index] = arr2[j];
					index++;
					j++;
				}
			}
			else {
				if(i<arr1.length) {
					result[index] = arr1[i];
					index++; i++;
				}
				if(j<arr2.length) {
					result[index] = arr2[j];
					index++; j++;
				}
			}
		}

		return result;
	}
	
	
	
	// sort by ascending order
	public static void quickSort(int[] array) {
		quickSort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
	}
	public static void quickSort(int[] array, int L, int R) {
		if(L>R) {
			return;
		}
		int pivot = getPivot_Random(tachMang(array, L, R));
		int i = L;
		int j = R;
		while(i<=j) {
			while(array[i] < pivot) i++;
			while(array[j] > pivot) j--;
			if(i>j) {
				break;
			}
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++; j--;
		}
		quickSort(array, L, j);
		quickSort(array, i, R);
	}
	
	public static int[] tachMang(int[] array, int first, int last) {
		int[] result = new int[(last-first)+1];
		for (int i = 0; i < result.length; i++) {
			result[i] = array[first];
			first++;
		}
		return result;
	}
	
	
	//select pivot element based on the median of three 
	//strategy
	private static int getPivot_MedianOfThree(int[] array) { 
		int num1 = array[0];
		int num2 = array[array.length-1];
		int num3 = array[(0+(array.length-1))/2];
	return (num1+num2+num3)/3;
	}
	// select pivot element based on the first element 
	//in the array
	private static int getPivot_First(int[] array) {
	return array[0];
	}
	// select pivot element based on the last element in 
	//the array
	private static int getPivot_Last(int[] array) {
	return array[array.length-1];
	}
	// select pivot element based on choosing a randomly 
	//element in the array
	private static int getPivot_Random(int[] array) {
		Random rd = new Random();
	return array[rd.nextInt(array.length)];
	}
	
	
	public static void main(String[] args) {
		int[] array = new int[] {3, 9, 2, 6, 4, 3, 2, 1, 7, 0, 5, 3, 0, 12, 7, 78, 0, 0, 0, 0, 7, 45};
		mergeSort(array);
		quickSort(array);
	
	}

}
