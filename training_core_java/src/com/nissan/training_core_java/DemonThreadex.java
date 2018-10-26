package com.nissan.training_core_java;
////
public class DemonThreadex extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("the daemon thread is working");
		}
		else {
			System.out.println("user thread is working");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemonThreadex t1=new DemonThreadex();
		DemonThreadex t2=new DemonThreadex();
		DemonThreadex t3=new DemonThreadex();
//t1.start();		
t1.setDaemon(true);//this sets my t1 as daemon
t1.start();
t2.start();
t3.start();
	}

}
