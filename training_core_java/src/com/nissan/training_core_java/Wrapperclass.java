package com.nissan.training_core_java;

public class Wrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int x=20;
		Integer i=Integer.valueOf(x);
		Integer j=x;//autoboxing
		System.out.println(x+" "+i+" "+j);
*/
		Integer a=new Integer(3);
		int i=a.intValue();//
		int j=a;//unboxing
		System.out.println(a+" "+i+" "+j);
		
	}

}
