package search;

public class MyBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBinarySearch mbs = new MyBinarySearch();
		int [] arr = {2,4,6,8,10,12,14,16,18};
		System.out.println("The key is at "+mbs.binarySearch(arr, 2)+".");

	}
	
	public int binarySearch(int [] inputarr, int key){
		int start = 0;
		int end = inputarr.length - 1;
		while(start<=end){
		int  mid = (start+end)/2;
		if(key == inputarr[mid]){
			return mid;
		}
		if(key<inputarr[mid]){
			end = mid-1;
		}
		else{
			start = mid +1;
		}
		}
		return -1;
	}

}
