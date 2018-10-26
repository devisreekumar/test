package com.nissan.training_core_java;
abstract class Carss{
	Carss(){//constructor
		System.out.println("this is a constructor");
	}
	abstract void run();//abstract method
	void gear() {//non abstract method
		System.out.println("change the gear");
		
	}
}
public class Abstractclass extends Carss{
	void run() {
		System.out.println("running the car");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractclass c=new Abstractclass();
		c.run();
		c.gear();

	}

}
