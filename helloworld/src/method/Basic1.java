package method;

public class Basic1 {
	public static void Demo(){     //user defined method with static so we don't
		                              //have to create object
		int a=30;             //we take void so we don't have to write return 
		int b=30;              
		int z=a+b;
		System.out.println(z);
	} 
	public static void main(String[] args) {
		
		Demo();
	}

}
