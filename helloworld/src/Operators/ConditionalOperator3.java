package Operators;

public class ConditionalOperator3 {
	public static void main(String[] args) {
		
		//nested if, if-if-if-else-else-else
		int a=50,b=40,c=60;
		
		if(a>=b) {
			//System.out.println("a is greater");
			if(a>=c) {
				System.out.println("a is greater");
			}
			else {
				System.out.println("c is greater");
			}
			
		}
		else if(b>=c){
			System.out.println("b is greater");
		}
		else {
			System.out.println("sorry");
		}
	
	}

}
