package sortingalgo;

public class SelectionSort {
	
	static void print(int a[]){
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void main(String args[]) {
		int arr[]= {2,-13,4,5,-9,9};
		
		for(int i=0;i<arr.length;i++) {
			int index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[index]>arr[j]) {
					index=j;
				}
			}
			// swapping smallest no for that iteration
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
		}
		print(arr);
	}


}
