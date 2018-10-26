package com.nissan.training_core_java;///Here regulations file from admin is send to each department 
										//..and from department it is given to employees...and their replies 
										//are collected and written to a file..and files from each of the departments are given to admin..
import java.io.*;
import java.util.Scanner;
public class Employeeproject {
	static void sendtodept(String s) {					//send to department regulations

	      FileInputStream in = null;
	      FileOutputStream out = null;

	      try {
	         in = new FileInputStream("D:\\adminnotice.txt");
	        out = new FileOutputStream("D:\\"+s+".txt");
	             
            
	         int c;
	         while ((c = in.read()) != -1) {
	            out.write(c);
	         }
	         System.out.println("Send to "+s+ "..\n");
	         in.close();
	         out.close();
	      }catch(IOException e) {
	    	  System.out.println(e);
	      }
	      catch(Exception e) {
	    	  System.out.println(e);
	      }
	  
	}
	
static	void sendtoemployees(String s,String s1,String[] list,int m) { //send regulations to employees of each department regulations
	 FileInputStream in = null;
     FileOutputStream out = null;

	
	  try {	
    	  
  	  	int reply=0;
	         in = new FileInputStream("D:\\"+s+".txt");
	         out = new FileOutputStream("D:\\"+s1+".txt");
	        
	         for(int i=0;i<m;i++) {
	         System.out.println("Sending to "+list[i]);
	         
	         Scanner c=new Scanner(in);
	         String regulations="";
	         while (c.hasNext()) {
	            regulations+=c.nextLine()+" ";
	          
	         }
	         System.out.println(regulations);
	         Scanner sc=new Scanner(System.in);
	         System.out.println("Write reply..\n1.Yes to agree:\n2.If you do not consent:");
	         reply=sc.nextInt();
		       if(reply==1) {
		      	 String s2="";
		      	 s2=s2+"   "+list[i]+"  I agree  ";
		      	 byte g[]=s2.getBytes();
		      	 out.write(g);
		       }
	           if(reply==2) {
	          	 String s2="";
	          	 s2=s2+"   "+list[i]+" I disagree  ";
	          	 byte g[]=s2.getBytes();
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
    
    
	
}
static void writetoadmin(String m,String m1,String s) {
	 FileInputStream in = null;
     FileOutputStream out = null;

	 try {
   	  
         in = new FileInputStream("D:\\"+m+".txt");
         out = new FileOutputStream("D:\\Admin\\"+m1+".txt",true);
     
    
    		
    	 
         int c;
      
         while ((c = in.read()) != -1) {
            out.write(c);
            
          
         }
         System.out.println("Collected replies from  "+s+"...\n");
         in.close();
         out.close();
      }catch(IOException e) {
    	  System.out.println(e);
      }
      catch(Exception e) {
    	  System.out.println(e);
      }
  

	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=0;
		int choice;
		do {
		System.out.println("Enter choice 1.To send to departments regulations\n2.To send to employees\n3.To send reply to admin\n4.Exit");
		choice=sc.nextInt();
		
		
		if(choice==1) {
			System.out.println("Enter number of departments:");
			n=sc.nextInt();
			for(int i=0;i<n;i++) {
				sendtodept("Department"+(i+1));
			}
		}
		
		
		if(choice==2) {
			String list[]=new String[15];
			for(int i=0;i<n;i++) {
				System.out.println("Enter number of employees of"+(i+1)+"department");
				 int m=sc.nextInt();
				System.out.println("Enter employee names of "+(i+1)+" department");
				for(int j=0;j<m;j++) {
				
				
						list[j]=sc.next();
				}
				
				sendtoemployees("Department"+(i+1),"Departmentreply"+(i+1),list,m);
			}

		}
		
		if(choice==3) {
			
			for(int i=0;i<n;i++) {
				writetoadmin("Departmentreply"+(i+1),"adminreply"+(i+1),"department"+(i+1));
			}
		
		}
			
		}while(choice!=4);
	}

}
