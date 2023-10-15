package exception;

public class ArrIndOutOfBoun {
	public static void main(String[] args) {
//		int[] nums = {24, 6, 23, 22, 50};
//		try {
//		int c = nums[7];
//		System.out.println(c);
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Invalid");
//		}
		
//		String[] names = {"Apple", "Mango", "Orange", "Grapes"};
//		try {
//		char a = names[0].charAt(10);
//		System.out.println(a);
//		}
//		catch(StringIndexOutOfBoundsException e) {
//			System.out.println("Invalid enter");
//		}
		
		String[] names = {"Apple", "Mango", "Orange", "Grapes"};
		try {
		char a = names[10].charAt(10);
		System.out.println(a);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid enter");
		}
	}

}
