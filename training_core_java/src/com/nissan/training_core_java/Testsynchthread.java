package com.nissan.training_core_java;
class Print{
	synchronized void printValue(int a) {
		for(int i=1;i<=5;i++) {
			System.out.println(a*i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}
}
class Threadone extends Thread{
	Print p;
	Threadone(Print p){
		this.p=p;
		
	}
	public void run() {
		p.printValue(100);
	}
}
class Threadtwo extends Thread {
	Print p;
	Threadtwo(Print p){
	this.p=p;
	}
}
public class Testsynchthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print obj=new Print();
		Threadone t1=new Threadone(obj);
		Threadtwo t2=new Threadtwo(obj);
		t1.start();
		t2.start();

	}

}
