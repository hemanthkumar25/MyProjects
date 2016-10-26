package search;

public class MyRecursiveBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,45,234,567,876,900,976,999};
		int index = recursiveBinarySearch(arr,0,arr.length,999);
		System.out.println("Found 45 at "+index);
		
	}
	
	public static int recursiveBinarySearch(int [] sortedArray, int start,int end, int key){
		
		if(start<end){
			int mid = start+(end-start)/2;
		if (key<sortedArray[mid]){
			return recursiveBinarySearch(sortedArray,start,mid,key);
		}
		if(key>sortedArray[mid]){
			return recursiveBinarySearch(sortedArray,mid+1,end,key);
		}
		else{
			return mid;
		}
		}
		return -(start+1);
	}

}
