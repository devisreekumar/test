package com.nissan.training_core_java;
class Parent{
	void run() {
		System.out.println("hello");
	}
}
public class assignmentinstance extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignmentinstance obj=new assignmentinstance();
		if(obj instanceof Parent)
		{
			obj.run();
		}

	}

}
