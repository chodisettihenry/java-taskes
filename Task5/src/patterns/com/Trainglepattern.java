package patterns.com;

public class Trainglepattern {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		for(int i = 0 ; i<5;i++) {
			for(int j =0;j<5;j++) {
				if((i==0 && j==2) || ( i==1 && (j==1 || j==3)) ||( i==2 && (j==0 || j==1||j==2||j==3||j==4))) {
					System.out.print("*");
			
				}
				else
				{
					System.out.print(" ");				}
			}
			System.out.println();
		}

	}

}
