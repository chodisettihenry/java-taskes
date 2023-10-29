package account;

import java.util.Scanner;

public class CallingAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accountstatements accountobj = new Accountstatements();
		 Scanner userinput = new Scanner(System.in);
		 String creatingPin;
		 short option;
		 System.out.print("Please enter your account holder name: ");
		 accountobj.setAccountHolderName();
		 System.out.print("Account Number: ");
		 accountobj.setAccountNumber();
		 System.out.print("Create your PIN (4 digits): ");
	         creatingPin = userinput.next();
	        //System.out.println(creatingPin);
	        System.out.println("Welcome to Mathew Bank...");
	       
	        accountobj.setDepositAmount();
      while(true) {
	        System.out.println("Select your options: \n1. Balance \n"
					+ "2. Deposit Amount \n"
					+ "3. WithDraw Amount \n"
					+ "4. Account Details \n"
					+ "5. Exit..\n");
	        System.out.print("Enter your option: ");
	         option = userinput.nextShort();
	         switch(option) {
	         case 1: System.out.println("Enter your pin:");
	                 String matchPin = userinput.next();
	                 if(creatingPin.equals(matchPin)) {
	                	
	                	 System.out.print("Account Number: ");
	                	 accountobj.setAccountNumber();
	                	 System.out.println("Total Balance amount :");
	                	 accountobj.displaygetBalanceamountforfirstdeposit();
	                	 
	                 }
	                 else {
	                	 System.out.println("Wrong pin... Try again again");
	                 }
	                 break;
	                 
	                 
	         case 2:System.out.println("Enter your pin:");
                    String matchPin1 = userinput.next();
                    if(creatingPin.equals(matchPin1)) {
                    	 System.out.print("Account Number: ");
	                	 accountobj.setAccountNumber();
	                	 System.out.println("Enter your deposit amount:");
	                	 accountobj.setUpdateddespositAmount();
	                	 System.out.println("succesfully amount desposited");
	                	 accountobj.displaygetBalanceamountforupdatedesposit();
	                	 
                    }
                    else {
	                	 System.out.println("Wrong pin... Try again again");
	                 }
                    break;
	         case 3:System.out.println("Enter your pin:");
                    String matchPin2 = userinput.next();
                   if(creatingPin.equals(matchPin2)) {
             	       System.out.print("Account Number: ");
             	       accountobj.setAccountNumber();
             	      System.out.println("Enter your withdraw amount");
             	      accountobj.setWithdrawAmount();
             	     System.out.println("processing.......");
                	 accountobj.displaygetBalanceamountforwithdraw();
             	      
                   }
                   else {
	                	 System.out.println("Wrong pin... Try again again");
	                 }
                  break;
	         case 4:System.out.println("Enter your pin:");
                    String matchPin3 = userinput.next();
                    if(creatingPin.equals(matchPin3)) {
                    	System.out.println("Welcome to Mathew Bank..Your Account Details........");
                    	System.out.print("Account Holder Name: ");
      	                 accountobj.displaygetAccountHolderName();
      	               System.out.print("Account Number: ");
      	                 accountobj.displaygetAccountNumber();
      	               System.out.print("Account Inistial Deposit: ");
      	                 accountobj.displaygetDepositAmount();
      	               System.out.print("Account Update Desposit: ");
      	                 accountobj.displaygetUpdateddespositAmount();
      	                 accountobj.displaygetBalanceamountforwithdraw();
                    }
                    else {
	                	 System.out.println("Wrong pin... Try again again");
	                 }
                 break;
	         case 5:System.out.println("Thank you for visiting Mathew bank.");
                    userinput.close();
                    System.exit(0);
             default:System.out.println("Invalid choice. Please select a valid or correct options 1,2,3,4,5.");
	         }
	         
      }
	         
	        

	}

}
