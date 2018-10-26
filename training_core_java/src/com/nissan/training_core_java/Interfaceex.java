package com.nissan.training_core_java;
interface Arithmetic{
	void add(int a,int b);
	void subtract(int a,int b);
	void multiply(int a,int b);
	void divide(int a,int b);
}
public class Interfaceex implements Arithmetic{
	@Override
	public void add(int a,int b) {
		System.out.println("Sum is"+(a+b));
		
	}
	@Override
	public void subtract(int a,int b) {
		System.out.println("difference is"+(a-b));
		
	}
	@Override
	public void multiply(int a,int b) {
		System.out.println("Product is"+(a*b));
		
	}
	@Override
	public void divide(int a,int b) {
		System.out.println("Divide is"+(a/b));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaceex obj=new Interfaceex();
		obj.add(2,3);
		obj.subtract(30,10);
		obj.multiply(10,10);
		obj.divide(10,2);

	}

}
