package switchstatement;

import java.util.Scanner;

public class Fruit {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.println("Enter your Fruit name we check it is available");
		Scanner a = new Scanner(System.in);
		
		 String fruit_names = a.nextLine();
		 switch(fruit_names) {
		 case "banana" : System.out.println("banana fruit is available");
		                 break;
		 case "grapes" :System.out.println("grapes fruit is available");
                     break;
		 case "kiwi" : System.out.println("kiwi fruit is available");
                       break;
		 case "orange" : System.out.println("orange fruit is available");
         break;
		 case "apple" : System.out.println("apple fruit is available");
         break;
		 case "pineapple" : System.out.println("pineapple fruit is available");
		                    break;
		 
		 case "peak" : System.out.println("peak fruit is available");
         break;
		 case "mango" : System.out.println("mango fruit is available");
         break;
		 case "papaya" : System.out.println("papaya fruit is available");
         break;
		 case "watermelon" : System.out.println("watermelon fruit is available");
         break;
		 case "apriot" : System.out.println("apriot fruit is available");
         break;
		 case "fig" : System.out.println("fig fruit is available");
         break; 
         case "jack" : System.out.println("jack friut is available");
         break;
         case "pulm" : System.out.println("pulm  fruit is available");
         break;
         case "lychee" : System.out.println("lychee fruit is available");
         break;
         case "blueberry" : System.out.println("blueberry fruit is available");
         break;
         case "cherry" : System.out.println("cherry fruit is available");
         break;
         case "stawberry" : System.out.println("stawberry fruit is available");
         break;
         case "guava" : System.out.println("guava fruit is available");
         break;
         default  :  System.out.println("we are sorry fruit is not available please try again");
         
		 }		 
		 
	}

}
