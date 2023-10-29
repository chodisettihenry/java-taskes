package typeCasting;

public class ExplicitPossibleWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//typeCasting possible ways...
				/* typeCasting types.
				 1. implicit
				 2.Explicit.*/
				
				
				//Explicit ways..
		//long to int,float,char,short,byte
		//double to long,int,float,short,byte
		 // int to float,short,byte
		 //float to int,short,byte
		//short to byte
		//char to short,byte
		
		
		
				
				//long to int,float,char,short,byte
				
				 long a = 30000;
				 int possible_1a = (int)a;
				 float possible_1b = (float)a;
				 short possible_1c = (short) a;
				 byte possible_1d = (byte)a;
				 double possible_1e = (double)a;
		         System.out.println("long to int,float,char,short,byte");
		         System.out.println();
		         System.out.println("one possile way long to int = "+possible_1a);
		         System.out.println("one possile way long to float = "+possible_1b);
		         System.out.println("one possile way long to short = "+possible_1c);
		         System.out.println("one possile way long to byte = "+possible_1d);	
		         System.out.println("one possile way long to double = "+possible_1e);
		         System.out.println();
		         System.out.println();
		        
		       //double to long,int,float,short,byte
		        
		         double b = 30.000;
				 int possible_2a = (int)b;
				 float possible_2b = (float)b;
				 short possible_2c = (short) b;
				 byte possible_2d = (byte)b;
				 long possible_2e = (long)b;
		         System.out.println("double to long,int,float,short,byte");
		         System.out.println();
		         System.out.println("second possile way double to int = "+possible_2a);
		         System.out.println("second possile way double to float = "+possible_2b);
		         System.out.println("second possile way double to short = "+possible_2c);
		         System.out.println("second possile way double to byte = "+possible_2d);	
		         System.out.println("second possile way double to long = "+possible_2e);
		         System.out.println();
		         System.out.println();
		         
		         // int to float,short,byte
			        
		         int c = 300;
		         float possible_3a = (float)c;
				 short possible_3b = (short) c;
				 byte possible_3c = (byte)c;
		         System.out.println("int to float,short,byte");
		         System.out.println();
		         System.out.println("thrid possile way int to float = "+possible_3a);
		         System.out.println("thrid possile way int to short = "+possible_3b);
		         System.out.println("thrid possile way int to byte = "+possible_3c);
		         System.out.println();
		         System.out.println();
		         
		         //float to int,short,byte
		         
		         float d = 30.000f;
		         int possible_4a = (int)d;
				 short possible_4b = (short)d;
				 byte possible_4c = (byte)d;
		         System.out.println("float to int,short,byte");
		         System.out.println();
		         System.out.println("fourth possile way float to int = "+possible_4a);
		         System.out.println("fourth possile way float to short = "+possible_4b);
		         System.out.println("fourth possile way float to byte = "+possible_4c);
		         System.out.println();
		         System.out.println();
		         
		         //short to byte
		         
		         short e = 300;
		         byte possible_5a = (byte) e;
		         System.out.println("short to byte");
		         System.out.println();
		         System.out.println("fifth possile way float to int = "+possible_5a);
		         System.out.println();
		         System.out.println();
		         
		         //byte
		         
		         System.out.println("byte no possible ways because it is very low size(1 byte)");
		         System.out.println();
		         System.out.println();
		         
		         //char to short,byte
		         char f = 'a';
		     	 short possible_6a = (short) f;
				 byte possible_6b = (byte) f;
		         System.out.println("char to short,byte");
		         System.out.println();
		         System.out.println("six possile way char to short = "+possible_6a);
		         System.out.println("six possile way char to byte = "+possible_6b);
		         System.out.println();
		         System.out.println();
		         
		         
		       //boolean
		         
		         System.out.println("boolean is no possible ways because of 1 bit size");
		         System.out.println();
		         System.out.println();
		         System.out.println("Explicit all possible ways:");
		         
		     System.out.println("        long to int,float,char,short,byte\r\n"
	               	+ "	double to long,int,float,short,byte\r\n"
		     		+ "	int to float,short,byte\r\n"
		     		+ "	float to int,short,byte\r\n"
		     		+ "	short to byte\r\n"
		     		+ "        char to short,byte"); 
		         
		         
		         

	}

}
