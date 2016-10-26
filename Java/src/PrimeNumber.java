import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number to check prime");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		if(input ==1 || input ==2 ){
			System.out.println("Number is prime");
		}
		else{
		double check = Math.sqrt(input);
		for(int i=2;i<=check;i++){
			if(input%i == 0){
				System.out.println("Number not prime");
			}
			else{
				System.out.println("number is prime");
			}
		}
		}	

	}
	}
