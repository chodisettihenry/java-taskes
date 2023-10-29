package loginDetail;
import java.util.Scanner;

public class Login {
	
	Scanner sc = new Scanner(System.in);
	
	public void passwordData() {
		String userName = "Team123@";
		int userPassword = 1234;
		String userpassConvert = Integer.toString(userPassword);
		
		
		System.out.print("Enter your Username: ");
		String userSidename = sc.nextLine();
		
		System.out.println();
		System.out.println("Enter your password: ");
		int userSidePassword = sc.nextInt();
		String userSidePassCovert = Integer.toString(userSidePassword);
		
		if((userName.equals(userSidename)) && (userpassConvert.equals(userSidePassCovert))){
	          System.out.println("Your Succefully logined");		
			
		}
		else {
			System.out.println("Invalid username and userpassword");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Login obj = new Login();
		obj.passwordData();

	}

}
