package com.nissan.training_core_java;

public class Employeedetails {
	String empname;
	int age;
	int salary;
	String phoneno;
	Employeedetails(String name,int age){
		empname=name;
		this.age=age;
	}
	//funtion overloading
	void display(int salary ) {
		this.salary=salary;
		System.out.println("Name:"+empname+"\nAge:"+age+"\nSalary:"+this.salary);
	}
	void display(int salary,String phone ) {
		this.salary=salary;
		this.phoneno=phone;
		System.out.println("Name:"+empname+"\nAge:"+age+"\nSalary:"+this.salary+"\nPhoneno:"+phoneno);
	}
	
	public static void main(String[] args) {
		
		Employeedetails e1=new Employeedetails("Devi",22);
		e1.display(20000);
		e1.display(200000,"04712366594");
		
	}

}
