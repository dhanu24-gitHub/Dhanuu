package exception;

public class NumFormEx {
	public static void main(String[] args) {
		String a = "Deekshi";
		try {
		int b = Integer.parseInt(a);
		System.out.println(b);
		}
//		catch(NumberFormatException e) {
//			System.out.println("Cannot change String to int");
//		}
//		System.out.println("Hello World");
		finally {
			System.out.println("end");
			
		}
	}

}
