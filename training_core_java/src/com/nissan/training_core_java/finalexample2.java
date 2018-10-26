package com.nissan.training_core_java;
class car{
	final void run() {
		System.out.println("the car runs");
		
	}
}
public class finalexample2 extends car {
	/*void run() {//cannot override final method
		System.out.println("the car runs again");
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finalexample2 obj=new finalexample2();
		obj.run();

	}

}
