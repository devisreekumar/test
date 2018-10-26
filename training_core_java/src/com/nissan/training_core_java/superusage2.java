package com.nissan.training_core_java;
class Animaal{
	void eat() {
		System.out.println("Animal is eating");
	}
}
class Cheetaah extends Animaal{
	void eat() {
		System.out.println("eating deer");
	}
	void roar() {
		System.out.println("Cheetah is roaring");
	}
	void working() {
		super.eat();
		roar();
	}
}
public class superusage2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cheetaah c=new Cheetaah();
		c.working();

	}

}
