package elseIf.com;

import java.util.Scanner;

public class City {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//else if statements using to print city names....
		System.out.println(" String.equal method is used to campare the two strings data");
		System.out.println();		System.out.println("Enter your city name(code) we check and inform you city name:");
		
		Scanner a = new Scanner(System.in);
		
		 String city_names = a.nextLine();
		 if(city_names.equals("HYD"))
		 {
			 System.out.println("Welcome to Hyderbad");
		 }
		 else if(city_names.equals("SC"))
		 {
			 System.out.println("Welcome to Secunderabad");
			 
		 }
		 else if(city_names.equals("BZA")) {
			 System.out.println("Welcome to vijawada");
			 
		 }
		 else if(city_names.equals("KZJ")) {
			 System.out.println("Welcome to kazipet");
		 }
		 else if(city_names.equals("KOAA")) {
			 System.out.println("Welcome to kolkata");
		 }
		 else if(city_names.equals("MTJ")) {
			 System.out.println("Welcome to Mathura");
		 }
		 else if(city_names.equals("NS")) {
			 System.out.println("Welcome to Naraspur");
		 }
		 else if(city_names.equals("PURI")) {
			 System.out.println("Welcome to puri");
		 }
		 else if(city_names.equals("BZA")) {
			 System.out.println("Welcome to vijawada");
		 }
		 else if(city_names.equals("TPTY")) {
			 System.out.println("Welcome to Tirupati");
		 }
		 else if(city_names.equals("BRC")) {
			 System.out.println("Welcome to vododara");
		 }
		 else if(city_names.equals("VSKP")) {
			 System.out.println("Welcome to visakhapatnam");
		 }
		 else if(city_names.equals("ZBD")) {
			 System.out.println("Welcome to zafarabad");
		 }
		 else if(city_names.equals("WL")) {
			 System.out.println("Welcome to warangal");
		 }
		 else if(city_names.equals("WADI")) {
			 System.out.println("Welcome to wadi");
		 }
		 else if(city_names.equals("VZM")) {
			 System.out.println("Welcome to vzianagaram");
		 }
		 else if(city_names.equals("ST")) {
			 System.out.println("Welcome to surat");
		 }
		 else if(city_names.equals("BSB")) {
			 System.out.println("Welcome to varanasi");
		 }
		 else if(city_names.equals("TIR")) {
			 System.out.println("Welcome to tirur");
		 }
		 else if(city_names.equals("TDD")) {
			 System.out.println("Welcome to tadepalligudem");
		 }
		 
		else {
			 System.out.println("we are sorry please try again");
		 }
		 
		
	}

}
