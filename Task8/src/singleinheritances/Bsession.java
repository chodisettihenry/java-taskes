package singleinheritances;

public class Bsession extends Asession {
	int bsessionMethod(int a,int b) {
		 addtion = a+b;
		 System.out.println("i am Bsesion method with single inheritances "+addtion);
		 return addtion;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bsession obj = new Bsession();
		obj.bsessionMethod(500, 200);
		obj.fistAsessionmethod();

	}

}
