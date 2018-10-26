package com.nissan.training_core_java;
interface examplee{
	void sort();
	void swap(int a,int b);
	
}
public class Sort implements examplee{
	int[] a= {10,1,2,8,3,4};
	@Override

	public void swap(int i,int j) {
		 
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
	@Override
	
	public void sort() {
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					swap(i,j);
				}
				
			}
			
		
		}
	
		
	
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sort s=new Sort();
		s.sort();
		

	}

}
