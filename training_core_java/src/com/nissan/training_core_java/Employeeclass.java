package com.nissan.training_core_java;
class Employee{
	String name;
	int salary;
	int age;
	void read(String empname,int sal,int agee) {
		this.name=empname;
		this.salary=sal;
		this.age=agee;
		
	}
	void display() {
		System.out.println(name+" "+salary+" "+age);
	}
}

class Subemployee extends Employee{
	void read(String empname,int sal,int agee) {
		this.name=empname;
		this.salary=sal;
		this.age=agee;
		
	}
	void display() {
		System.out.println(name+" "+salary+" "+age);
	}
	}
public class Employeeclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		
		Subemployee emp=new Subemployee();
		
		emp.read("Devi",10000,22);
		emp.display();

	}

}
