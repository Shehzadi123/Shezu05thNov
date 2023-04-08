package method;

public class Basic2 {
	 static int Demo() {     //user defined method without void 
		int a=20;
		int b= 20;
		int z=a*b;
		return z;    //didn't use void that's why we declare return type
	}
	 public static void main(String[] args){
		 int z=Demo();
		 System.out.println(z);
	 }
}
