package sortingalgo;

public class QuickSort {
	static void quickSort(int arr[],int low,int high) {
		if(low<high) {
			
			int pivotIndex=partation(arr,low,high);
			quickSort(arr,low,pivotIndex-1);
			quickSort(arr,pivotIndex+1,high);
		}
	}
	static int partation(int arr[],int low,int high ) {
		int pivot=arr[low];
		int i=low;
		int j=high;
		while(i<j) {
			while(arr[i]<=pivot && i<=high-1)i++;
			while(arr[j]>pivot && j>=low+1)j--;
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		arr[low]=arr[j];
		arr[j]=pivot;

		return j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,3,9,5,2,8};
		quickSort(arr,0,5);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
