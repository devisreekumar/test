package com.nissan.training_core_java;
class Annimal{
	Annimal(){
		System.out.println("Animal is eating");
	}
}
class Chhetah extends Annimal{
	Chhetah(){
		super();//already created by compiler
		System.out.println("eating deer");
	}
}
public class invokeparentconst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chhetah c=new Chhetah();

	}

}
