package method;

public class Argument {
	
	public static int Demo() {  //user defined method without argument
		int a =20;
		int b=30;
		int c= a+b;
		System.out.println("Addition : "+c);
		return c;
		
	}
	
	public void multiplication(int x,int y) {   //user defined non static method 
		                                         //with argument
		int z=x*y;
		System.out.println("Multiplication : "+z);
		
	}
	
	public static void main(String[] args) {
		Argument multiply=new Argument();
		multiply.multiplication(20,5);
		multiply.multiplication(10,2);
		multiply.multiplication(20,1);
		Demo();
		
	}

}
