package operators.com;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte a = 120;
		byte b = 100;
		
		if(a==b || a!=b) {
			System.out.println("it's me logical OR operator");
			
		}
		else if(a>b && a<b) {
			System.out.println("it's me logical AND operator");
			
		}
		else if(!(a>b))
		{
			System.out.println("it's me logical NOT operator");
		}
	}

}
