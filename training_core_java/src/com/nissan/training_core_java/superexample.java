package com.nissan.training_core_java;
class Animals{
	String color="Green";
	
}
class Cheetahh extends Animals{
	String color="Orange";
	void display() {
		System.out.println(color);
		System.out.println(super.color);
	}
}
public class superexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cheetahh c=new Cheetahh();
		c.display();

	}

}
