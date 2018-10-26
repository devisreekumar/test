package com.nissan.training_core_java;
abstract class Customers{
	abstract void sort();
}
public class Assignamonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customers obj=new Customers() {
			String[] list= {"devi","pavi","arjun","gouri","aishu"};
			void sort() {
				for(int i=0;i<list.length;i++) {
					for(int j=i+1;j<list.length;j++) {
						if(list[i].compareTo(list[j])<0) {
							String temp=list[i];
							list[i]=list[j];
							list[j]=temp;
						}
					}
				}
				
			for(int i=0;i<list.length;i++) {
				System.out.println(list[i]);
			}
			}
		};
		obj.sort();
	}

}
