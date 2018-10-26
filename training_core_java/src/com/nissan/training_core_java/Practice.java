package com.nissan.training_core_java;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c,i=0;
		System.out.println(a);
		System.out.println(b);
		while(i<5) {
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		i++;
		}
	}

}
