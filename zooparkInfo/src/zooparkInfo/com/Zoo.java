package zooparkInfo.com;

import java.util.Scanner;

public class Zoo implements ChildPack,FamilyPack,YouthPack {
	Scanner sc1 = new Scanner(System.in);
   public void gamesZone() {
	   
	 boolean gamezonecondition = true;
	 while(gamezonecondition) {
		 System.out.println("select your Games:"+"\r"+"1. Frozen Tag"+"\r"+"2. Ship Caption"+"\r"+"3. Outdoor Bowling"+"\r"+"4. Tag Off The Ground"+"\r"+"5. Follow The Leader"+"\r"+"6. Exit out form Game Zone");
		   System.out.print("Enter your Game number: ");
		   int birdnumber = sc1.nextInt();
		   switch(birdnumber){
			   case 1: System.out.println("Rules and Regulations"+"\r"+"One person needs to be “it”, and everyone else needs to run from him. "+"\r"+"When the person who is “it” has any form of contact with another player, that player is frozen and cannot move."+"\r"+" The only way to unfreeze the person is for another player to crawl through the frozen player’s legs. The game does not end until whoever is “it” manages to freeze everyone");
			           System.out.println("prize: 50Rs");
			           break;
			   case 2: System.out.println("Rules and Regulations"+"\r"+"Two person needs to be “it”, and everyone else needs to run from him. "+"\r"+"When the person who is “it” has any form of contact with another player, that player is frozen and cannot move."+"\r"+" The only way to unfreeze the person is for another player to crawl through the frozen player’s legs. The game does not end until whoever is “it” manages to freeze everyone");
	                   System.out.println("prize: 100Rs");
	                   break;
			   case 3:System.out.println("Rules and Regulations"+"\r"+"Three person needs to be “it”, and everyone else needs to run from him. "+"\r"+"When the person who is “it” has any form of contact with another player, that player is frozen and cannot move."+"\r"+" The only way to unfreeze the person is for another player to crawl through the frozen player’s legs. The game does not end until whoever is “it” manages to freeze everyone");
	           System.out.println("prize: 250Rs");
	           break;
			   case 4:System.out.println("Rules and Regulations"+"\r"+"Two person needs to be “it”, and everyone else needs to run from him. "+"\r"+"When the person who is “it” has any form of contact with another player, that player is frozen and cannot move."+"\r"+" The only way to unfreeze the person is for another player to crawl through the frozen player’s legs. The game does not end until whoever is “it” manages to freeze everyone");
	           System.out.println("prize: 150Rs");
	           break;
			   case 5:System.out.println("Rules and Regulations"+"\r"+"One person needs to be “it”, and everyone else needs to run from him. "+"\r"+"When the person who is “it” has any form of contact with another player, that player is frozen and cannot move."+"\r"+" The only way to unfreeze the person is for another player to crawl through the frozen player’s legs. The game does not end until whoever is “it” manages to freeze everyone");
	           System.out.println("prize: 100Rs");
	           break;
			   case 6:System.out.println("Thank you for Visting Our Gaming Zone..");
			   gamezonecondition=false;
			   break;
	           default:System.out.println("Invalid Input...");
		   }
		   
	 }
		
	}
   public void birdsZone() {
	   System.out.println("Ticket prize..150rs");
	  boolean birdzonecondition = true;
	  while (birdzonecondition) {
		  System.out.println("select your favorite Bird Information:"+"\r"+"1. Parrots"+"\r"+"2. Love Birds"+"\r"+"3. Owl"+"\r"+"4. Exit out form bird Zone");
		   System.out.println("Rules and Regulations"+"\r"+"Don't Tounch any thing"+"\r"+"Don't throw any waste into the birds house..");
		   System.out.print("Enter your Game number: ");
		   int gamenumber = sc1.nextInt();
		   switch(gamenumber){
			   case 1: System.out.println("Parrots, also known as psittacines, are birds with a strong curved beak, upright stance, and clawed feet."+"\r"+"They are made up of four families that contain roughly 410 species"+"\r"+"  in 101 genera, found mostly in tropical and subtropical regions.");
			          
			           break;
			   case 2: System.out.println("Lovebird is the common name for the genus Agapornis, a small group of parrots in the Old World parrot family Psittaculidae."+"\r"+"Of the nine species in the genus, all are native to the African continent, with the grey-headed lovebird being native to the African island of Madagascar.");
	              
	                   break;
			   case 3:System.out.println("Owls are birds from the order Strigiformes, which includes over 200 species of mostly solitary and nocturnal birds of prey "+"\r"+"typified by an upright stance, a large, broad head, binocular vision, binaural hearing, sharp talons, and feathers adapted for silent flight.");
	          
	           break;
			   case 4 :System.out.println("Thank You for Visting Our birds Zone");
			          birdzonecondition=false;
			          break;
			   
	           default:System.out.println("Invalid Input...");
		   }
		
		  
	  }
   }
   public void foodZone() {
	   System.out.println("Foods Menu"+"\r"+"1. Burger.. 200rs"+"\r"+"2. pizza...160rs"+"\r"+"3.chicken fry..190rs"+"\r"+"4. briyani..280rs"+"\r"+"5. fired rice..130rs"+"\r"+"6. cool drinks..50rs"+"\r"+"7. water bottle..20rs"+"\r"+"8.ice cream..70rs");
	   
   }
   public void fishZone() {
	   System.out.println("Ticket prize..150rs");
	   
	   System.out.println("1.gold fish"+"\r"+"2. koi"+"\r"+"3. Asian Arowana"+"\r"+"4. blue discus"+"\r"+"5. peaceful betta");
	   System.out.println("Rules and Regulations"+"\r"+"Don't Tounch any thing"+"\r"+"Don't throw any waste into the Aquarium.."+"\r"+"Please make desertion upto 40cm..");
	   
   }
   
   public void animalZone() {
	   System.out.println("Ticket prize..250rs");
	   System.out.println("1.Tiger"+"\r"+"2. koi"+"\r"+"3. Asian Arowana"+"\r"+"4. blue discus"+"\r"+"5. peaceful betta");
	   System.out.println("Rules and Regulations"+"\r"+"Don't Tounch any thing"+"\r"+"Don't throw any waste into the Aquarium.."+"\r"+"Please make desertion upto 40cm..");
	   
	   
   }
   public void trainZone() {
	   System.out.println("Ticket prize..200rs");
	   System.out.println("Enjoy your journey with zoo Park View..");
	   System.out.println("Rules and Regulations"+"\r"+"Don't Tounch any thing"+"\r"+"Don't throw any waste into the house.."+"\r"+"Please make desertion upto 40cm..");
	   
	   
   }
   public void gardenparkZone() {
	   System.out.println("Ticket prize..100rs");
	   System.out.println("1.Waterflows"+"\r"+"2. sitting Area"+"\r"+"3. Big Toys"+"\r"+"4. green garden"+"\r"+"5. swing"+"\r"+"6. playground slide"+"\r"+"7. Tweteer totter");
	   System.out.println("Rules and Regulations"+"\r"+"Don't Tounch any thing"+"\r"+"Don't throw any waste on the garden instead off use dirstbins..");
	   
	   
   }
   public void adventureZone() {
	   
	   System.out.println("1.colmbus..100rs"+"\r"+"2. JentWell..150rs"+"\r"+"3. BreakDance..150rs"+"\r"+"4. Jumping Rope..120rs"+"\r"+"5. Rope Cyclinng..100rs");
	   System.out.println("Rules and Regulations"+"\r"+"Don't Tounch any thing"+"\r"+"Don't throw any waste into the area.."+"\r"+"Please make in security with lock your body..");
	   
	   
   }
   public void playGroundZone() {
	   System.out.println("1.circket..100rs"+"\r"+"2. Badmitton..150rs"+"\r"+"3. volleyball..150rs"+"\r"+"4. FootBall..120rs"+"\r"+"5. ThrowBall..100rs");
	   System.out.println("Rules and Regulations"+"\r"+"Don't Tounch any thing"+"\r"+"Don't throw any waste into the area.."+"\r"+"Play but don't spole any materials..");
	   
	  
	   
   }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Zoo obj = new Zoo();
		boolean conditionChild = true;
		boolean conditionYouth = true;
		boolean conditionFamily = true;
		int age = 0;

		
		System.out.println("Maruyo Zoo Park");
		
		
		String userName ="Mathew123@";
		String userPassword ="1234";
		
		System.out.print("User Name: ");
		String userinput = sc.nextLine();
		System.out.println();
		System.out.print("User Password: ");
		String userPass = sc.nextLine();
		if((userinput.equals(userinput)) && (userPass.equals(userPass))) {
			System.out.println("Welcome to Maruyo Zoo Park");
			System.out.print("Enter your age:");
			 age = sc.nextInt();
			if(age<=17) {
				System.out.println("Welcome to ChildPack.."+"\r"+"Price..200rs");
				while(conditionChild) {
					System.out.println("Select your zone"+"\r"+"1. GamingZone"+"\r"+"2. Fishzone"+"\r"+"3. FoodZone"+"\r"+"4. GardenParkZone"+"\r"+"5. BirdsZone"+"\r"+"6. exit from the childpack.");
		            System.out.print("Enter your zone Number: ");
		            int childzone = sc.nextInt();
		            switch(childzone) {
		            case 1: obj.gamesZone();
		                    break;
		            case 2: obj.fishZone();
		                    break;
		            case 3: obj.foodZone();
		                    break;
		            case 4: obj.gardenparkZone();
		                    break;
		            case 5: obj.birdsZone();
		                    break;
		           
		            case 6: System.out.println("ThankYou For Visiting Our Maruyo Zoo Park");
		                    conditionChild = false;
		                    break;
		            default: System.out.println("Invalid choice. Please select a valid or correct options 1,2,3,4,5,6.");
				      
		          
		            }
				}
	            
				
			}
		}
			else if(age>=18 && age<=30) {
				System.out.println("Welcome to YouthPack.."+"\r"+"Price..500rs");
				while(conditionYouth) {
					System.out.println("Select your zone"+"\r"+"1. GamingZone"+"\r"+"2. Fishzone"+"\r"+"3. FoodZone"+"\r"+"4. GardenParkZone"+"\r"+"5. BirdsZone"+"\r"+"6. adventureZone"+"\r"+"7. AnimalZone"+"\r"+"8. trainZone"+"9.PlaygroundZone"+"10. exit from the childpack.");
		            System.out.print("Enter your zone Number: ");
		            int childzone = sc.nextInt();
		            switch(childzone) {
		            case 1: obj.gamesZone();
		                    break;
		            case 2: obj.fishZone();
		                    break;
		            case 3: obj.foodZone();
		                    break;
		            case 4: obj.gardenparkZone();
		                    break;
		            case 5: obj.birdsZone();
		                    break;
		            case 6: obj.adventureZone();
                             break;
                   case 7: obj.animalZone();
                            break;
                   case 8: obj.trainZone();
                            break;
                   case 9: obj.playGroundZone();
                           break;
		           case 10: System.out.println("ThankYou For Visiting Our Maruyo Zoo Park");
		                    conditionYouth = false;
		                    break;
		                    
		            
		            default: System.out.println("Invalid choice. Please select a valid or correct options 1,2,3,4,5,6,7,8,9,10.");
				      
		          
		            }
				
				
				
			}
			}
			else if(age>=31) {
				System.out.println("Welcome to Family Pack.."+"\r"+"Price..300rs");
				while(conditionFamily) {
					System.out.println("Select your zone"+"\r"+"1. GamingZone"+"\r"+"2. Fishzone"+"\r"+"3. FoodZone"+"\r"+"4. GardenParkZone"+"\r"+"5. BirdsZone"+"\r"+"6. AnimalZone"+"\r"+"7. trainZone"+"\r"+"8. exit from the childpack.");
		            System.out.print("Enter your zone Number: ");
		            int childzone = sc.nextInt();
		            switch(childzone) {
		            case 1: obj.gamesZone();
		                    break;
		            case 2: obj.fishZone();
		                    break;
		            case 3: obj.foodZone();
		                    break;
		            case 4: obj.gardenparkZone();
		                    break;
		            case 5: obj.birdsZone();
		                    break;
		            case 6: obj.animalZone();
                            break;
                    case 7: obj.trainZone();
                            break;

		            case 8: System.out.println("ThankYou For Visiting Our Maruyo Zoo Park");
		                    conditionFamily = false;
		                    break;
		           
                  
		            default: System.out.println("Invalid choice. Please select a valid or correct options 1,2,3,4,5,6,7,8.");
				      
		          
		            }
			}
			
		}
		else {
			System.out.println("Your Login Creditals is don't match. please try again.");
		}
		


	}

}
