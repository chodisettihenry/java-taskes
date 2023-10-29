package accessModiferProtected;
import anotherpackageprotected.anotherpackage;

public class BclassMainSession extends anotherpackage {
	protected void BclassSessionMethod() {
		System.out.println(" Hi, we are Asession Class varibles acessed by the protected within package subclass");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Asession obj = new Asession();
	    obj.AclassSession();
	    
	    BclassMainSession obj1 = new BclassMainSession();
	    obj1.BclassSessionMethod();
	    obj1.anotherpackageMethod(100,200);
	    
	
	    
	    
	    

	}

}
