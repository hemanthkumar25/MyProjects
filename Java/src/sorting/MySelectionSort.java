package sorting;

public class MySelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,34,2,56,7,67,88,42};
		int [] arr2 = (selectionSort(arr));
		for(int i:arr2){
			System.out.print(i);
			System.out.print(", ");
		}

	}
	
	public static int[] selectionSort(int []arr){
		for (int i=0;i<arr.length-1;i++){
			int index = i;
			for(int j=i+1;j<arr.length;j++)
				if (arr[j]< arr[index])
					index = j;
					int smallNumber =arr[index];
					arr[index]= arr[i];
					arr[i] = smallNumber;
					
				}
			return arr;
			
		
	}

}
