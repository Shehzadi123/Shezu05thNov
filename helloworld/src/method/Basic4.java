package method;

public class Basic4 {
	
	public String Demo() {  //user defined method without static
		String a="Shehzadi";
		System.out.println(a);
		return a;
		
		
	}
	public static int Test(){
		int b=24;
		System.out.println(b);
		return b;
	}
	public static void main(String[] args) {
		
		Basic4 name=new Basic4(); //without static that's why creating object
		name.Demo(); //calling method with object
		
		Test(); //direct calling method withour object
		
	}

}
