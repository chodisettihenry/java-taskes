package switchstatement;

import java.util.Scanner;

public class City {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your city name(code) we check and inform you city name:");
		Scanner a = new Scanner(System.in);
		
		 String city_names = a.nextLine();
		 switch(city_names) {
		 case "HYD" : System.out.println("Welcome to Hyderbad");
		              System.out.println("");
		              break;
		 case "SC" :System.out.println("Welcome to Secunderabad");
                     break;
		 case "BZA" : System.out.println("Welcome to vijawada");
                       break;
		 case "KZJ" : System.out.println("Welcome to Hyderbad");
         break;
		 case "KOAA" : System.out.println("Welcome to kolkata");
         break;
		 case "TPTY" : System.out.println("Welcome to trupati");
		               break;
		 
		 case "MTJ" : System.out.println("Welcome to Mathura");
         break;
		 case "NS" : System.out.println("Welcome to Narasapur");
         break;
		 case "PURI" : System.out.println("Welcome to puri");
         break;
		 case "BRC" : System.out.println("Welcome to vododara");
         break;
		 case "VSKP" : System.out.println("Welcome to visakhapatnam");
         break;
		 case "ZBD" : System.out.println("Welcome to zafarabad");
         break; 
         case "WL" : System.out.println("Welcome to warangal");
         break;
         case "WADI" : System.out.println("Welcome to wadi");
         break;
         case "VZM" : System.out.println("Welcome to vzianagaram");
         break;
         case "ST" : System.out.println("Welcome to surat");
         break;
         case "BSB" : System.out.println("Welcome to varanasi");
         break;
         case "TIR" : System.out.println("Welcome to tirur");
         break;
         case "TDD" : System.out.println("Welcome to tadepalligudem");
         break;
         default  :  System.out.println("we are sorry please try again");
                 
		 }		 
		 
	}

	}


