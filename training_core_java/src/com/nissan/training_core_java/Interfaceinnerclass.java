package com.nissan.training_core_java;
interface Customerr{
	void name() ;
		
	
}
public class Interfaceinnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customerr c=new Customerr() {
			public void name() {
				System.out.println("Customer name is devi");
			}
		};
		c.name();

	}

}
