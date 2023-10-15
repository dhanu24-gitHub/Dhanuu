package exception;

public class SingleTryMultipleCatch {
	public static void main(String[] args) {
		String[] names = { null, "Apple", "Mango", "Orange" };
		try {
			char a = names[0].charAt(0);
			char b = names[1].charAt(10);
			String c = names[6];
		} 
		catch (NullPointerException e) {
			System.out.println("Invalid calling");
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid");
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Cannot find");
		}
		catch(Exception e) {
			System.out.println("Cannot Call");
		}

	}

}
