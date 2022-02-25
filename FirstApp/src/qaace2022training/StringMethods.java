package qaace2022training;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Anantha";
		String s2="Raman";
		System.out.println("String s1 Length : "+s1.length());
		System.out.println("String s2 Lower Case : "+s2.toLowerCase());
		System.out.println("String s1 Lower Case : "+s1.toUpperCase());
		s1=s1.concat(s2);
		System.out.println("Full String :" +s1);
	}

}
