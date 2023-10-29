package anotherpackageprotected;

public class anotherpackage {
	protected int anotherpackageMethod(int a,int b) {
		int c=a+b;
		System.out.println(c+" Hi i am another package accessed by the protected with subclass");
		
		return c;
	}
	

}
