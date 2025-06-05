package sortingalgo;
//Best Case: O(n log n)
//
//Average Case: O(n log n)
//
//Worst Case: O(n log n)
public class MergeSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input [] = {2,1,3,4,-1};
		mergeSort(input,0,input.length-1);
		for(int i=0;i<input.length;i++) {
			System.out.println(input[i]);
		}

	}

	private static void mergeSort(int[] input,int left,int right) {
		// TODO Auto-generated method stub
		divide(input,left,right);
		
	}

	private static void divide(int[] input, int left, int right) {
		// TODO Auto-generated method stub
		if(left>=right)return;
		int mid = left + (right-left)/2;
		divide(input,left,mid);
		divide(input,mid+1,right);
		conquer(input,left,mid,right);
		
		
	}

	private static void conquer(int[] input, int left, int mid, int right) {
		// TODO Auto-generated method stub
		int merge[] = new int[right-left+1];
		int idx1=left;
		int idx2 = mid+1;
		int x=0;
		while(idx1<=mid && idx2<=right) {
			if(input[idx1]<=input[idx2]) {
				merge[x++] = input[idx1++];				
			}else {
				merge[x++] = input[idx2++];		
			}

		}
		// now remaining elements
		while(idx1<=mid) {
			merge[x++]=input[idx1++];
		}
		while(idx2<=right) {
			merge[x++]=input[idx2++];
		}
		// copy whole array from merge to input
		for(int i=0, j=left;i<merge.length;i++,j++) {
			input[j]=merge[i];
		}
		
	}
}
