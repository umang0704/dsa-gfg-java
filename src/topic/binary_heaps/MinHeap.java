package topic.binary_heaps;

import topic.utilities.Operations;

public class MinHeap {
	Integer[] arr;
	int size;
	int capacity;
	
	public MinHeap(int capacity) { 
		this.arr = new Integer[capacity];
		this.size = 0;
		this.capacity = capacity;
	}
	int left(int i) {return 2*i+1;}
	int right(int i) {return 2*i+2;}
	int parent(int i) {return (i-1)/2;}
	
	/**
	 * 
	 * @param num
	 */
	void insert(int num) {
		if(size==capacity) return;
		
		size++;
		arr[size-1] = num;
		
		for(int i = size - 1; i!=0 && arr[parent(i)] > arr[i];) {
			arr = Operations.swap(arr, parent(i), i);
			i= parent(i);
		}
	}
	
	void minHeapify(int i) {
		int l = left(i);
		int r = right(i);
		
		int s = i;
		
		if(l<size && arr[l]<arr[i])
			s = l;
		if(r<size && arr[r] < arr[i])
			s = r;
		if(s != i) {
			arr =Operations.swap(arr, i, s);
			minHeapify(s);
		}
		
	}
	
	public static void main(String[] args) {
		MinHeap h=new MinHeap(11);
        h.insert(3); 
        h.insert(2);
        h.insert(15);
        h.insert(20);
        
        Operations.printArray(h.arr);
	}
}
