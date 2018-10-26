package com.nissan.training_core_java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.HashSet;

public class Customercollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList <String> ();//array list
		list.add("devi");
		list.add("pavi");
		list.add("ajuu");
		list.remove("Rahul");
		
		/*Iterator i=list.iterator();
		while(i.hasNext())
		//for (String k:list)
			{
			System.out.println(i.next());
		}*/
		LinkedList<String> l1=new LinkedList<String>();
		
		l1.add("9447088438");
		l1.add("94470666666");
		l1.add("94470777777");
		l1.add("94470822344");
		/*
		Iterator<String> k=l1.iterator();
		while(k.hasNext())
			//for (String k:list)
				{
				System.out.println(k.next());
			}*/
		HashSet<String> l2=new HashSet<String>();
		
		l2.add("21");
		l2.add("22");
		l2.add("23");
		l2.add("24");
		/*Iterator<String> l=l2.iterator();
		while(l.hasNext()) {
			System.out.println(l.next());
		}*/
		LinkedHashSet<String> l3=new LinkedHashSet<String>();
		
		l3.add("21-04-1996");
		l3.add("22-05-1994");
		l3.add("23-06-1992");
		l3.add("24-01-1997");
		/*Iterator<String> p=l3.iterator();
		while(p.hasNext()) {
			System.out.println(p.next());
		}*/
		l1.addAll(list);
		l2.addAll(l1);
		l3.addAll(l2);
		Iterator<String> g=l3.iterator();
		while(g.hasNext()) {
			System.out.println(g.next());
		}

	}

}
