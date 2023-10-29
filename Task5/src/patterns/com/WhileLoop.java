package patterns.com;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=5;
		i=1;
		while(i<=n) {
			j=1;
			while(j<=i) {
				System.out.print(j+" ");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
