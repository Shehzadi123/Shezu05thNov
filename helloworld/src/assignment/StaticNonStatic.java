package assignment;

public class StaticNonStatic {
	public static void Demo() {
		
		System.out.println("This is Static method");
	}
	
	public void Test() {
		
		System.out.println("This is non static method");
	}
	public static void main(String[] args) {
		
		Demo();
		StaticNonStatic x = new StaticNonStatic(); 
		x.Test();
	}

}
