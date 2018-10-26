package com.nissan.training_core_java;

//public class Threadex1 extends Thread{
public class Threadex1 implements Runnable{
	public void run() {
		System.out.println("Running a thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadex1 t=new Threadex1();
		Thread t1=new Thread(t);
		t1.start();
	}

}
