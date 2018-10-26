package com.nissan.training_core_java;
class College{
	int rollno;
	String studname;
	int deptno;
	void read(int no,String name,int dept) {
		this.rollno=no;
		this.studname=name;
		this.deptno=dept;
	}
}
class Student extends College{
	void display() {
		System.out.println(rollno+" "+studname);
	}
}
public class College2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student s=new Student();
	s.read(102, "devi", 105);
	s.display();
	}
}