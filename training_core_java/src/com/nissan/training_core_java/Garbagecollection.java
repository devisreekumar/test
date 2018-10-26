package com.nissan.training_core_java;

public class Garbagecollection {
	public void finalize() {
		System.out.println("Object is garbage collected");
	}
	public void add() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garbagecollection g1=new Garbagecollection();
		Garbagecollection g2=new Garbagecollection();
		g1.add();
		g2=null;
		g1=null;
		System.gc();
		g1.add();
		
		System.out.println(g1);


	}

}
