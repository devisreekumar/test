package com.nissan.training_core_java;
import java.util.Scanner;
public class Customerex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer customer[][]=new StringBuffer[20][20];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of customers");//setlength
		int n=sc.nextInt();
		for(int i=0;i<n;i++) 
			{
			System.out.println("Enter"+(i+1)+"customer details");
				for(int j=0;j<4;j++) 
				{
					customer[j][i]=new StringBuffer(sc.next());
				}
			}
		for(int i=0;i<n;i++) 
		{
	
				
			
	String ch=String.join("-", customer[1][i].toString(),customer[2][i].toString(),customer[3][i].toString());
			customer[1][i]=new StringBuffer(ch);
			customer[2][i].setLength(0);
			
			customer[3][i].setLength(0);
		}
		
		for(int i=0;i<n;i++) 
		{
		System.out.println((i+1)+"st customer details..\n");
			System.out.println("Name:"+customer[0][i]+"\nDob:"+customer[1][i]);
		}
		sc.close();
	}

}
