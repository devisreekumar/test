package com.nissan.training_core_java;

public class Exampleinner {//static
	static int member=100;
	static class Innerone{
		void displaymember() {
			System.out.println("Value is"+member);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exampleinner.Innerone obj=new Exampleinner.Innerone();
		obj.displaymember();

	}

}
