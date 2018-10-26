package com.nissan.training_core_java;

interface Speak{
	void speaking();
}
public class Methodreference {
	public static void speaksomething() {
		System.out.println("hello Nissan-I am static");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Speak s=Methodreference::speaksomething;
		s.speaking();

	}

}
