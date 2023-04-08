package assignment;

public class WithArgument {
	
	public int Addition(int x, int y) {
		int a = x+y;
		System.out.println("Sum Of x and y is : " + a);
		
		return a;
		
	}
	
	public int Subtraction(int x,int y) {
		int b = x-y;
		System.out.println("SubStraction of x and y is : "+b);
		return b;
		
	}
	
	public static void main(String[] args) {
		 int x=20;
		 int y=10;
		 WithArgument z = new WithArgument();
		 z.Addition(x,y);
		 z.Subtraction(x,y);
		
	}

}
