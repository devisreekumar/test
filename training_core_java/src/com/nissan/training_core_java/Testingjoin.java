package com.nissan.training_core_java;

public class Testingjoin extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(800);
			}catch(Exception e) {
			System.out.println(e);	
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testingjoin t1=new Testingjoin();
		Testingjoin t2=new Testingjoin();
		Testingjoin t3=new Testingjoin();
		try {
			t1.join();
		}catch(Exception e) {
			System.out.println(e);
		
		}
		t2.start();
		t3.start();
	}

}
