package exception;

public class ArithExc {
	public static void main(String[] args) {
//		int a = 10;
//		int b = 0;
//		System.out.println(a/b);       
//			System.out.println("This is INVALID Mathematics");
			
			
		
		int a = 10;
		int b = 0;
		try {
		System.out.println(a/b);       
		}
		catch(ArithmeticException c) {
			System.out.println("This is INVALID Mathematics");
		}
	}

}
