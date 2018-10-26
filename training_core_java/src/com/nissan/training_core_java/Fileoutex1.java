package com.nissan.training_core_java;
import java.io.FileOutputStream;
public class Fileoutex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream f1=new FileOutputStream("D:\\example1fib.txt");
			int a=0;
			int b=1;
			int c,i=0;
			System.out.println(a);
			String str=a+" "+b;
			//f1.write(a);
			//f1.write(b);
			System.out.println(b);
			while(i<5) {
			c=a+b;
			str+=" "+c;
			//f1.write(c);
			System.out.println(c);
			a=b;
			b=c;
			i++;
			}
			byte g[]=str.getBytes();
			f1.write(g);
			f1.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
