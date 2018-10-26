package com.nissan.training_core_java;

import java.util.LinkedHashMap;
import java.util.*;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(100, "Ram");
		map.put(101, "gouri");
		
		for(Map.Entry m:map.entrySet()) {///method conversion
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
