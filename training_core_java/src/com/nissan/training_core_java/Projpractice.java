package com.nissan.training_core_java;

import java.util.Scanner;

import java.sql.*;
import java.math.BigInteger;
import java.util.Random;

public class Projpractice {
	 static Connection con;
	 static  Statement stmt;
	 static ResultSet rs;
	
	static void connect() {									///to connect to database
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e1)
		{
			System.out.println("Excepton :"+e1);
		}
		try
		{ 
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airticketreservation","root","devi1996");  
					  
		}
		catch(Exception e)
		{ 
			System.out.println("couldn't get connection");
		}
	    
	    
		
	}
	
	static void addflight() {							//add a new flight
		try{ 
			
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER NAME OF AIRLINES:");
			String aname=sc.next();
			System.out.println("ENTER FLIGHT NAME:");
			String fname=sc.next();
			System.out.println("ENTER STARTING POINT:");
			String strtpt=sc.next();
			System.out.println("ENTER DESTINATION:");
			String dest=sc.next();
			System.out.println("ENTER DEPARTURE TIME:");
			String dtym=sc.next();
			System.out.println("ENTER ARRIVAL TIME:");
			String arrtime=sc.next();
			System.out.println("ENTER NUMBER OF SEATS:");
			int no=sc.nextInt();
			System.out.println("ENTER RATE PER TICKET:");
			int rate=sc.nextInt();
			
			int id;
			System.out.println("ENTER FREQUENCY (0/1) For Availability In Format(M T W T F S S)");
			
			int list[]=new int[7];
			for(int i=0;i<7;i++)
			{
			int freq=sc.nextInt();
			list[i]=freq;
			
			}
			connect();
			
			// stmt=con.createStatement();  
			  
			
			 PreparedStatement stmt=con.prepareStatement("insert into flight(airline,flightname,startpoint,destination,depttime,arrivaltime,seats,charge ) values(?,?,?,?,?,?,?,?)");  
			 //stmt.setInt(1, id);
			 stmt.setString(1,aname); 
			 stmt.setString(2,fname); 
			 stmt.setString(3,strtpt); 
			 stmt.setString(4,dest); 
			 stmt.setString(5,dtym); 
			 stmt.setString(6,arrtime); 
			 stmt.setInt(7,no);
			 stmt.setInt(8,rate);
			   
			 int i=stmt.executeUpdate();
			 //stmt=con.createStatement();  
			 int fid=0; 
				// execute query  
				ResultSet rs=stmt.executeQuery("select * from flight");  
				
				while(rs.next())  
				{
					fid=rs.getInt(1);
				}
			 
			
			 int mon=0,tue=0,wed=0,thu=0,fri=0,sat=0,sun=0;
			
				 if(list[0]==1) {
					 mon=no;		//assign flight capacity to each day 
				 }
				 if(list[1]==1) {
					 tue=no;
				 }
				 if(list[2]==1) {
					 wed=no;
				 }
				 if(list[3]==1) {
					 thu=no;
				 }
				 if(list[4]==1) {
					 fri=no;
				 }
				 if(list[5]==1) {
					 sat=no;
				 }
				 if(list[6]==1) {
					 sun=no;
				 }
				
			 
			 stmt=con.prepareStatement("insert into week values(?,?,?,?,?,?,?,?)");  
			 stmt.setInt(1, fid);
			 stmt.setInt(2,mon); 
			 stmt.setInt(3,tue); 
			 stmt.setInt(4,wed); 
			 stmt.setInt(5,thu); 
			 stmt.setInt(6,fri); 
			 stmt.setInt(7,sat); 
			 stmt.setInt(8,sun);
			 int k=stmt.executeUpdate(); 
			
			 if((i>=1)&&(k>=1)) {										//if insertion happens in both table show message flight added
			 System.out.println(i+" \nFLIGHT ADDED\n");
			 checkflights();}
			 else {
				 System.out.println("\nINSERTION FAILED\n");
			 }
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  
	}
	
	
	static void removeflight() {
		Scanner sc=new Scanner(System.in);
		try{  
			
			
			  connect();
			 
			 stmt=con.createStatement();  
			  
			// execute query  
			ResultSet rs=stmt.executeQuery("select * from flight");  
			
			while(rs.next())  
			{
				
			System.out.println("FLIGHT ID:"+rs.getInt(1)+"\n"+"AIRLINES:"+rs.getString(2)+"\nFLIGHT NAME:"+rs.getString(3)+"\nBOARDING POINT:"+rs.getString(4)+"\nDESTINATION:"+rs.getString(5)+"\nDEPARTURE TIME:"+rs.getString(6)+"\nARRIVAL TIME:"+rs.getString(7)+"\nNUMBER OF SEATS:"+rs.getInt(8)+"CHARGE PER TICKET:"+rs.getInt(9)+"\n\n");
			
			}
			rs=stmt.executeQuery("select * from week");  
			
			while(rs.next())  
			{
			System.out.println("\nNUMBER OF SEATS AVAILABLE FOR THIS WEEK:\n");
			System.out.println("\nFLIGHT ID:"+rs.getInt(1)+"\nMONDAY:"+rs.getInt(2)+"\nTUESDAY:"+rs.getInt(3)+"\nWEDNESDAY:"+rs.getInt(4)+"\nTHURSDAY:"+rs.getInt(5)+"\nFRIDAY:"+rs.getInt(6)+"\nSATURDAY:"+rs.getInt(7)+"\nSUNDAY:"+rs.getInt(8)+"\n\n\n");
			
			}
			System.out.println("\nENTER ID OF FLIGHT TO BE REMOVED:");
			int id=sc.nextInt();
			
			  //..........................."Deleting table in given database"..............................
		      stmt = con.createStatement();
		      String sql = "DELETE FROM WEEK WHERE FLIGHTID="+id;//delete from week table first
		      int k=0; 
		      int i=stmt.executeUpdate(sql);
		      if(i>=1) {
		       sql = "DELETE FROM FLIGHT WHERE FLIGHTID="+id;
		 
		       k=stmt.executeUpdate(sql);
		      }
		      if((i>=1)&&(k>=1)) {
		      System.out.println("\nFLIGHT REMOVED..\n");
		      checkflights();
		      }
		      else {
		    	  System.out.println("\n...FLIGHT DOES NOT EXIST...\n");
		      }
			//step5 close the connection object  
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  
		
		
	}
	
	static void checkflights () {
		Scanner sc=new Scanner(System.in);
		try{  
			
			  connect();
			 
			 stmt=con.createStatement();  
			  
			// execute query  
			ResultSet rs=stmt.executeQuery("select * from flight");  
			if(rs.getRow()==0) {
				System.out.println("NO FLIGHTS AVAILABLE:\n");
			}
			while(rs.next())  
			{
				
			System.out.println("FLIGHT ID:"+rs.getInt(1)+"\n"+"AIRLINES:"+rs.getString(2)+"\nFLIGHT NAME:"+rs.getString(3)+"\nBOARDING POINT:"+rs.getString(4)+"\nDESTINATION:"+rs.getString(5)+"\nDEPARTURE TIME:"+rs.getString(6)+"\nARRIVAL TIME:"+rs.getString(7)+"\nNUMBER OF SEATS:"+rs.getInt(8)+"\nRATE PER TICKET:"+rs.getInt(9)+"\n\n\n");
			
			}
			rs=stmt.executeQuery("select * from week");  
			
			while(rs.next())  
			{
			System.out.println("\nNUMBER OF SEATS AVAILABLE FOR THIS WEEK:\n");
			System.out.println("\nFLIGHT ID:"+rs.getInt(1)+"\nMONDAY:"+rs.getInt(2)+"\nTUESDAY:"+rs.getInt(3)+"\nWEDNESDAY:"+rs.getInt(4)+"\nTHURSDAY:"+rs.getInt(5)+"\nFRIDAY:"+rs.getInt(6)+"\nSATURDAY:"+rs.getInt(7)+"\nSUNDAY:"+rs.getInt(8)+"\n\n\n");
			
			}
		
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  
		
		}
		
	static void createnewuser() {
		try{ 
			Random rand=new Random();
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER NAME:");
			String uname=sc.next();
			System.out.println("ENTER PASSWORD:");
			String upassword=sc.next();
			System.out.println("ENTER PHONE NUMBER:");
			//BigInteger phon=sc.nextBigInteger();
			String phon=sc.next();
			System.out.println("ENTER EMAIL ID:");
			String mail=sc.next();
			System.out.println("ENTER CITY:");
			String location=sc.next();
			
			
			int keypin=rand.nextInt(888)+100;
			
			connect();
			stmt=con.createStatement();  
			  
			// execute query  
			
			 PreparedStatement stmt=con.prepareStatement("insert into user values(?,?,?,?,?,?)");  
			 stmt.setString(1,mail); //1 specifies the first parameter in the query  
			 stmt.setString(2,upassword); 
			 stmt.setString(3,uname); 
			 stmt.setString(4,phon); 
			 
			 stmt.setString(5,location); 
			 stmt.setInt(6,keypin); 
			 
			   
			 int i=stmt.executeUpdate(); 
			 if(i>=1) {
				
			 System.out.println(i+" \nUSER ACCOUNT CREATED\n");
			 userlist();
			 System.out.println("PIN:"+keypin);
			 }
			 else {
				 System.out.println("\nSIGN UP UNSUCCESSFULL...PLEASE TRY AGAIN...\n");
			 }
			con.close();  
			  
			}catch(Exception e){ System.out.println("USER ACCOUNT EXISTS FOR THIS ID...\n");}  
			 
		
		
	}
	static void removeuser() {
		Scanner sc=new Scanner(System.in);
		try{  
			
			
			  connect();
			 
			 stmt=con.createStatement();  
			  
			// execute query  
			ResultSet rs=stmt.executeQuery("select * from user");  
			
			while(rs.next())  
			{
				
			System.out.println("USER ID:"+rs.getString(1)+"\nUSER NAME:"+rs.getString(3)+"\nPHONE NUMBER:"+rs.getString(4)+"\nLOCATION:"+rs.getString(5)+"\n\n\n");
			
			}
			System.out.println("ENTER ID OF USER TO BE REMOVED:");
			String id=sc.next();
			
			  //..........................."Deleting table in given database"..............................
			 stmt = con.createStatement();
		      String sql = "DELETE FROM USER WHERE EMAIL = '"+id+"'";
		                   
		    
		      int i=stmt.executeUpdate(sql);
		      if(i==1) {
		      System.out.println("\nUSER REMOVED..\n");
		      userlist();
		      }
		      else {
		    	  System.out.println("\n...USER DOES NOT EXIST...\n");
		      }
			//step5 close the connection object  
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  
		
		
	}
	static void userlist () {
		Scanner sc=new Scanner(System.in);
		try{  
			
			  connect();
			 
			 stmt=con.createStatement();  
			  
			// execute query  
			ResultSet rs=stmt.executeQuery("select * from user");  
			

			while(rs.next())  
			{
				
				System.out.println("USER ID:"+rs.getString(1)+"\nUSER NAME:"+rs.getString(3)+"\nPHONE NUMBER:"+rs.getString(4)+"\nLOCATION:"+rs.getString(5)+"\n");
				
			}
		
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  
		
		}
	static void bookflight(String uidd) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER FROM:");
		String s1=sc.next();
		System.out.println("ENTER DESTINATION:");
		String s2=sc.next();
		String s3,s4;
		int rate=0,ch=0,id=0;
		int flag=0;
		try {
			connect();
			 
			 stmt=con.createStatement();  
			  
			// execute query  
			ResultSet rs=stmt.executeQuery("select * from flight ");  
			
			while(rs.next())  
			{
				id=rs.getInt(1);
				s3=rs.getString(4);
				s4=rs.getString(5);
				if(s1.equals(s3) && s2.equals(s4)) {
					flag=1;
					rate=rs.getInt(9);
					System.out.println("FLIGHT ID:"+rs.getInt(1)+"\n"+"AIRLINES:"+rs.getString(2)+"\nFLIGHT NAME:"+rs.getString(3)+"\nBOARDING POINT:"+rs.getString(4)+"\nDESTINATION:"+rs.getString(5)+"\nDEPARTURE TIME:"+rs.getString(6)+"\nARRIVAL TIME:"+rs.getString(7)+"\nNUMBER OF SEATS:"+rs.getInt(8)+"\nRATE PER TICKET:"+rs.getInt(9)+"\n\n\n");
					
					
				}
			
			}
			if(flag==0) {
				System.out.println("\n..NO FLIGHTS AVAILABLE...\n");
			}
			
			
			if(flag==1) {
				int ticket,d1=0,d2=0,d3=0,d4=0,d5=0,d6=0,d7=0;
				String day;
				rs=stmt.executeQuery("select * from week where flightid= "+id);  
				while(rs.next()) {
					System.out.println("\nNO OF SEATS AVAILABLE FOR THIS WEEK:\n");
					System.out.println("\nFLIGHT ID:"+rs.getInt(1)+"\nMONDAY:"+rs.getInt(2)+"\nTUESDAY:"+rs.getInt(3)+"\nWEDNESDAY:"+rs.getInt(4)+"\nTHURSDAY:"+rs.getInt(5)+"\nFRIDAY:"+rs.getInt(6)+"\nSATURDAY:"+rs.getInt(7)+"\nSUNDAY:"+rs.getInt(8)+"\n\n\n");
					d1=rs.getInt(2);
					d2=rs.getInt(3);
					d3=rs.getInt(4);
					d4=rs.getInt(5);
					d5=rs.getInt(6);
					d6=rs.getInt(7);
					d7=rs.getInt(8);
				}
				System.out.println("ENTER CHOICE:1BOOK FLIGHT ..\n");
				int opt=sc.nextInt();
				
				if(opt==1) {
					System.out.println("\nENTER NO  OF TICKETS:");
					ticket=sc.nextInt();
					System.out.println("\nENTER DAY OF WEEK:");
					day=sc.next();
					int seat=0;
					if(day.equals("monday")) {
						 seat=d1;
					}
					if(day.equals("tuesday")) {
						 seat=d2;
					}
					if(day.equals("wednesday")) {
						 seat=d3;
					}
					if(day.equals("thursday")) {
						 seat=d4;
					}
					if(day.equals("friday")) {
						 seat=d5;
					}
					if(day.equals("saturday")) {
						 seat=d6;
					}
					if(day.equals("sunday")) {
						 seat=d7;
					}
					if(seat>=ticket) {
						seat=seat-ticket;
						int tamt=(rate*ticket);
						System.out.println("\nTOTAL CHARGE:"+tamt);
						//update table for id
						int count=stmt.executeUpdate("update  week set "+day+"="+seat+" where flightid= "+id+"");  
						checkflights();
							//create bookhistory
						
						  connect();
						  stmt=con.createStatement(); 
						 
						  PreparedStatement stmt=con.prepareStatement("insert into bookhistory(flightid,email,tickets,day,status) values(?,?,?,?,?)");  
							
						  stmt.setInt(1,id); //1 specifies the first parameter in the query  
						  stmt.setString(2,uidd); 
						  stmt.setInt(3,ticket); 
						  stmt.setString(4,day); 
							 
						  stmt.setInt(5,1);
						   
						 int i=stmt.executeUpdate(); 
						 if(i>=1) {
							
						 System.out.println(i+" \nTRANSACTION SUCCESSFULL..\n");
						 //showbooking
						 rs=stmt.executeQuery("select * from bookhistory where flightid= "+id); 
						 System.out.println("\nBOOKING HISTORY:\n");
						 while(rs.next()) {
							
							System.out.println("\nBOOKING ID:"+rs.getInt(1)+"\nFLIGHT ID:"+rs.getInt(2)+"\nUSER ID:"+rs.getString(3)+"\nTICKET:"+rs.getInt(4)+"\nWEEKDAY:"+rs.getString(5)+"\n\n\n");
							
						 }
						 
						 
						 }
						 else {
							 System.out.println("\n UNSUCCESSFULL...PLEASE TRY AGAIN...\n");
						 }
						
					}
					
					else {
						System.out.println("\nSORRY TICKETS NOT AVAILABLE:");
					}
					
				}
				
				
				
				
			}
			//con.close();
		}catch(Exception e){ System.out.println(e);}  
		  
			
	}
	
	static void showhistory() {
		Scanner sc=new Scanner(System.in);
		try{  
			
			  connect();
			 
			 stmt=con.createStatement();  
			  
			// execute query  
			ResultSet rs=stmt.executeQuery("select * from bookhistory");  
			
			while(rs.next())  
			{
				
				System.out.println("BOOKING ID:"+rs.getInt(1)+"\nFLIGHT ID:"+rs.getInt(2)+"\nUSER ID:"+rs.getString(3)+"\nNO OT TICKETS BOOKED:"+rs.getInt(4)+"\nWEEK DAY:\n"+rs.getString(5)+"\nSTATUS:\n"+rs.getInt(6)+"\n");
				
			}
		
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  
		
		}
	static void cancelflight(String uidd,String passw) {
		Scanner sc=new Scanner(System.in);
		int fid=0,notkt=0;
		String days=null;
		try {
		 connect();
		 stmt=con.createStatement(); 
		 rs=stmt.executeQuery("select * from bookhistory where email= '"+uidd+"'");  
		 while(rs.next()) {
			System.out.println("\nBOOKING HISTORY:\n");
			System.out.println("\nBOOKING ID:"+rs.getInt(1)+"\nFLIGHT ID:"+rs.getInt(2)+"\nUSER ID:"+rs.getString(3)+"\nTICKET:"+rs.getInt(4)+"\nWEEKDAY:"+rs.getString(5)+"\n\n\n");
			
		 }
		 //enter bookid
		 System.out.println("\nENTER BOOKING ID OF FLIGHT TO BE CANCELLED:");
		 int bid=sc.nextInt();
		 System.out.println("\n1.ARE YOU SURE:");
		 int n=sc.nextInt();
		 if(n==1) {
			 connect();
			 stmt=con.createStatement(); 
			 rs=stmt.executeQuery("select * from bookhistory where bookid= "+bid);  
			 while(rs.next()) {
				 fid=rs.getInt(2);
				 notkt=rs.getInt(4);
				 days=rs.getString(5);
				
			 }
			 connect();
			 stmt=con.createStatement(); 
			 int l=stmt.executeUpdate("update bookhistory set status=0 where bookid="+bid);  
			
			 connect();
			 stmt=con.createStatement(); 
			 System.out.println("update week set "+days+"= "+days+"+"+notkt +"where flightid="+fid);
			int h=stmt.executeUpdate("update week set "+days+"= "+days+"+"+notkt +" where flightid="+fid );  
			
			 
			 
		
		 }
		}catch(Exception e){ System.out.println(e);}  
		
	}
		
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(".............WELCOME TO AIRLINE RSERVATION SYSTEM................\n\n\n\n\n\n");
		int choice;
		String admin="devi";
		String password="travelsafe";
		
		do {
			System.out.println("LOGIN AS ...\n1.ADMIN...\n2.USER.....\nENTER CHOICE:");
			choice=sc.nextInt();
			if(choice==1) {							//LOGGING IN........!!!!!!!!!!!!!!!
				int ch=0;
				System.out.println("ENTER ADMIN NAME:");
				String name=sc.next();
				System.out.println("ENTER PASSWORD:");
				String passkey=sc.next();
				if(name.equals(admin)) {
					if(passkey.equals(password)) {
					do {
						System.out.println("LOGGED IN...\n");
						System.out.println("ENTER CHOICE:\n1.ADD FLIGHT..\n2.REMOVE FLIGHT..\n3.REMOVE USER..\n4.CHECK FLIGHTS..\n5.DISPLAY USER LIST..\n6.LOGOUT..\n");
						ch=sc.nextInt();
						if(ch==1) {
							addflight();
							}
						else if(ch==2) {
							removeflight();
							
						}
						else if(ch==3) {
							removeuser();
							}
						else if(ch==4) {
							checkflights();
							
						}
						else if(ch==5) {
							userlist();
						}
						
					}while(ch!=6);
				System.out.println("LOGOUT SUCCESSFULL...!!\n");
				
					}
				}
			}
			else if(choice==2) {
				int ch=0;
				do {
				System.out.println("1.IF NEW USER SIGN UP CREATE AN ACCOUNT...!!\n2.LOGIN...!!\n3.EXIT..\nENTER CHOICE:");
				ch=sc.nextInt();
				if(ch==1) {
					createnewuser();
				}
				else if(ch==2) {
					String s;
					String s2;
					System.out.println("ENTER USERID:");
					String uidd=sc.next();
					System.out.println("ENTER PASSWORD");
					String key=sc.next();	
					int flag=0;
					try{  
						
						  connect();
						 
						 stmt=con.createStatement();  
						  
						// execute query  
						ResultSet rs=stmt.executeQuery("select * from user");  
						
						while(rs.next())  
						{
							s=rs.getString(1);
							s2=rs.getString(2);
							if((s.equals(uidd)) && s2.equals(key)) {
								flag=1;
								break;
							}
							
							
						}
					
						//con.close();  
						  
						}catch(Exception e){ System.out.println(e);}  
						  
					
					if(flag==1)
						{
							int option=0;
							do {
								System.out.println("1.CHECK FLIGHT...\n2.BOOK FLIGHT...\n3.CANCEL FLIGHT..\n4.BOOKING HISTORY....\n5.LOGOUT...\nENTER CHOICE:");
								option=sc.nextInt();
								if(option==1) {
									checkflights();
								}
								else if(option==2) {
									bookflight(uidd);
								}
								else if(option==3) {
									cancelflight(uidd,key);
									}
								else if(option==4) {
									showhistory();
								}
							
								
								
							}while(option!=5);
							System.out.println("\nLOGOUT SUCCESSFULL..!!\n\n");
						}
					else {
						System.out.println("LOGIN FAILED...!!\nPLEASE CHECK YOUR ID AND PASSWORD ...\n");
					}
				}
				}while(ch!=3);
				
			}
			System.out.println("Press 3. to exit from page..\nPress any other number key to continue...");
			choice=sc.nextInt();
			
		}while(choice!=3);
		
		
		
		sc.close();

	}

}
