package com.nissan.training_core_java;

public class Stringeg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= " Nissan  is    ";
		String a="my company";
		String b="";
		System.out.println(s.substring(0, 2));//substring
		
		System.out.println(s.indexOf("is"));//index of
		
		System.out.println(s.toLowerCase());//lowercase
		
		System.out.println(s.toUpperCase());//uppercase
		
		System.out.println(s.trim()+"mine");//trim 
		
		
		System.out.println(s.concat(a));//concat
		
		System.out.println(a.isEmpty());
		System.out.println(b.isEmpty());
		
		
		
		String d="devi";
		String sd="devi";
		
		//System.out.println(d.isequal(sd));
		System.out.println(String.join("*","Hello","to","India" ));//join adds at end of string the delimiter
		
		String ns=String.format("name is %s", s);
		System.out.println(ns);
		
		char ch=s.charAt(0);//it returns char value at index 0 
		System.out.println(ch);
		
		int c=s.length();//length of string
		System.out.println(c);
		
		

	}

}
