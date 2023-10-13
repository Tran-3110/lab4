package main;

public class Order {
	private OrderItem[] items;
	
	
	public Order(OrderItem[] items) {
		this.items = items;
	}
	
	//selection sort
	public void selectionSort() {
		OrderItem min = null;
		int index =0; 
		for (int i = 0; i < items.length; i++) {
			min = items[i];
			index = i;
			for (int j = i+1; j < items.length; j++) {
				if(min.compareTo(items[j])>0) {
					min = items[j];
					index = j;
				}
			}
			items[index] = items[i];
			items[i] = min;
		}
	}
	//bubble sort
	public void bubbleSort() {
		for (int i = 1; i < items.length; i++) {
			for (int j = 0; j < items.length-i; j++) {
				if(items[j].compareTo(items[j+1])>0) {
					OrderItem temp = items[j];
					items[j] = items[j+1];
					items[j+1] = temp;
				}
			}
		}
	}
	//insertion sort
	public void insertionSort() {
		for (int i = 1; i < items.length; i++) {
			int j =i;
			OrderItem value = items[i];
			while(j>0) {
				if(value.compareTo(items[j-1])<0) {
					items[j] = items[j-1];
					j--;
				}
				else {
					break;
				}
			}
			items[j] = value;
		}
	}
}
