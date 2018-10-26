/**
 * 
 */
package com.nissan.training_core_java;

/**
 * @author HP
 *
 */
public class Studentclass {

	int studentid;
	String studentname;
	
	Studentclass(int i,String n){
		this.studentid=i;
		this.studentname=n;
		
	}
	void display() {
		System.out.println(studentid+" "+studentname);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentclass s2=new Studentclass(101,"Devi");
		s2.display();
	}

}
