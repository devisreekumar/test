package com.nissan.training_core_java;
class Print2{
	//synchronized 
	void printValue(int a) {
		 //synchronized(this){
			 int[] list=new int[50];
			 int k=0;
			 for(int i=1;i<=10;i++) {
				 list[k]=a+(i*i);
				 k++;
				
				try {
					Thread.sleep(500);
				}catch(Exception e) {
					System.out.println(e);
				}
			 }
			 for(int i=1;i<k;i++) {
				 System.out.println(list[i]);
			 }
		 //}
		 
	}
}
class Threadone2 extends Thread{
	Print2 p;
	Threadone2(Print2 p){
		this.p=p;
		
	}
	public void run() {
		p.printValue(100);
	}
}
class Threadtwo2 extends Thread {
	Print2 p;
	Threadtwo2(Print2 p){
	this.p=p;
	}
}
public class Syncex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print2 obj=new Print2();
		Threadone2 t1=new Threadone2(obj);
		Threadtwo2 t2=new Threadtwo2(obj);
		t1.start();
		t2.start();

	}

}
