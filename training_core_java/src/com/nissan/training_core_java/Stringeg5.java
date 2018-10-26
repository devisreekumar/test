package com.nissan.training_core_java;

public class Stringeg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s="";
	//String word[];
	System.out.println(s.isEmpty());
	if(s.isEmpty()) {
		
		String ch=s.concat("hello - india-is-my-country");
		System.out.println(ch);
		s=ch;
		String[] word=s.split("-");
		
	
	for(String w:word){  //for each loop
		System.out.println(w);  
		}  }

	}

}
