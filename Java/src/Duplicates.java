import java.util.Arrays;

public class Duplicates {

	public static void main(String[] args)
	{
	    int[] array = new int[] {3, 6, 5, 4, 3, 6, 1, 3};
	    Arrays.sort(array);
	    int sum = 0;
	    int total=0;
	    int n=1;
	    for (int i = 0; i < array.length; i++)
	    {
	        for (int j = i + 1; j < array.length; j++) 
	        {
	            if (i != j && array[i] == array[j])
	            {
	            	if(n==1){
	                sum = array[i] + array[j];
	                i++;
	                n++;
	                System.out.println("The sum of repeated element "+array[i]+" is "+sum);
	                total = total+sum;
	            	}
	            	else{
	            		sum = sum + array[j];
	 	                i++;
	 	                n++;
	 	               System.out.println("The sum of repeated element "+array[i]+" is "+sum);
	 	              total = total+array[j];
	            	}
	            }
	        }
	        n=1;
	    }
	    System.out.println("The  total  is "+total);
	}
		
	}

	
