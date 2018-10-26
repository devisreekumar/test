package com.nissan.training_core_java;

public class Oddeven {
	int[] list= {50,20,30,5,2,4,3,9};
	void check() {
		class Localinner{
			int[] odd=new int[100];
			int[] even=new int[100];
			int m=0;
			int k=0;
			void group() {
				for(int i=0;i<list.length;i++) {
					if(list[i]%2==0) {
						even[m]=list[i];
						m++;
					}
					else {
						odd[k]=list[i];
						k++;
					}
				}
				for(int i=0;i<k;i++) {
					System.out.println(odd[i]);
				}
				System.out.println("Even...\n");
				for(int j=0;j<m;j++) {
					System.out.println(even[j]);
				}
			}
			
		}
		Localinner l1=new Localinner();
		l1.group();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oddeven obj=new Oddeven();
		obj.check();
	}

}
