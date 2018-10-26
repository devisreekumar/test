package com.nissan.training_core_java;
interface Process{
	int reverse();
	interface Read{
		void check(int a);
	}
}
public class Palindrome implements Process.Read,Process {
	int number=121,n=number;
	public int reverse() {
		
		int rev=0;
		int d;
		
		while(number>0) {
		d=number%10;
		number=number/10;
		rev=(rev*10)+d;
		
			}
		return rev;
	}
	public void check(int a) {
		if (a==n) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Process obj1=new Palindrome();
		int s=obj1.reverse();
		Process.Read obj2=new Palindrome();
		obj2.check(s);

	}

}
