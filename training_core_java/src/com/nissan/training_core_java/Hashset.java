package com.nissan.training_core_java;
import java.util.*;
public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> l1=new LinkedHashSet<String>();
		LinkedHashSet<String> l2=new LinkedHashSet<String>();
		l1.add("devi");
		l2.add("aaa");
 Iterator<String> i=l1.iterator();
 while(i.hasNext()) {
	 System.out.println(i.next());
 }
	}

}
