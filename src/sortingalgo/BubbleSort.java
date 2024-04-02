package sortingalgo;

public class BubbleSort {	// brute force approach for sorting == bubble sort
	public static void main(String args[]) {
		int a[]= {2,5,1,4,3,23,0,9};
		for(int j=0;j<a.length;j++) {
			for(int i=0;i<a.length-1-j;i++) {
				if(a[i]>a[i+1]) {
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					// this is comment
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		
		}

	}
}	
	


