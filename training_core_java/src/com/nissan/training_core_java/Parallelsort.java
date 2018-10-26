package com.nissan.training_core_java;
import java.util.Arrays;
public class Parallelsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int list[]= {5,10,6,3,9,22};
		for(int i:list) {
			System.out.println(i+" ");
		}
		Arrays.parallelSort(list);
		System.out.println("\n Eements after sorting");
		for(int i:list) {
			System.out.println(i+" ");
		}
	}

}
