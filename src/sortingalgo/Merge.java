package sortingalgo;

public class Merge {
	static void divide(int arr[],int str,int end) {
		if(str>=end) {	// this will return when only one ele will remain 
//			System.out.println(str+" "+end);
			return;
		}
		int mid=str + (end-str)/2; // not doing (end+str)/2 because after adding both out of int range
		divide(arr,str,mid);
		divide(arr,mid+1,end);
		conquer(arr,str,mid,end);
	}
	static void conquer(int arr[],int str,int mid,int end) {
		System.out.println(str+" "+mid+" "+end);
		int merge[]=new int[end-str+1];
		int str1=str;
		int str2=mid+1;
		int x=0;
		while(str1<=mid && str2<=end) {
			if(arr[str1]<=arr[str2]) {	// first ele of left arr < first ele of right arr
				merge[x++]=arr[str1++];
			}
			else {// if not then copy second ele from right arr
				merge[x++]=arr[str2++];
			}
		}
		while(str1<=mid) { // means some ele are remaining in left arr
			merge[x++]=arr[str1++];
		}

		while(str2<=end) { // means some ele are remaining in right arr
			merge[x++]=arr[str2++];
		}
		// then copy all ele from merger arr to main arr
		for(int i=0,j=str;i<merge.length;i++,j++) {
			arr[j]=merge[i];
			System.out.println(arr[j]);
		}
		System.out.println(" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,3,9,5,2,8};
		int size=arr.length;
		divide(arr,0,size-1);
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}

	}

}
