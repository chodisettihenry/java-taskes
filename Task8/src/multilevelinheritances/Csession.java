package multilevelinheritances;

public class Csession extends Bsession {
	void csessionMethod() {
		System.out.println("I am c session method with multilevel inheritances");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Csession obj = new Csession();
		obj.AsessionMethod();
		obj.BsesionMethod();
		obj.csessionMethod();
		

	}

}
