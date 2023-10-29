package patterns.com;

public class Leftangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<3; i++)
		{
			for (int j=2*(3-i); j>=1; j--)         
			{
				System.out.print(" "); 
			}
			for (int j=1; j<=i; j++ )   
			{  
				System.out.print("* "); 
			}
		
		System.out.println();  
		}
	}

}
