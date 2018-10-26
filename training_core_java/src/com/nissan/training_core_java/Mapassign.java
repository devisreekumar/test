package com.nissan.training_core_java;
import java.util.*;
public class Mapassign {//file
static Map<Integer,String> map=new HashMap<Integer,String>();
static Map<Integer,Integer> map1=new HashMap<Integer,Integer>();
static Map<Integer,String> map2=new HashMap<Integer,String>();
static void addpdt() {

	
	map.put(100, "A");
	map.put(102, "C");
	map.put(103, "B");
	map.put(104, "D");
	map.put(105, "E");
	show();
}
static void addprice(int id,int price) {
	map1.put(id,price);
}
static void addcart(int id,String name) {
	map2.put(id,name);
}

static void show() {
	for(Map.Entry m:map.entrySet()) {///method conversion
		System.out.println(m.getKey()+" "+m.getValue());
	}
}
static void showcart() {
	for(Map.Entry m:map2.entrySet()) {///method conversion
		System.out.println(m.getKey()+" "+m.getValue());
	}
}
static void remove() {
	map.remove(100, "A");
	map.remove(102, "C");
	System.out.println("after removing..");
	show();
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ch=0;
		do {
		System.out.println("Enter choice..\n1.admin\n2.user\n3.exit");
		 ch=sc.nextInt();
		if(ch==1) {
			int choice;
			do {
			System.out.println("Enter choice..\n1.add\n2.removepdt\n3.addprice\n4.editprice\n5.exit");
			choice=sc.nextInt();
			if(choice==1) {
				addpdt();
				
			}
			if(choice==2) {
				remove();
			}
			if(choice==3) {
				System.out.println("Enter pdt id");
				int id=sc.nextInt();
				System.out.println("Enter price");
				int price=sc.nextInt();
				addprice(id,price);
			}
			}while(choice!=5);
		}
		if(ch==2) {
			int c;
			do {
			System.out.println("Enter choice..\n1.addtocart..\n2.showpdts\n2.showcart()\n3.exit");
			 c=sc.nextInt();
			if(c==2) {
				show();
			}
			else if(c==1) {
				System.out.println("Enter id:");
				int id=sc.nextInt();
				System.out.println("Enter pdtname:");
				String name=sc.next();
				
				map.put(id, name);
				
			}
		}while(c!=3);
		}
		}while(ch!=3);
		}
		

	}


