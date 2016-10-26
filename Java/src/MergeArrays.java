import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array1 = {101,102,103,104};
	     int[] array2 = {105,106,107,108};
	     int size = array1.length + array2.length;
	     int [] result = new int[size];
	     int k=0;
	     for(int i =0; i < array1.length;i++){
	    	 result[i] = array1[i];
	     }
	    
	     for(int j =array1.length; j <result.length;j++){
	    	 result[j] = array2[k];
	    	 k++;
	     }
	     System.out.println(Arrays.toString(result));
	}

}
