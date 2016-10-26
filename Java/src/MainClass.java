public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello world!");
		method1();
		
		System.out.println("Hello world! 5");
}
	public static void method1(){
		System.out.println("Hello world! 2");
		method2();
		System.out.println("Hello world! 4");
	}
	public static void method2(){
		System.out.println("Hello world! 3");
	}
}