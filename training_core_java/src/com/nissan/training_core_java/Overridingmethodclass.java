package com.nissan.training_core_java;
class Vehicle{
	void run() {
		System.out.println("vehicle is running");
	}
}
public class Overridingmethodclass extends Vehicle{
	void run() {
		System.out.println(" bike is running");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overridingmethodclass b=new Overridingmethodclass();
		b.run();

	}

}
