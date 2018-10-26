package com.nissan.training_core_java;

import java.util.Iterator;
import java.util.*;

public class Treeex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> l1=new TreeSet<String>();
		
		l1.add("devi");
		l1.add("rahul");
		l1.add("pavi");
	 Iterator<String> i=l1.iterator();
	 while(i.hasNext()) {
		 System.out.println(i.next());
	 }
	
	}

}
