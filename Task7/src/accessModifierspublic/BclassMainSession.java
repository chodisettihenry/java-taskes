
package accessModifierspublic;

import publicanotherPackage.AnotherPakage;

public class BclassMainSession extends Asession {
	public void BclassSession() {
		System.out.println((a+b)+" Hi, we are Asession Class varibles acessed by the public within package subclass");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Asession obj = new Asession();
		obj.AclassSession();
		
		BclassMainSession obj1 = new BclassMainSession();
		obj1.BclassSession();
		
		AnotherPakage obj2 = new AnotherPakage();
		obj2.anotherPackageMethod(500, 500);
		

	}

}
