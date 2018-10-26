/*package com.nissan.training_core_java;
abstract class Loann{
	abstract void rate();
}

class User extends Loann{
	int acno;
	int pin;
	String name;
	int balance;
	int actype;
	User(int acno,int pin,String name,int balance){
		
		this.acno=acno;
		this.pin=pin;
		this.name=name;
		this.balance=balance;
	}
	void rate(int a) {
		if(a==1)
		{
			System.out.println("interestrate is 27%");
		}
		else if(a==2)
		{
			System.out.println("interest rate is 20%");
		}
		else if(a==3) {
			if(this.balance>20000) {
			System.out.println("interest rate is 10%");
			}
			else {
				System.out.println("insufficient balance");
			}
		}
	}
	void display() {
		System.out.println(acno+"account no");
		System.out.println(name+"name");
		System.out.println(balance+"balance");
		System.out.println(actype+"account type");
	}
	void deposit() {
		rate(1);
		display();
	}
	void current() {
		rate(2);
		display();
	}
	void fixed(){
		rate(3);
		display();
		
	}
	void option(int a,int actype) {
		if(a==pin) {
			
		this.actype=actype;
		switch(actype) {
		case 1:
			deposit();
			break;
		case 2:
			current();
			break;
		case 3:
			fixed();
			break;
		
		}
	}
	}
	
}

public class Bankex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		User obj=new User(1001,101,"devi",20000);
		obj.option(101,1);
		

	}

}*/
