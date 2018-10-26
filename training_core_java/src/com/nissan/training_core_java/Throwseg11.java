package com.nissan.training_core_java;
import java.io.IOException;
public class Throwseg11 {
	void master() throws IOException{
		throw new IOException("error has occured");
	}
	void notmaster()throws IOException{
		master();
	}
	void puremaster() {
		try {
			notmaster();
		}catch(Exception e) {
			System.out.println("The error has been handled");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Throwseg11 obj=new Throwseg11();
obj.puremaster();
System.out.println("the other parts");
	}

}
