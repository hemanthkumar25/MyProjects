import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string to check palindrome");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		char[] arr = input.toCharArray();
		int j = arr.length-1;
		for(int i=0;i<arr.length;i++){
				if(arr[i]==arr[j]){
					System.out.println("true");
					j--;
				}
				else{
					System.out.println("false"); 
					j--;
				}
			}
		}
		
	}


