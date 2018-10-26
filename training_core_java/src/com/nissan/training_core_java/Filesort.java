package com.nissan.training_core_java;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class Filesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileOutputStream fout=new FileOutputStream("D:\\test.txt");
		FileInputStream fin=new FileInputStream("D:\\test.txt");
		//int a[]= {30,20,10,56,7,8};
		
		int i=0,m=0;
		int list[]=new int[20];
		while((i=fin.read())!=-1) {
			list[m++]=Character.getNumericValue(i);
		}
		for( i=0;i<list.length;i++) {
			for(int j=i+1;j<list.length;j++) {
				if(list[i]>list[j]) {
					int temp=list[i];
					list[i]=list[j];
					list[j]=temp;
				}
				
			}
		}
		for(int k=0;k<list.length;k++) {
			
			byte mn[]=String.valueOf(list[k]).getBytes();
			fout.write(mn);
			}
		fin.close();
		fout.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
