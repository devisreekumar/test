package com.nissan.training_core_java;
import java.util.Scanner;
public class EmployeeBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer namelist[]= new StringBuffer[100];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of employees");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("enter name");
			StringBuffer st=new StringBuffer(sc.next());
			namelist[i]=st;
		}
	
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(namelist[i].toString().compareTo(namelist[j].toString())==0) {
					System.out.println("Name:"+namelist[i]+"Enter second name");
					StringBuffer newname=new StringBuffer(sc.next());
					
					namelist[j].append(newname);
					
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++) {
				if(namelist[i].toString().compareTo(namelist[j].toString())>0) {
					StringBuffer temp=namelist[i];
					namelist[i]=namelist[j];
					namelist[j]=temp;
				}
			}
		}
		for(int k=0;k<n;k++) {
			System.out.println(namelist[k]);
		}
		sc.close();

	}

}
