package StringMethod;

public class AllMethods {
	public static void main(String []args) {
		String a = "mahi";
		System.out.println(a.charAt(2));
		System.out.println(a.replace("M", "R"));
		System.out.println(a.isEmpty());
		String b = "RutujuKolte";
		String c = "MAHI";
		System.out.println(a.concat(b));
		System.out.println(b.substring(6));
		System.out.println(b.substring(2, 8));
		System.out.println(b.startsWith("K"));
		System.out.println(b.endsWith("e"));
		System.out.println(b.indexOf("u"));
		System.out.println(b.lastIndexOf("u"));
		System.out.println(b.length());
		System.out.println(b.contains(a));
		System.out.println(a.equals(c));
		System.out.println(a.equalsIgnoreCase(c));
		System.out.println(a.toUpperCase());
		System.out.println(c.toLowerCase());
		
		String d = " MynameisShehzadi ";
		System.out.println(d.trim());
		
		String e = String.join(a,b,d,c,d);
		System.out.println(e);
		
		String f = "MahiaKartikaShezuaSavitaaRutuja";
		String[] g = f.split("j");
		
		for(int i=0;i<g.length;i++) {
			System.out.println(i);
		}
	}

}
