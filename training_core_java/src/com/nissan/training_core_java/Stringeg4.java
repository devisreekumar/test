package com.nissan.training_core_java;
import java.util.Scanner;
public class Stringeg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String namelist[]= {"devi","rahul","ram","devi","ram","gouri","rahul"};
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<namelist.length;i++) {
			for(int j=i+1;j<namelist.length;j++) {
				if(namelist[i]==namelist[j]) {
					System.out.println("Name:"+namelist[i]+"Enter second name");
					String newname=sc.next();
					namelist[j]=namelist[j].concat(" ");
					namelist[j]=namelist[j].concat(newname);
					
				}
			}
		}
		for(int i=0;i<namelist.length;i++)
		{
			for(int j=i+1;j<namelist.length;j++) {
				if(namelist[i].compareTo(namelist[j])>0) {
					String temp=namelist[i];
					namelist[i]=namelist[j];
					namelist[j]=temp;
				}
			}
		}
		
		for(int k=0;k<namelist.length;k++) {
			System.out.println(namelist[k]);
		}

	}

}
