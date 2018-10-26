package com.nissan.training_core_java;
class Person{
	int id;
	String name;
	int age;
	Person(){
		id=101;
		name="devi";
		 age=20;
		
	}
	
}
class Salary extends Person {
	int sal,a;
	String name;
	Salary(){
		sal=20000;
		name="devi";
		}
	void display() {
	if (super.name==name) {
		a=super.age;
		
		sal+=100+(a/100);
		System.out.println(sal);
	}
	}
}
public class PersonInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary s=new Salary();
		s.display();

	}

}
