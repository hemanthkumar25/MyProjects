package search;

public class MyLinearSearch {
	
	public static int linearSearch (int [] arr, int key){
		
		int size = arr.length;
		System.out.println(size);
		for (int i=0;i<size;i++){
			if(arr[i] == key){
				return i;
			}
		}
		return -1;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr1 = {23,45,21,55,234,1,34,90};
		int searchKey = 34;
		System.out.println("Key "+searchKey+" found at index: "+linearSearch(arr1, searchKey));
		int [] arr2 = {23,45,21,55,234,1,34,90,421};
		searchKey = 421;
		System.out.println("Key "+searchKey+" found at index: "+linearSearch(arr2, searchKey));
		
		}

	}

