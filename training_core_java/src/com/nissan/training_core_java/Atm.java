package com.nissan.training_core_java;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Random;
class AC {
	int acno;
	
	boolean flagbasic=false;
	boolean flagcur=false;
	boolean flagfd=false;
	boolean flagrd=false;
	int pin;
	int fdbal;
	int currentbal;
	int rdbal=0;
	int bal=0;
	static int flag=1001;
	Scanner sc=new Scanner(System.in);
	Random rand=new Random();
	void createac(){
		int choice;
		do {
		System.out.println("1.Create basic account\n2.Create current ac\n3.Create fd\n4.Create recurring deposit");
		choice=sc.nextInt();
		
			if(choice==1)
			{
				acno=rand.nextInt(9000000)+flag;
				flag++;
				pin=rand.nextInt(9999)+1000;
				System.out.println("Basic account created");
				System.out.println("Acno is"+acno);
				System.out.println("Pin is"+pin);
				flagbasic=true;
				
			}
		
			if(choice==2)
			{
				if(flagbasic) 
				{
					if(!flagcur) {
					System.out.println("Enter amount");
					currentbal=sc.nextInt();
					flagcur=true;
					System.out.println("Current account created successfully...");
					}
				}
				else 
				{
					System.out.println("To create current ac you need to first create basic account\n");
				}
				
			}
			
			
			if(choice==3) 
			{	
				if(flagbasic) 
				{
					if(!flagfd)
					{
						System.out.println("Enter amount");
						int amount=sc.nextInt();
						System.out.println("Enter period");
						int period=sc.nextInt();
							if((amount>=10000)&&(period>=1) )
							{
								flagfd=true;
								fdbal=amount;
								System.out.println("Fixed deposit account created successfully...");
							}
							else
							{
								System.out.println("Failed..\n1.Amount must be greater than 10000\n2.Period must be ateast 1 year");
							}
					}
				}
				else 
				{
					System.out.println("To create current ac you need to first create basic account\n");
				}
			}
			
			if(choice==4) 
			{
				if(flagbasic) 
				{
					if(!flagrd)
					{
						System.out.println("Enter amount");
						rdbal=sc.nextInt();
						flagrd=true;
						System.out.println("Recurring deposit account created successfully...");
					}
				}
				else 
				{
					System.out.println("To create current ac you need to first create basic account\n");
				}
			}
		
	
		
				
		System.out.println("Press any number key to continue..\nPress 5 to exit");
		choice=sc.nextInt();
	
		}while(choice!=5);
	}
	
	void deposit() {
		System.out.println("Enter account no:");
		int acnum=sc.nextInt();
		System.out.println("Enter pin:");
		int key=sc.nextInt();
		
		if(acno==acnum) {
			if(pin==key) {
				
				System.out.println("Enter choice:1.deposit in basic\n2.dep...osit in current\n3.deposit in fd\n4.deposit in rd");
				
				int c=sc.nextInt();
				if(c==1) {
					if(flagbasic) {
						System.out.println("Enter amount to be deposited in basic ac:");
						int amt=sc.nextInt();
						bal+=amt;
						System.out.println("Transaction completed successfully...!");
					}
					
					
				}
				else if(c==2) {
					if(flagcur) {
						System.out.println("Enter amount to be deposited in current ac:");
						int amt=sc.nextInt();
						currentbal+=amt;
						System.out.println("Transaction completed successfully...!");
						
					}
					else {
						System.out.println("Failed..Create a current account..to deposit");
					}
					
				}
				else if(c==3) {
					if(flagfd) {
					System.out.println("Enter amount to be deposited in fd ac:");
					int amt=sc.nextInt();
					fdbal+=amt;
					System.out.println("Transaction completed successfully...!");
					}	
					else {
						System.out.println("Failed..Create a fd account..to deposit");
					}
				}
				else if(c==4) {
					if(flagrd) {
					System.out.println("Enter amount to be deposited in basic ac:");
					int amt=sc.nextInt();
					rdbal+=amt;
					System.out.println("Transaction completed successfully...!");
					}
					else {
						System.out.println("Failed..Create a reccuring deposit account..to deposit");
					}
				}
			}
		
		}
		else {
			System.out.println("Invalid account number or pin check once again...!!");
		}
		
	}
	
	void changepin() {
		System.out.println("Enter account number");
		int no=sc.nextInt();
		System.out.println("Enter old pin");
		int key=sc.nextInt();
		if(acno==no) {
			if(key==pin) {
				System.out.println("Enter new pin");
				int newpin=sc.nextInt();
				System.out.println("Enter new pin to confirm");
				int neww=sc.nextInt();
					if(newpin==neww) {
						pin=neww;
						System.out.println("Pin updated sucessfully");
					}
				}
			else {
				System.out.println("Invalid pin..!\nAccess denied..!");
			}
		}
		else {
			System.out.println("Invalid account number.!\nAccount number does not exist..!");
			
		}
		
	}
	
	
		
	}
class Userinfo extends AC{
	
	String userid;
	String password;
	String name=null;
	String email;
	String location;
	BigInteger phoneno;
	void newuserac() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter password:");
		password=sc.next();
		
	
		
		System.out.println("Enter email:");
		email=sc.next();
		System.out.println("Enter your location:");
		location=sc.next();
		System.out.println("Enter phone number:");
		phoneno=sc.nextBigInteger();
		
	}
	void display() {
		System.out.println("Userid:"+userid);
		
		System.out.println("Name:"+name);
		
		System.out.println("Email:"+email);
		
		System.out.println("Location:"+location);
		
		System.out.println("Phone number:"+phoneno);
		
		
		
	}
void editdetails() {
		display();
		int ch;
		System.out.println("Enter password");
		String pass=sc.next();
		if(pass.equals(password)) {
		do {
		
		System.out.println("Enter choice of field to edit:1.username\n2.password\n3.email\n4.location\n5.exit");
		ch=sc.nextInt();
		
		if(ch==1) {
			System.out.println("Enter new name");
			String newname=sc.next();
			name=newname;
		}
		else if(ch==2) {
			System.out.println("Enter oldpassword");
			String oldpass=sc.next();
			if(oldpass.equals(password)) {
				System.out.println("Enter new password");
				String newpass=sc.next();
				
					password=newpass;
			}
			
		
		}
		else if(ch==3) {
			System.out.println("Enter new mail id");
			String newmail=sc.next();
			email=newmail;
		
		}
		else if(ch==4) {
			System.out.println("Enter new location ");
			String newlocal=sc.next();
			location=newlocal;
		
		}
		System.out.println("Press any number key to change other details ..\nPress 5 to exit");
		ch=sc.nextInt();
		}while(ch!=5);
		}
		else {
			System.out.println("Invalid password..!!");
		}
		}
	}
	



public class Atm  {
	
	
	public static void main(String[] args) {
		String name;
		Userinfo[] obj=new Userinfo[50];
		int limit=0;
			
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.Login\n2.New User");
		int choice=sc.nextInt();
		do {
		if(choice==1) {
			System.out.println("Enter userid");
			String id=sc.next();
			System.out.println("Enter password");
			String passkey=sc.next();
			int i;
			//logging in
			for(i=0;i<limit;i++) {
				if(obj[i].userid.equals(id)) {
					if(obj[i].password.equals(passkey)) {
						int ch;
						do {
						System.out.println("Enter Choice..\n1.Create account\n2.Deposit\n3.Change pin\n4.Edit details\n5.Exit");
						ch=sc.nextInt();
						
						if(ch==1) {
							obj[i].createac();
							
						}
						else if(ch==2) {
							obj[i].deposit();
							
						}
						else if(ch==3) {
							obj[i].changepin();
							
						}
						else if(ch==4) {
							obj[i].editdetails();
						}
						System.out.println("Press any number key to continue..\n Enter 5 to exit");
						ch=sc.nextInt();
						}while(ch!=5);
						
					}
				break;	
				}
			}
			if(i==limit) {
			System.out.println("Login failed...\nCheck userid and password you entered");
			
			}
			else {
				break;
			}
			
		}
		//create user account
		else if(choice==2)
		{	
			int i,flag=0;
			String id;
			obj[limit]=new Userinfo();
			do {
				flag=0;
			System.out.println("Enter userid:");
			 id=sc.next();
			
			for( i=0;i<limit;i++) {
				if(obj[i].userid.equals(id)) {
					System.out.println("Id not available");
					flag=1;
					break;
				}
					
				}
			
			
			}while(flag==1);
			obj[limit].userid=id;
	
			System.out.println("Enter username");
			String nname=sc.next();
		
			for(i=0;i<limit;i++) {
				
				if(obj[i].name.equals(nname))
					{
					System.out.println("Enter full name with initials expanded..: ");
					nname=sc.next();
					break;
					}
			}	
					obj[limit].name=nname;
				
			
			obj[limit].newuserac();
			limit++;	
			
			
		}
		System.out.println("To login enter (1)\nTo Create new user enter (2)..\nTo exit enter 3");
		choice=sc.nextInt();
		}while(choice!=3);
		
				}
		}
		
		
		
		
		
		
		
