package com.nissan.training_core_java;
import java.util.Scanner;
import java.util.Arrays;
interface Participants{
	void run();
}
public class Assign11 extends Thread{
static	String[] name=new String[20];
static int flag=1;
public void run() {
	if(flag==1)
	{
		for(int i=0;i<5;i++) {
			int l=name[i].length();
			if(l%2!=0) {
				System.out.println(String.join("-", name[i].substring(l/2-1),name[i].substring(l/2)));
				
			}
			else {
				
					System.out.println(String.join("-", name[i].substring(l/2)));
					
				
			}
		}
		flag=0;
		
	}
	else if(flag==0) {
		int age[]= {22,21,23,21,24};
		for(int i=0;i<5;i++) {
			System.out.println(name[i]+age[i]+"\n ");
		}
		flag=1;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	
		Participants p1=()->{
		
			for(int i=0;i<5;i++) {
				
				System.out.println("Enter element");
				name[i]=sc.next();
				
				}
			System.out.println("Sorted array");
			Arrays.parallelSort(name);
			for(int i=0;i<5;i++) {
				
				System.out.println(name[i]+" ");
				
				
				}
			
		};
		Assign11 t1=new Assign11();
		Assign11 t2=new Assign11();
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		
		t1.start();
		t2.start()
		

	}

}
