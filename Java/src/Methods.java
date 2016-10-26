
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		double pi = 3.14;
		System.out.println(num);
		System.out.println(pi);
		otherMethod();
		System.out.println("Hello world!!");
		if (num!=3){
			System.out.println("Number not equals 3.");
		}
		
	}
	public static void otherMethod(){
		method2();
		int num1 = 3;
		int num2 = 5;
		int num3 = 7;
		if (num1 == 9 || num2 == 5 && num3 == 9){
			System.out.println("You win!!");
		}
		
	}
	public static void method2(){
		System.out.println(3.15159);
	}
}
