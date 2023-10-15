package error;

public class StackOvFlo {
	public String a() {
		return a();
	}
	
	public String b() {
		return a();
	}
	
}
