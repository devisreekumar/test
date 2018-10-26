package com.nissan.training_core_java;
interface Writable{
	void write();
	interface Readable{
		void read();
	}
}
public class NestingofInt implements Writable.Readable {
	
	public void read() {
		System.out.println("i am reading");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Writable.Readable n=new NestingofInt();
		n.read();

	}

}
