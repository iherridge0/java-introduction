package coreJavaTraining;

public class FirstClass {
	
	//Global variables
	static int a = 4;

	
	//Methods
	public void getData() {
		
		System.out.println("I am a method");
	}
	
	

	//Main block
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(a);
		System.out.print("Hi, ");
		System.out.println("Hello World");
		
		//Objects are the instances/references of a class
		FirstClass fn = new FirstClass();
		fn.getData();
		
		SecondClass sn = new SecondClass();
		sn.getData();
	}

}
