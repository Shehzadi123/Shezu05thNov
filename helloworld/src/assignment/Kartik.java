package assignment;

public class Kartik extends RunTimePoly{
	public void Demo() {
		System.out.println("KArtik aur pagal ho gaya");
	}
	
	public static void main(String[] args) {
		Kartik x = new Kartik();
		x.Demo();
		RunTimePoly y = new Kartik();
		y.Demo();
		RunTimePoly z = new RunTimePoly();
		z.Demo();
	}
	

}
