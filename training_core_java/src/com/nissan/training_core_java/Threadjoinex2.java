package com.nissan.training_core_java;
import java.util.Scanner;
public class Threadjoinex2 extends Thread{
public void run() {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[20];
	int k=0;
	for(int i=0;i<2;i++) {
		System.out.println("Enter an element");
		int n=sc.nextInt();
		a[k]=n;
		k++;
		try {
		Thread.sleep(300);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadjoinex2 obj1=new Threadjoinex2();
		Threadjoinex2 obj2=new Threadjoinex2();
		Threadjoinex2 obj3=new Threadjoinex2();
		obj1.start();
		try {
			obj1.join();
		}catch(Exception e){
			System.out.println(e);
			
		}
		obj2.start();
		obj3.start();
		

	}

}
