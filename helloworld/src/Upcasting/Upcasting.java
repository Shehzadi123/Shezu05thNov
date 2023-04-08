package Upcasting;

public class Upcasting {
	public static void main(String []args ) {
		System.out.println("******Super class method*****");
		Cast a = new Cast();
		a.Car();
		a.truck();
		
		System.out.println("****Sub class method****");
		Upcast b = new Upcast();
		b.Bike();
		b.Car();
		b.truck();
		
		System.out.println("*****casting****");
		Cast c = new Upcast();
		c.Car();
		c.truck();
	}
	

}
