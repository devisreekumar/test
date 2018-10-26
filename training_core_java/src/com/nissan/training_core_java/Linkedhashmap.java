package com.nissan.training_core_java;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Linkedhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
		map.put(100, "Ram");
		map.put(101, "gouri");
		
		for(Map.Entry m:map.entrySet()) {///method conversion
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
