package pattern;

public class FourthQuadrant {
	public static void main(String[] args) {
		
		int space=0;
		int star=5;
		
		for(int i=1;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		space++;
		star--;
	}

}
