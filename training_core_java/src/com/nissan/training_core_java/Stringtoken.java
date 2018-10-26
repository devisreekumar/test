package com.nissan.training_core_java;
import java.util.StringTokenizer;
public class Stringtoken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st=new StringTokenizer("my name is nissan");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
