package qaace22training;

public class StringExamples {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString = "Anantharaman", myString2 = "Ragupathy", myString3="ananth";

        String s="    hello   ", s1="";

        System.out.println(myString.charAt(5));

        System.out.println(myString.length());

        System.out.println(myString.equals("Ananth"));

        System.out.println(myString.concat(myString2));

        System.out.println(myString.indexOf("a"));

        System.out.println(myString.compareTo(myString3));

        System.out.println(myString.toUpperCase());

        System.out.println(myString.toLowerCase());

        System.out.println(s.trim());
        
        System.out.println(s1.join(":","12","12"));

        System.out.println(myString.contains("man"));

        System.out.println(myString.substring(0,6));

        System.out.println(myString.replace("a","r"));

        System.out.println(myString.toUpperCase());

        System.out.println(s1.isEmpty());
	}

}
