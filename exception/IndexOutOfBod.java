package exception;

public class IndexOutOfBod {
	public static void main(String[] args) {
		String a = "David";
		char b = a.charAt(0);
		try {
		char c = a.charAt(5);
		System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Invalid Manipulation");
		}
	}

}
