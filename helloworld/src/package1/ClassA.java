package package1;

public class ClassA {
	
	public String name="Shehzadi";
	public int standard=5;
	public int totmarks=500;
	private int marksobt=450;
	protected long mobnumber=9039055612l;
	String fathername="MD ISlam";
	String mothername="Tahira";

	protected static void Demo() {
		
		ClassA studrecord=new ClassA();
		
		System.out.println("NAME : "+studrecord.name);
		System.out.println("Class : "+studrecord.standard);
		System.out.println("Total Marks : "+studrecord.totmarks);
		System.out.println("Marks Obtained : "+studrecord.marksobt);
		System.out.println("Mobile Number : "+studrecord.mobnumber);
		System.out.println("Father Name : "+studrecord.fathername);
		System.out.println("Mother Name : "+studrecord.mothername);
		System.out.println("This is the Marksheet of Shehzadi");
		System.out.println("Congratulations and Thankyou");
}	
	public static void main(String[] args) {
		Demo();
		
	}
}
