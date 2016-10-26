import java.util.Scanner;
public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan = new Scanner(System.in);
int num =scan.nextInt();
if (num < 3){
	System.out.println("Under 3");
	
}
else if (num == 3){
	System.out.println("Equals 3");
	
}
else{
	
	System.out.println("Over 3");
}

	}

}
