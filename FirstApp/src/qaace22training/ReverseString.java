package qaace22training;

public class ReverseString {
	public static String rString(String s){  
		char ch[]=s.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--){  
			rev+=ch[i];  
		}  
		return rev;  
	}  
	public static void main(String[] args) {  
		System.out.println(rString("Francis Bell Ajay"));  
		System.out.println(rString("Kubera Varman"));
		System.out.println(rString("Thanushree"));
		System.out.println(rString("Pavithra"));
		System.out.println(rString("Anantharaman"));
	}  
}  
