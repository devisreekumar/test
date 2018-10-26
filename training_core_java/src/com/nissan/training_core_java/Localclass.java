package com.nissan.training_core_java;


public class Localclass {
	private int data=100;
	void message(){
		class Local{
			void display() {
				System.out.println("data"+100);
			}
		}
		Local i=new Local();
		i.display();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Localclass abc=new Localclass();
		abc.message();

	}

}
