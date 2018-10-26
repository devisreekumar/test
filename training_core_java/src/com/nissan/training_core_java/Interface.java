package com.nissan.training_core_java;
interface draw{
	void drawsomething();
	default void ink(){
		System.out.println("hello");
	}
}
interface get{
	void writesomething();
}

public class Interface implements draw,get{
	@Override
	public void drawsomething() {
		System.out.println("This is a method of interface");
		
	}
	@Override
	public void writesomething() {
		System.out.println("This is a method of interface");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface i=new Interface();
		i.drawsomething();
		i.writesomething();
		i.ink();

	}

}
