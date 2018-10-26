package com.nissan.training_core_java;
@FunctionalInterface
interface Printdisplay{
	public void display();
}
public class Lambdaexpression {
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=100;
		Printdisplay p1=()->{
			System.out.println("Print:"+value);
		};
		p1.display();
	}

}
