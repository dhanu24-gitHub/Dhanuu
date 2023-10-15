package exception;

public class NulPoinEx {
	public static void main(String[] args) {
		String a = null;
		try {
		String b = a.toUpperCase();
		System.out.println(b);
		}
		catch(NullPointerException e) {
			System.out.println("This is NULL value cant be chenged");
		}
	}

}