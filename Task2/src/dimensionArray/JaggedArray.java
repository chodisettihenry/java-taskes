package dimensionArray;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Jagged Array
		//int[][] a = new int[2][3];
				int[][] a = {{10,20},
						     {40,20,30}};
				System.out.println("printing of single element process: "+a[0][1]);
				System.out.println();
				System.out.println("printing of multiple elements process: ");
				for(int i=0;i<a.length;i++) {
					for(int j=0;j<a[i].length;j++) {
						System.out.print(a[i][j]);
						//if(i<2 && j<2 ) {
						if(j== (a[i].length)-1) {
							System.out.print(".");
						}
						else {
							System.out.print(",");
							
							
						}
						
					}
					System.out.println();
				}

	}

}
