package com.nissan.training_core_java;

public class Threadex3 extends Thread {
	public void run() {
		int a=5,b=2;
		for(int i=0;i<5;i++) {
		if(a>b)
		System.out.println("Difference:"+(a-b));
		}
		for(int i=0;i<5;i++) {
			if(b<a)
			System.out.println("Add:"+(a+b));
			}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadex3 t1=new Threadex3();
		Threadex3 t2=new Threadex3();
		t1.start();
		t2.start();

	}

}
