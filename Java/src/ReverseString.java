import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string to reverse");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		for(int i =1; i<=input.length();i++){
			System.out.print(input.charAt(input.length()-i));
		}
		System.out.println();
	}
}