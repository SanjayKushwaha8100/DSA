package recursion;

public class ReverseAarray {
	// by using two pointer
	static void help(int arr[],int left,int right) {
		if(left>right)return;
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		help(arr,left+1,right-1);
	}
	// by using only one pointer
	static void help1(int arr[],int left) {
		int mid = arr.length/2;
		int length = arr.length;
		if(left>mid)return;
		int temp = arr[left];
		arr[left] = arr[length-1-left];
		arr[length-1-left] = temp;
		help1(arr,left+1);
	}
	public static void main(String args[]) {
	int arr[] = {1,2,3,4,5,6};
//	help(arr,0,arr.length-1);
	help1(arr,0);
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		
	}
	
	}

}
