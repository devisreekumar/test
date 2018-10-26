package com.nissan.training_core_java;

public class Stringeg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]={"Nissan","digital","global","company"};
		
		
		String s1=s[3];
		String s2=s[0].substring(1, 3);
		String s3=s[1].substring(3, 5);
		
		System.out.println(String.format("My %s %s %s.", s1,s2,s3.toUpperCase()));
		

	}

}
