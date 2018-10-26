package com.nissan.training_core_java;

public class Exceptioneg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//int number=100/0;
			int a[]=new int[5];
			a[5]=30/0;
			
		}catch(ArithmeticException e) {
			System.out.println(e);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			
		}
		catch(Exception e) {
			System.out.println("others");
		}
		System.out.println("other parts of program");
		

	}

}
