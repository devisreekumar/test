package com.nissan.training_core_java;

import java.util.Iterator;
import java.util.*;

public class Dequeue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Deque<String> l1=new ArrayDeque<String>();
			
			l1.add("devi");
			l1.add("rahul");
			l1.add("pavi");
			 System.out.println("head"+l1.element());
			 System.out.println("head"+l1.peek());
		 Iterator<String> i=l1.iterator();
		 while(i.hasNext()) {
			 System.out.println(i.next());
		 }
		 l1.remove();
		 System.out.println("removing");
		 Iterator<String> io=l1.iterator();
		 while(io.hasNext()) {
			 System.out.println(io.next());
		 }



	}

}
