package sortingalgo;

public class InsertionSort {
	static void print(int a[]){
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String args[]) {
		int arr[]= {7,8,3,1,2};
		// first part of array which contain 1 ele is sorted and other part is unsorted
		for(int i=1;i<arr.length;i++) {
			int currentEle=arr[i];
			int j=i-1; // for swapping if we found a no less than the current no
			while(j>=0 && currentEle<arr[j]) { 
				arr[j+1]=arr[j];
				j--;
			}
			// found the right place to place the no
			arr[j+1]=currentEle;
		}
		print(arr);
	}

}
