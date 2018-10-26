package com.nissan.training_core_java;

public class Threadex2 extends Thread {
	public void run() {
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadex2 t=new Threadex2();
		t.run();

	}

}
