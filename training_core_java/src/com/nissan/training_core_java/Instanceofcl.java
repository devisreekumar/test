package com.nissan.training_core_java;
class Parentinst {
	
}

public class Instanceofcl extends Parentinst{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instanceofcl i=new Instanceofcl();

		System.out.println(i instanceof Instanceofcl);//same class
		
		System.out.println(i instanceof Parentinst);//parent class

	}

}
