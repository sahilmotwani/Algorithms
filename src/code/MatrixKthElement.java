package code;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MatrixKthElement {

	static ArrayList<Integer> items = new ArrayList();
	
	public static void main(String[] args) {

		int[][] mat = { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {25, 29, 37, 48},
                {32, 33, 39, 50},
              };
		int k =7;
		int n = mat[0].length;
	}

	
	
	public static void getKthElement(int[][] mat, int k,int n){
		for(int i =0;i<n;i++){
			insert(mat[0][i]);
		}
		while(k>0){
			delete();
			
		}
	}
	
	public static void insert(int item){
		items.add(0);
		siftDown();
	}
	
	public static int delete() throws NoSuchElementException{
		int size = items.size();
		if(size==0){
			throw new NoSuchElementException();
		}
		if(size==1){
			items.remove(0);
		}
		int remItem = items.get(0);
		siftDown();
		return remItem;
	}
	
	private static void siftUp(){
		int k= items.size()- 1;

		while(k>0){
			int p = (k-1)/2;
			int item = items.get(k);
			int parent = items.get(p);

			if(item<parent){
				items.set(k, parent);
				items.set(p, item);
				k=p;
			}
			else{
				break;
			}
		}
	}

	private static void siftDown(){
		int k = 0;
		int left =  2*k+1;
		while(left<items.size()){
			int max=left; int right=left+1;
			if(right<items.size()){
				if(items.get(right).compareTo(items.get(left))>0){
					max++;
				}
			}
			if(items.get(k).compareTo(items.get(max))<0){
				int temp = items.get(k);
				items.set(k, items.get(max));
				items.set(max, temp);
				k=max;
				left = 2*k+1;
			}else{
				break;
			}
		}
	}
	 
}
