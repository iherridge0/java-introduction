package coreJavaTraining;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "hello"; //String literal
		String b = "hello";
		a.concat("World"); //immutable
		System.out.println(a); //hello //hence strings are immutable the original a did not get updated on the concat 
		String s = new String("hello");
		String s1 = new String("hello");
		
		//StringBuffer and String Builder - Mutable
		StringBuffer sb = new StringBuffer("hello");
		sb.append("world");
		System.out.println(sb); //helloworld
		sb.insert(2,  "She"); 
		System.out.println(sb); //heShelloworld
		sb.replace(5, 7, "aa");
		System.out.println(sb); //heSheaaoworld
		sb.deleteCharAt(12);
		System.out.println(sb); //heSheaaoworl
		sb.reverse();
		System.out.println(sb); //lrowoaaehSeh
		//StringBuilder is not thread safe. It is Non synchronised - It is faster
		StringBuilder sbb = new StringBuilder("hello");
		System.out.println(sbb);
		
		System.out.println(a.equals(b)); //true
		System.out.println(a==b); //true
		System.out.println(a.equals(s));//true
		
		System.out.println(a==s);//false - not mathing the references! '=' blindly compares
		System.out.println(a==s1);//false - the references are different as they are defined with string class
	}
}
