package dimensionArray;

public class MultiArrayDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Multi dimension array
		//int[][] a = new int[2][3];
		int[][] a = {{10,20,30},
				     {40,20,50}};
		System.out.println("printing of single element process: "+a[0][2]);
		System.out.println();
		System.out.println("printing of multiple elements process: ");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]);
				if(i<2 && j<2) {
					System.out.print(",");
				}
				else {
					System.out.print(".");
					break;
				}
				
			}
			System.out.println();
		}
		

	}

}
