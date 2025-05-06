package cp;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.*;

public class RangeUpdateQueries {


    private static class SegmentTree {
        private int[] tree;
        private int arr[];
        private int n;

        public SegmentTree(int[] ar) {
            this.n = ar.length;
            arr=ar;
            this.tree = new int[4 * n];
            build(1,0,n-1);
        }

        private void build(int node,int start,int end) {
        	if(start==end)tree[node]=arr[start];
        	else {
        		int mid=(start+end)/2;
        		build(node*2,start,mid);
        		build(node*2+1,mid+1,end);
        		tree[node]=0;
        	}
        }

        public void updateRange(int left, int right, int val) {
            updateRange(1,0,n-1,left,right,val);
        }

        private void updateRange(int node, int start,int end,int left,int right, int val) {
            if (start > right || end < left) {
                return;
            }
            if(start==end)tree[node]+=val;
            else if (start >= left && end <= right) {
                tree[node] += val;
              
            }
            else {
            	int mid=(start+end)/2;
            	updateRange(2*node,start,mid,left,right,val);
            	updateRange(2*node+1,mid+2,end,left,right,val);
            }
        }
        void propagate(int node,int start,int end) {
        	if(start==end)return;// no further call after leaf node
        	tree[node*2]+=tree[node];
        	tree[node*2+1]+=tree[node];
        	tree[node]=0;
        }

        public int query(int index) {
            return query(1,0,n-1,index);
        }

        private int query(int node, int start, int end,int index) {
        	propagate(node,start,end);
        	if(start==end)return tree[node];
        	else{
        		int mid=(start+end)/2;
        		if(start<=index && index<=mid) {
        			return query(2*node,start,mid,index);//left
        		}
        		else {
        			return query(2*node+1,mid+1,end,index);//right;
        		}
        	}
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int[] arr = new int[n];

        // Read the array values
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        SegmentTree st = new SegmentTree(arr);

        // Read and process the queries
        for (int i = 0; i < q; i++) {
            int type = scanner.nextInt();
            if (type == 1) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int u = scanner.nextInt();
                st.updateRange(a - 1, b - 1, u);// array is having 1 base indexing
            } else {
                int k = scanner.nextInt();
                System.out.println(st.query(k-1));//(k-1) 1 base indexing 

            }
        }
    }
}