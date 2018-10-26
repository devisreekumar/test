package com.nissan.training_core_java;
abstract class Customer{
	abstract void name();
}
public class Anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer() {
			void name() {
				System.out.println("Hello");
			}
		};
		c.name();

	}

}
