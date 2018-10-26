package com.nissan.training_core_java;
import java.util.Scanner;
public class String6 {
	String customers[]=new String[100];
	int limit=0;
	void add() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter new customer name");
		customers[limit]=new String();
		customers[limit]=sc.next();
		limit++;
		//sc.close();
		
	}
	void display() {
	for(int i=0;i<limit;i++) {
		System.out.println(customers[i]);
	}
	}
	void delete() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name to be removed");
		String ch=sc.next();
		
		for(int i=0;i<limit;i++) {
			
			if(customers[i].equals(ch)) {
				System.out.println("Entered");
				
				customers[i]=customers[limit-1];
				limit=limit-1;
				
			}
			
		}
		
		
	}

void edit() {
	Scanner sc=new Scanner(System.in);
	int index=0;
	System.out.println("Enter name to be edited");
	String ch=sc.next();
	
	for(int i=0;i<limit;i++) {
		if(customers[i].equals(ch)) {
			index=i;
			System.out.println("enter new name");
			String newname=sc.next();
			customers[index]=newname;
			
		}
		
		
	}
	

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String6 sd=new String6();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice:\n1.Add a customer\n2.Delete a customer\n3.Edit customer name\n");
		int choice;
		choice=sc.nextInt();
		 do{
		if(choice==1) {
			
			sd.add();
			sd.display();
			}
		if(choice==2) {
			sd.delete();
			//sd.display();
			}
		if(choice==3) {
			sd.edit();
			sd.display();
			}
			
		System.out.println("Enter choice 4. to exit");
		choice=sc.nextInt();
			}while(choice!=4);
		 sc.close();
		}

}
