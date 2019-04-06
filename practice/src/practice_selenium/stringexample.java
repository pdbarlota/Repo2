package practice_selenium;

public class stringexample {

	
	public static void main(String[] args) {
		String a ="Pahel";
		String b= new String("ekta");
		
		//check the length
		int c= a.length();
		System.out.println(c);
		
		//print in uppercase
		String d=a.toUpperCase();
		System.out.println(d);
		char h=a.charAt(0);
		System.out.println(h);
		
		for(int i=a.length()-1;i>=0;i--) {
			System.out.println(a.charAt(i));
		}
			String r=a.substring(0,3);
			System.out.println(r);
			
			
		
	

	}

}
