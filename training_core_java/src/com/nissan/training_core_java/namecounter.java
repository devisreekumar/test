package com.nissan.training_core_java;
class Namelist{
	 int  count=0;
	
	void counter() {
		count=count+1;	
	}
	void display() {
		System.out.println(count);
		
	}
}
class Names extends Namelist {
	String[] namess= {"devi","devi","aparna"};
	void run() {
		int i=0;
		while(i<namess.length)
		{
			if (namess[i]=="devi")
			{
				super.counter();
				
			}
			i++;
		}
	super.display();
	}
}
public class namecounter {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Names obj=new Names();
		obj.run();
		
			
		

	}

}
