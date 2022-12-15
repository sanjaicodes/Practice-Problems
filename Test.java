package in.java.interfaceexamble;

interface I1
{
	default void m1()
	{
		m3();
		System.out.println("Hii I am default method from I1 interface");
		m3();
		m3();
	}
	
	static void m2()
	{
		System.out.println("Hii I am static method from I1 interface");
	}
	
	private void m3()
	{
//		This method reduce redunent code (commen statement) in any instance methods 
		System.out.println("Hii I am private method from I1 interface");
		m4();
	}
	
	private static void m4()
	{
		/*
		 *This method reduce redunent code (commen statement) in any static method methods method 
		 */
		System.out.println("Hii I am private static method from I1 interface");
	}
	
}

class IClass implements I1
{
	
}

public class Test {

	public static void main(String[] args) {
		
		IClass obj = new IClass();
		obj.m1();
		I1.m2();

	}

}
