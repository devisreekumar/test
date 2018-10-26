package com.nissan.training_core_java;
import java.io.*;
import java.util.Scanner;
public class Employeemanagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			  Scanner sc=new Scanner(System.in);
			  int choice=0;
			  String userlist1[]= {"Ram","Hari"};
			  String userlist2[]= {"Sita","Laxmi"};
			  do {
			  System.out.println("Enter choice 1.To send to department1 regulations\n2.To send department 2 regulations:\n3.To view replies\n4.Exit");
		      choice=sc.nextInt();
		      if(choice==1) {

		      FileInputStream in = null;
		      FileOutputStream out = null;

		      try {
		         in = new FileInputStream("D:\\adminnotice.txt");
		        out = new FileOutputStream("D:\\Department1.txt");
		             
	              
		         int c;
		         while ((c = in.read()) != -1) {
		            out.write(c);
		         }
		         System.out.println("Send to department1...\n");
		         in.close();
		         out.close();
		      }catch(IOException e) {
		    	  System.out.println(e);
		      }
		      catch(Exception e) {
		    	  System.out.println(e);
		      }
		      
		      
		      
		      try {	
		    	  
		    	  	int reply=0;
			         in = new FileInputStream("D:\\Department1.txt");
			         out = new FileOutputStream("D:\\Departmentreply1.txt");
			        
			         for(int i=0;i<2;i++) {
			         System.out.println("Sending to "+userlist1[i]);
			         
			         Scanner c=new Scanner(in);
			         String regulations="";
			         while (c.hasNext()) {
			            regulations+=c.nextLine()+" ";
			          
			         }
			         System.out.println(regulations);
		             System.out.println("Write reply..\n1.Yes to agree:\n2.If you do not consent:");
		             reply=sc.nextInt();
		             if(reply==1) {
		            	 String s="";
		            	 s=s+userlist1[i]+"  I agree\n";
		            	 byte g[]=s.getBytes();
		            	 out.write(g);
		             }
		             if(reply==2) {
		            	 String s="";
		            	 s=s+userlist1[i]+" I disagree\n";
		            	 byte g[]=s.getBytes();
		            	 out.write(g);
		             }
			         }
		             in.close();
		             out.close();
			       
			      }catch(IOException e) {
			    	  System.out.println(e);
			      }
			      catch(Exception e) {
			    	  System.out.println(e);
			      }
		      
		      
		      
		      try {
		    	  
			         in = new FileInputStream("D:\\Departmentreply1.txt");
			         out = new FileOutputStream("D:\\Adminreply.txt");
			         String s="Department1"+" ";
	            	 byte g[]=s.getBytes();
	            	 out.write(g);
			         int c;
			         while ((c = in.read()) != -1) {
			            out.write(c);
			         }
			         System.out.println("Collected replies from  department1...\n");
			         in.close();
			         out.close();
			      }catch(IOException e) {
			    	  System.out.println(e);
			      }
			      catch(Exception e) {
			    	  System.out.println(e);
			      }
		      
		      }
		      if(choice==2) {
		    	  FileInputStream in = null;
			      FileOutputStream out = null;

			      try {
			         in = new FileInputStream("D:\\adminnotice.txt");
			         out = new FileOutputStream("D:\\Department2.txt");
			         
			         int c;
			         while ((c = in.read()) != -1) {
			            out.write(c);
			         }
			         System.out.println("Send to department2...\n");
			      }catch(IOException e) {
			    	  System.out.println(e);
			      }
			      catch(Exception e) {
			    	  System.out.println(e);
			      }

			      
			      try {	
			    	  
			    	  	int reply=0;
				         in = new FileInputStream("D:\\Department2.txt");
				         out = new FileOutputStream("D:\\Departmentreply2.txt");
				        
				         for(int i=0;i<2;i++) {
				         System.out.println("Sending to "+userlist2[i]);
				         
				         Scanner c=new Scanner(in);
				         String regulations="";
				         while (c.hasNext()) {
				            regulations+=c.nextLine()+" ";
				          
				         }
				         System.out.println(regulations);
			             System.out.println("Write reply..\n1.Yes to agree:\n2.If you do not consent:");
			             reply=sc.nextInt();
			             if(reply==1) {
			            	 String s="";
			            	 s=s+userlist2[i]+"  I agree"+"   ";
			            	 byte g[]=s.getBytes();
			            	 out.write(g);
			             }
			             if(reply==2) {
			            	 String s="";
			            	 s=s+userlist2[i]+" I disagree\n"+"   ";
			            	 byte g[]=s.getBytes();
			            	 out.write(g);
			             }
				         }
			             in.close();
			             out.close();
				       
				      }catch(IOException e) {
				    	  System.out.println(e);
				      }
				      catch(Exception e) {
				    	  System.out.println(e);
				      }
			      
			      
			      
			      try {
			    	  
				         in = new FileInputStream("D:\\Departmentreply2.txt");
				         out = new FileOutputStream("D:\\Adminreply.txt",true);
				         String s=" Department2"+" ";
				         byte g[]=s.getBytes();
		            	 out.write(g);
		            	 
		            	 
		            	// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));
		            	 
		            		
		            	 
				         int c;
				        // bw.newLine();
				         while ((c = in.read()) != -1) {
				            out.write(c);
				            
				          
				         }
				         System.out.println("Collected replies from  department2...\n");
				         in.close();
				         out.close();
				      }catch(IOException e) {
				    	  System.out.println(e);
				      }
				      catch(Exception e) {
				    	  System.out.println(e);
				      }
			      
			      
		    	  
		      }
		      if(choice==3) {

			      FileInputStream in = null;
			      FileOutputStream out = null;

		      
		    	  try {	
			    	  
			    	  	
				         in = new FileInputStream("D:\\adminreply.txt");
				        
				        
				       
				         Scanner c=new Scanner(in);
				         String replies="";
				         while (c.hasNext()) {
				            replies+=c.nextLine()+" ";
				          
				         }
				         
				         System.out.println(replies);
				         
					      }catch(IOException e) {
					    	  System.out.println(e);
					      }
					      catch(Exception e) {
					    	  System.out.println(e);
					      }
		    	  
		      }
		      
		      
			  }while(choice!=4);
			  
			 
		    		   }
		

	}


