package com.nissan.training_core_java;

public class Priorityex extends Thread {
public void run() {
	System.out.println("Thread name is:"+Thread.currentThread().getPriority());
	System.out.println("Thread priority is:"+Thread.currentThread().getPriority());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Priorityex p1=new Priorityex();
		Priorityex p2=new Priorityex();
		
		p1.setPriority(Thread.MIN_PRIORITY);
		p2.setPriority(Thread.MAX_PRIORITY);
		p1.start();
		p2.start();

	}

}
