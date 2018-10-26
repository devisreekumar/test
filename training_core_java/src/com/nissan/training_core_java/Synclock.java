package com.nissan.training_core_java;

class Print1{
	 void printValue(int a) {
		 synchronized(this){for(int i=1;i<=5;i++) {
			System.out.println(a*i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		 }
		 
	}
}
class Threadone1 extends Thread{
	Print1 p;
	Threadone1(Print1 p){
		this.p=p;
		
	}
	public void run() {
		p.printValue(100);
	}
}
class Threadtwo1 extends Thread {
	Print1 p;
	Threadtwo1(Print1 p){
	this.p=p;
	}
	public void run() {
		p.printValue(100);
	}
}
public class Synclock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print1 obj=new Print1();
		Threadone1 t1=new Threadone1(obj);
		Threadtwo1 t2=new Threadtwo1(obj);
		t1.start();
		t2.start();

	}

}