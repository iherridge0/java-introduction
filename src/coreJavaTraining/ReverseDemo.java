package coreJavaTraining;

public class ReverseDemo {

	/**
	 * Practise Exercise : reverse String logic-Palindrome
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "madam";
		String t = "";
		for(int i = s.length()-1; i >= 0; i--) {
			t = t + s.charAt(i);
		}
		System.out.println(t);
		
		//A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam, racecar.
		
		if(s==t) {
			System.out.println(s + " is a palindrome");
		}
	}

}
