package com.nissan.training_core_java;
class Collegee{
	int rollno;
	String studname;
	int deptno;
	void read(int no,String name,int dept) {
		this.rollno=no;
		this.studname=name;
		this.deptno=dept;
	}
}
class Studentt extends College{
	void display() {
		System.out.println(rollno+" "+studname);
	}
}
public class Collegeinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Studentt s=new Studentt();
	s.read(102, "devi", 105);
	s.display();
	}

}
