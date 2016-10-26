package sorting;

public class MyBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] inputarr = {4, 2, 9, 6, 23, 12, 34, 0, 1};
		bubbleSort(inputarr);
	}
	
	public static void bubbleSort(int[]arr){
		int n =arr.length;
		int k;
		for(int m=n;m>=0;m--){
			for (int i =0;i<n-1;i++){
				k=i+1;			
			if(arr[i] > arr[k]){
				swapNumbers(i,k,arr);
			}
		}
			printArray(arr);
	  }
	}
	public static void swapNumbers(int i, int j, int[]array){
		int temp;
		temp = array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	public static void printArray(int [] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println();
		
	}

}
