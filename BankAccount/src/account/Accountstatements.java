package account;

import java.util.Scanner;

public class Accountstatements {
	private String AccountHolderName;
	private long AccountNumber;
	private double depositAmount;
	private double updateddespositAmount;
	private double withdrawAmount;
	public double balanceamount;
	double deposits;
	double withdrawamount;
	
	
	Scanner input = new Scanner(System.in);

	public String getAccountHolderName() {
		return AccountHolderName;
	}

	public void setAccountHolderName() {
		
		
		AccountHolderName = input.nextLine();
	}
	public void displaygetAccountHolderName() {
		System.out.println(this.getAccountHolderName());
	}

	public long getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber() {
		
		AccountNumber = input.nextLong();
	}
	public void displaygetAccountNumber() {
		System.out.println(this.getAccountNumber());
	}

	public double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount() {
		System.out.print("FirstDesposit: ");
		int changedouble = input.nextInt();
		depositAmount = (double) changedouble;
	}
	public void displaygetDepositAmount() {
		System.out.println(this.getDepositAmount());
	}

	public double getUpdateddespositAmount() {
		return updateddespositAmount;
	}

	public void setUpdateddespositAmount() {
		
		int deposit = input.nextInt();
		updateddespositAmount = (double) deposit;
	}
	public void displaygetUpdateddespositAmount() {
		System.out.println(this.getUpdateddespositAmount());
	}

	public double getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount() {
		
		int withdraw = input.nextInt();
		withdrawAmount = (double) withdraw;
	}

	/*public double getBalanceamount() {
		return balanceamount;
	}

	public void setBalanceamount() {
		System.out.println("your balance");
		double deposits = depositAmount+updateddespositAmount;
		double withdraw = deposits - withdrawAmount;
		this.balanceamount = deposits+withdraw;
	}*/
	/*public void displaygetBalanceamount() {
		System.out.print("your balance: ");
		double deposits = depositAmount+updateddespositAmount;
		double withdrawamount = deposits - withdrawAmount;
		balanceamount = deposits+withdrawamount;
		
		System.out.println(balanceamount);
	}*/
	public void displaygetBalanceamountforfirstdeposit() {
		System.out.print("your balance: ");
		//double deposits = depositAmount+updateddespositAmount;
		//double withdrawamount = deposits - withdrawAmount;
		balanceamount = depositAmount;
		
		System.out.println(balanceamount);
	}
	public void displaygetBalanceamountforupdatedesposit() {
		System.out.print("your balance: ");
		 deposits = depositAmount+updateddespositAmount;
		//double withdrawamount = deposits - withdrawAmount;
		balanceamount = deposits;
		
		System.out.println(balanceamount);
	}
	public void displaygetBalanceamountforwithdraw() {
		System.out.print("your balance: ");
		if(withdrawAmount<=balanceamount) {
			withdrawamount = withdrawAmount-deposits;
			balanceamount = withdrawamount;
			System.out.print("Your amount successfully withdraw..collect your cash....");
			System.out.println(balanceamount);
		}
		else {
			System.out.println("Insufficient balance..");
			System.out.println("your balance amount only "+balanceamount+"Rs..");
		}
	
		 
	}
	public void displaygetBalanceamountfordetails() {
		System.out.print("your balance: ");
	
		//double withdrawamount = deposits - withdrawAmount;
		
		
		System.out.println(balanceamount);
	}

	

}
