package com.nissan.training_core_java;
import java.util.*;
public class Arraylistcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList <String> ();//array list
		list.add("devi");
		list.add("pavi");
		list.add("ajuu");
		list.remove("Rahul");
		ArrayList<String> listone=new ArrayList <String> ();
		listone.addAll(list);
		Iterator i=list.iterator();
		Iterator m=listone.iterator();
		while(i.hasNext())
		//for (String k:list)
			{
			System.out.println(i.next());
		}
		while(i.hasNext()) {
			System.out.println(m.next());
		}

	}

}
