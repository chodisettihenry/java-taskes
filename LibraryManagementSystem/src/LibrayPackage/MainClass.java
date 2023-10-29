package LibrayPackage;

import java.util.Scanner;
import java.util.ArrayList;

public class MainClass implements LibrarySystem {
	Scanner sc = new Scanner(System.in);
	 ArrayList<String> Booklist = new ArrayList<>();
	 ArrayList<String> Author = new ArrayList<>();
	 ArrayList<Integer> Prize = new ArrayList<>();
	
	
	public void Password() {
		String password = "1234";
		System.out.println("Enter your Four digit password");
		String Inputpassword = sc.nextLine();
		if(password.equals(Inputpassword)) {
			
			
			
		}
		else {
			System.out.println("Invalid password");
		}
	}
		
		public void addBook() {
			        
			       
			        while (true) {
			        	System.out.println("Enter Books names After complete (type 'exit' to stop):");
			        	
			        	System.out.print("Add Book..Enter book name: ");
			            String addbook = sc.next();
			           
			        	 if (addbook.equalsIgnoreCase("exit")) {
			        		 break;
				            	
				                
			        	 }
			        	 
			        	 else {
			        	 System.out.println("Enter Author Name: ");
				            String addAuthor = sc.nextLine();
				            sc.nextLine();
				            System.out.println("Enter Book price: ");
				            int addprice = sc.nextInt();
				          
				            System.out.println(addbook+" Book is added succesfully");
				          
				            Booklist.add(addbook);
				            Author.add(addAuthor);
				            Prize.add(addprice);
			        	 }
			        	 
				         
			            
			        }

			        System.out.println("Books list:");
			        for (String books : Booklist) {
			            System.out.println(books);
			        }
	}
		public void removeBook() {
	        System.out.println("Enter Books names After complete (type 'exit' to stop):");

	        while (true) {
	            System.out.print("remove Book..Enter book name: ");
	            String removebook = sc.nextLine();
	            System.out.println(removebook+" Book is remove succesfully");
	            if(Booklist.equals(removebook)) {
	            	 Booklist.remove(removebook);
	            }
	            

	            else if (removebook.equalsIgnoreCase("exit")) {
	                break;
	            }

	           
	        }

	        System.out.println("\n Books List:");
	        for (String books : Booklist) {
	            System.out.println(books);
	        }
}
		public void clearBook() {
			Booklist.clear();
			System.out.println(Booklist);
			
		}
		public void buyBook() {
			System.out.println("Enter a book name: ");
			String newBook = sc.nextLine();
			if(Booklist.equals(newBook)) {
				System.out.println(newBook);
				System.out.println(Author.get(0));
				System.out.println(Prize.get(0));
				int localstore = Prize.get(0);
				System.out.println("Enter your amount to buy book "+newBook+" : ");
				int amount = sc.nextInt();
				if(localstore==amount) {
					System.out.println("Thank you visiting our library.");
				}
				else if(localstore>amount || localstore<amount) {
					System.out.println("please enter sufficent amount");
					
				}
				else {
					System.out.println("we are sorry");
				}
				
				
			}
		}
		public void returnBook() {
			System.out.println("Enter a book name: ");
			String returningBook = sc.nextLine();
			if(Booklist.equals(returningBook)) {
				System.out.println("Thank you reading this book" +returningBook);
			}
			else {
				System.out.println("We are sorry fine charge Rs.500 for Book lose");
			}
		}
		public void reviewBook() {
			System.out.println("Enter your review: ");
			String review = sc.nextLine();
			System.out.println("Thank you for your review");
		}


	public static void main(String[] args) {
		MainClass obj = new MainClass();
		
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Welcome to Libray Management System");
		
		boolean condition = true;
		boolean conditionUser = true;
		boolean conditionType = true;
		while(conditionType) {
			
			System.out.println("Please select the type of User:");
			System.out.println("1.librarian");
			System.out.println("2.Customer");
			System.out.println("3.exit");
			
			System.out.print("Enter your option: ");
			byte Typeoption = input.nextByte();
			switch(Typeoption){
			case 1 : obj.Password();
			        
                       
				        while(condition) {
				 
					        	System.out.println("Select the option");
					        	System.out.println("1.add books");
					        	System.out.println("2.remove books");
					        	System.out.println("3.clear all Books");
					        	System.out.println("4.exit");
					        	System.out.print("Enter your option: ");
						         int booktypeOption = input.nextInt();
						         switch(booktypeOption) {
						         case 1 : obj.addBook();
						                  break;
						         case 2 : obj.removeBook();
						                  break;
						         case 3 : obj.clearBook();
						                  break;
						         case 4 : System.out.println("Your are logout successfully");
						                  condition=false;
						        	       break;
						        	     
						         default:System.out.println("Invalid choice. Please select a valid or correct options 1,2,3,4.");
						        
				        	 }
						         
						         
					         
				        }
				        break;
					        
		
			               
			case 2 :  while(conditionUser) {
				System.out.println("Select the option");
				System.out.println("1.buy a book");
				System.out.println("2.return of books");
				System.out.println("3.review of Books");
				System.out.println("4.exit");
				System.out.print("Enter your option: ");
		         int customertypeOption = input.nextInt();
		         switch(customertypeOption) {
		         case 1 :System.out.println("\n Books List:");
			             for (String books : obj.Booklist) {
			            	 System.out.println(books);
			        }
		        	     obj.buyBook();
		        	     break;
		         case 2: obj.returnBook();
		                 break;
		         case 3: obj.reviewBook();
		                 break;
		         case 4 :System.out.println("Thank your for Visting our Library Store");
		                 conditionUser=false;
        	             break;
		         default:System.out.println("Invalid choice. Please select a valid or correct options 1,2,3,4.");
		         }
		         
				
			}
			break;
			case 3: System.out.println("Thank you visiting our library managament");
			        System.exit(0);
			        break;
			default:System.out.println("Invalid choice. Please select a valid or correct options 1,2.");
		
			         
			         
			}
			
		}

	}

}
