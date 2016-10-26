import java.util.Random;
import java.util.Scanner;


public class TwentyOneSticks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numSticks = 21;
		int numToTake;
		Scanner input = new Scanner(System.in);
		Scanner take = new Scanner(System.in);
		System.out.println("Would you like to start first? Type y or n");
		String toss = input.nextLine();
		
		if((toss.equals("y")) || (toss.equals("Y"))){
			System.out.println("User plays first.");
			while(numSticks>0){
			System.out.println("There are "+numSticks+" left");
			System.out.println("How many sticks you want to take? 1 or 2");
			numToTake = take.nextInt();
			numSticks = numSticks - numToTake;
			numSticks = Computer(numSticks);
			}
			
		}
		else{
			System.out.println("Computer plays first.");
			System.out.println("There are "+numSticks+" left");
			while(numSticks>0){
				numSticks = Computer(numSticks);
				if(numSticks<=0)break;
				System.out.println("There are "+numSticks+" left");
				System.out.println("How many sticks you want to take? 1 or 2");
				numToTake = take.nextInt();
				numSticks = numSticks - numToTake;
				}
		
		}

	}
	public static int Computer(int x){
		if(x<=0){
			System.out.println("You Lose:( ....Computer Wins!!!!");
			return 0;
		}
		else{
		Random rand = new Random();
		int y = x - rand.nextInt(2) - 1;
		if(y<=0){
			System.out.println("You Win");
			
		}
		return y;
		}
		
	}
	
}
