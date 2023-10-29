package typeCasting;

public class ImplicitPossibleWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//typeCasting possible ways...
		/* typeCasting types.
		 1. implicit
		 2.Explicit.*/
		
		
		//implicit ways..
		//byte to short,int,long,float,double
		 //short to int,long,float,double
		 //int to float,double,long
		 //long to float,double
		//float to double
		//char to int,long,float,double
		
		//byte to short,int,long,float,double
		
		 byte a = 30;
         short possible_1a = a;
         int possible_1b = a;
         long possible_1c = a;
         float possible_1d = a;
         double possible_1e = a;
         System.out.println("byte to short,int,long,float,double");
         System.out.println();
         System.out.println("one possile way byte to short = "+possible_1a);
         System.out.println("one possile way byte to int = "+possible_1b);
         System.out.println("one possile way byte to long = "+possible_1c);
         System.out.println("one possile way byte to float = "+possible_1d);
         System.out.println("one possile way byte to double = "+possible_1e);	
         System.out.println();
         System.out.println();
        
       //short to int,long,float,double
        
         short b = 300;
         int possible_2a = b;
         long possible_2b = b;
         float possible_2c = b;
         double possible_2d = b;
         System.out.println("short  to int,long,float,double");
         System.out.println();
         System.out.println("second possile way short to int = "+possible_2a);
         System.out.println("second possile way short to long = "+possible_2b);
         System.out.println("second possile way short to float = "+possible_2c);
         System.out.println("second possile way byte to double = "+possible_2d);
         System.out.println();
         System.out.println();
         
       //int to float,double,long
         
         int c = 3000;
         long possible_3a = c;
         float possible_3b = c;
         double possible_3c = c;
         System.out.println("int to long,float,double");
         System.out.println();
         System.out.println("Thrid possile way int to long = "+possible_3a);
         System.out.println("Thrid possile way int to float = "+possible_3b);
         System.out.println("Thrid possile way int to double = "+possible_3c);
         System.out.println();
         System.out.println();
         
        //long to float,double
         long d = 30000;
         double possible_4b = d;
         System.out.println("long to double");
         System.out.println();
         System.out.println("Fourth possile way long to double = "+possible_4b);
         System.out.println();
         System.out.println();
         
 		//float to double
         float e = 30.0f ;
         double possible_5a = e;
         
         System.out.println("float to double");
         System.out.println();
         System.out.println("fifth possile way float to double = "+possible_5a);
         System.out.println();
         System.out.println();
         
         //double 
         System.out.println("double no possible ways");
         System.out.println();
         System.out.println();
         
         //char to int,long,float,double
         char f = 'a';
         int possible_6a = f;
         long possible_6b = f;
         float possible_6c = f;
         double possible_6d = f;
         System.out.println("char to int,long,float,double");
         System.out.println();
         System.out.println("six possile way char to int = "+possible_6a);
         System.out.println("six possile way char to long = "+possible_6b);
         System.out.println("six possile way char to float = "+possible_6c);
         System.out.println("six possile way char to double = "+possible_6d);	
         System.out.println();
         System.out.println();
	     
         //boolean
         
         System.out.println("boolean is no possible ways because of 1 bit size");
         System.out.println();
         System.out.println();
         System.out.println("Impicit possible ways:");
         
         System.out.println("        byte to short,int,long,float,double\r\n"
         		+ "	short to int,long,float,double\r\n"
         		+ "	int to float,double,long\r\n"
         		+ "        long to float,double\r\n"
         		+ "	float to double\r\n"
         		+ "	char to int,long,float,double");
      
	}
	
	

}
