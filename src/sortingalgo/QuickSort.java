package sortingalgo;
// pivote and partition 
// ele less than pivote < pivote < elem greater than pivote
// and recursivly repleate the above step for each left and right subArray

//https://www.youtube.com/watch?v=8MNB0Mba_Dc&ab_channel=ShradhaKhapra
public class QuickSort {
    public static void main(String[] args) {
        int[] input = {5, 2, 8, 1, 9};
        quickSort(input, 0, input.length - 1);
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }

	private static void quickSort(int[] input, int left, int right) {
		// TODO Auto-generated method stub
		if(left>=right)return;
		int pivotIndex = partition(input,left,right);
		quickSort(input,left,pivotIndex-1);
		quickSort(input,pivotIndex+1,right);
		
	}

	private static int partition(int[] input, int left, int right) {
		// TODO Auto-generated method stub
		int idx = left-1; // initial = -1;
		int pivotElement = input[right];
		for(int i=left;i<right;i++) {
			if(input[i]<=pivotElement) {
				idx++;
		         swapping(input,i , idx);
			}
		}
		idx++;
        swapping(input,right , idx);
		return idx;
		
	}

	private static void swapping(int[] input, int a, int b) {
		// TODO Auto-generated method stub
		// below logic will not work because if ele is same then it will become 0
//		input[a] = input[a]^input[b];
//		input[b] = input[a]^input[b];
//		input[a] = input[a]^input[b];
		int temp = input[a];
        input[a] = input[b];
        input[b] = temp;
        // pass by value do it is not modifying 
//		a = a^b; 
//		b = a^b; -> b = (a^b)^b => b = a
//		a = a^b; -> a = (a^b)^(a) => a = b
	}

    
}
