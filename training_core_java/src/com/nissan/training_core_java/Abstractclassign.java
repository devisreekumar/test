package com.nissan.training_core_java;
abstract class Loan{
	abstract void rate();
	
}

class Hdfc extends Loan{
	void rate() {
		System.out.println("rate of Hdfc is 10%");
	}
	
}
class Axis extends Loan{
	void rate() {
		System.out.println("rate of Axis is 12%");
	}
	
	
}
class Icici extends Loan{
	void rate() {
		System.out.println("rate of icici is 15%");
	}
	
}
public class Abstractclassign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hdfc h=new Hdfc();
		h.rate();
		Axis a=new Axis();
		a.rate();
		Icici i=new Icici();
		i.rate();
		

	}

}
