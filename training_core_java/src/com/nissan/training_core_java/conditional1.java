package com.nissan.training_core_java;

public class conditional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,4,5,1,2,7,5};
		for(int i=0;i<=7;i++)
		{	
			for(int j=i+1;j<=7;j++)
			{
				if ((a[j]==a[i])&& (a[j]!=0))
				{
					a[j]=0;
					System.out.println(a[i]+"found at"+" "+(j+1));
					
				}
			}
			a[i]=0;
			
		}

	}

}
