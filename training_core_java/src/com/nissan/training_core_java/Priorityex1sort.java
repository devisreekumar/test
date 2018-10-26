package com.nissan.training_core_java;

public class Priorityex1sort extends Thread {
	public void run() {
		int list[]= {1,20,6,5,4,30,7};
		String[] st= {"devi","pavi","arjun","gouri","asihu","ram","shubham"};
		for(int i=0;i<st.length;i++) {
			for(int j=i+1;j<st.length;j++) {
				if(st[i].compareTo(st[j])<0) {
					String temp=st[i];
					st[i]=st[j];
					st[j]=temp;
				}
				
			}
		}
		for(int i=0;i<list.length;i++) {
			for(int j=i+1;j<list.length;j++) {
				if(list[i]>list[j]) {
					int temp=list[i];
					list[i]=list[j];
					list[j]=temp;
				}
				
			}
		}
	
		
		for(int i=0;i<st.length;i++) {
			System.out.println(st[i]);
		}
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]);
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Priorityex1sort p1=new Priorityex1sort();
		Priorityex1sort p2=new Priorityex1sort();
		
		p1.setPriority(Thread.MIN_PRIORITY);
		p2.setPriority(Thread.MAX_PRIORITY);
		p1.start();
		p2.start();
		

	}

}
