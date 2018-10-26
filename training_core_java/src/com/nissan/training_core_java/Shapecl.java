package com.nissan.training_core_java;
abstract class Shape{
	
	abstract void area();
}
class Rectangle{
	void area(int l,int b) {
		System.out.println(l*b+"is area of rectangle"); 
		
	}
}
class Square{
	void area(int a) {
		System.out.println(a*a+"is the area of square"); 
		
	}
}
public class Shapecl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1=new Rectangle();
		r1.area(5,5 );
		Square s1=new Square();
		s1.area(7);
		

	}

}
