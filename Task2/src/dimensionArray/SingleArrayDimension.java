package dimensionArray;

public class SingleArrayDimension {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//Array Single dimension....
		
		//one method of creating single dimension array...
		/*int[] a = new int[5];
		  a[0] = 10;
		  a[1] = 20;
		  a[2] = 30;
		  a[3] = 40;
		  a[4] = 50;*/
		
		//second method of creating single dimension array...
		
		int[] a = {10,20,30,40,50};
		System.out.println("printing single element process  "+a[2]);
		System.out.println();
		System.out.print("printing multi elements process: ");
		for(int i=0; i<5;i++)
		{
			System.out.print(a[i]);
			if(i < 4) {
			System.out.print(",");
			}
			else {
				System.out.println(".");
				break;
			}
		}
		
		 

	}

}
