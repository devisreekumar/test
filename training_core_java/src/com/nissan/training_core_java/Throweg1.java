package com.nissan.training_core_java;

public class Throweg1 {
	static void condition(int number) {
		if(number<10) {
			throw new ArithmeticException("is not valid");
			
		}
		else {
			System.out.println("you can go to college");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		condition(1);
		System.out.println("Otherss");

	}

}
