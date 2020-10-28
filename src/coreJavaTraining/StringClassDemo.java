package coreJavaTraining;

public class StringClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//a String is a pre-build class in java
		
		//1. String literal
		String a = "javatraining";
		
		//2. By creating object of string
		String b = new String("hello");
		
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("e"));
		System.out.println(a.substring(3,6));
		System.out.println(a.substring(5));
		System.out.println(a.concat("rahul teaches"));
		//a.lenght()
		System.out.println(a.trim());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
	}

}
