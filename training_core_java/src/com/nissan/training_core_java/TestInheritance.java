package com.nissan.training_core_java;
class Animal{
	void voice() {
		System.out.println("Making sounds");
	}
}
class Cheetah extends Animal{
	void roar() {
		System.out.println("roaring");
	}
}
class Dog extends Cheetah{
	void weep() {
		System.out.println("weeping");
	}
}
public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.voice();
		d.roar();
		d.weep();

	}

}
