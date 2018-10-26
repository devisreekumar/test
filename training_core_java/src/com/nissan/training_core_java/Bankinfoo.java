package com.nissan.training_core_java;
import java.util.Scanner;
abstract class Loans{
	abstract void rate(int ch,int b,int c);
}
class Interestrate extends Loans{
void rate(int ch,int a,int b) {
	  int H;
	  Scanner sc =new Scanner(System.in);
	  switch(ch) {
	  case 1 : 
	    System.out.println("Interest rate =27% \n Enter the loan amount : ");
	    H = sc .nextInt();
	    System.out.println("Please withdraw at the counter...");
	    break;
	  case 2:
	    if(a<20000) {
	     System.out.println(" You dont have the minimum balance to raise a loan request .");
	    }
	    else {
	    System.out.println("Interest rate = 20% \n Enter the loan amount:");
	    H = sc .nextInt();
	    System.out.println("Please withdraw at the counter...");
	    break;
	    
	    }
	  case 3:
	      if(b<10000) {
	       System.out.println("Sorry, you dont have the minimum balance to raise a loan request .");
	      }
	      else {
	       System.out.println("Interest rate = 10% \n Enter the loan amount:");
	     H= sc .nextInt();
	     System.out.println("Please withdraw at the counter...");
	     break;
	     
	      }
	  }
	 }
	}
class Users extends Interestrate{
	int pin;
	int acno;
	String name;
	int balance;
	String actype;
	
	void openaccount() {
		Scanner A=new Scanner(System.in);
		System.out.println("enter pin:");
		pin=A.nextInt();
		System.out.println("enter acno:");
		acno=A.nextInt();
		System.out.println("enter balance:");
		balance=A.nextInt();
		System.out.println("enter name:");
		name=A.next();
		System.out.println("enter account type:");
		actype=A.next();
	}
	void display() {
		System.out.println(" Pin :"+" "+pin);
		
		System.out.println("Acno :"+" "+acno);
	
		System.out.println(" Balance:"+" "+balance);
		
		System.out.println("Name:"+" "+name);
		
		System.out.println(" Account type:"+" "+actype);
		
		
	}
	void fixeddeposit() {
		  
		  int newamt;
		  Scanner sc =new Scanner(System.in);
		  System.out.println(" Enter the amount to deposit :");
		  newamt= sc.nextInt();
		  if(newamt < 500) {
		   System.out.println("Minimum amount to deposit is 500");
		  }
		  else {
		  this.balance+=newamt;
		  System.out.println("Amount deposited. \nCurrent balance = "+balance);
		  }
		  sc.close();
		 }
	void loan() {
		  int ch;
		  Scanner sc =new Scanner(System.in);
		  System.out.println("Enter Category :\n 1.Direct loan \n 2. Current acoount\n 3.Fixed deposit \n");
		  ch = sc.nextInt();
		  rate(ch,balance,20000);
		  sc.close();
		  
		 }
 void deposit() {
  int newamt;
  Scanner sc =new Scanner(System.in);
  System.out.println(" enter the amount to deposit :");
  newamt= sc.nextInt();
  balance+=newamt;
  System.out.println("Amount deposited. \nCurrent balance = "+ balance);
  sc.close();
 }
		 
		 
	
}
public class Bankinfoo extends Users{
		
	public static void main(String[] args) {
		
		int no,pin,ch;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of users");
		no=in.nextInt();
		Users C[]=new Users[no]; //array to store objects
		
		for(int i=0;i<C.length;i++) {
		  C[i]=new Users();
		  C[i].openaccount();
		}
		
		System.out.println("Enter pin");
		pin=in.nextInt();
		for(int i=0;i<C.length;i++) 
		{
			if(C[i].pin==pin)
				{
				System.out.println("Enter choice 1.deposit 2.loan 3.fixeddeposit");
				ch=in.nextInt();
				switch(ch)
				{
				case 1:
					C[i].deposit();
					C[i].display();
					break;
				case 2:
					C[i].loan();
					C[i].display();
					break;
				case 3:
					C[i].fixeddeposit();
					C[i].display();
					break;
				default:
					System.out.println("invalid choice");
					break;
				}
				
			
				}
		}
		
		
		
		
		
		
		
		
				

	}

}
