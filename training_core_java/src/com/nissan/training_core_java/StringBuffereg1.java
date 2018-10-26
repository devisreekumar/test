package com.nissan.training_core_java;

public class StringBuffereg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuffer sb=new StringBuffer("Nissan");
		//sb.append("devi");
		//sb.replace(0,3,"devi");
		//sb.delete(0,3);
		//sb.reverse();
		StringBuilder sb=new StringBuilder("Nissan");
		System.out.println(sb.capacity());
		sb.append("is my");
		System.out.println(sb.capacity());
		sb.append("first company where i am");
		System.out.println(sb.capacity());
		System.out.println(sb);

	}

}
