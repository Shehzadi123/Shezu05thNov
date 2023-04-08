package pattern;

public class SpacePyramid {
	public static void main(String[] args) {
		
		
		for(int i=1;i<=5;i++) {
			
			for(int k=5;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=5;j<=10;j++) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		
		
		for(int l=1;l<=5;l++) {
			for(int m=1;m<=l;m++) {
				System.out.print(" ");
			}
			for(int n=5;n<=10;n++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
