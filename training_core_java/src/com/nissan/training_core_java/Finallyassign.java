package com.nissan.training_core_java;
import java.util.Scanner;
abstract class Addbook{
	abstract void addbook();
		
	abstract void remove();
	abstract void update();
}
class Libuser{
	int userid;
	int username;
	int bookcount=0;
	
	String bookbr[]=new String[3];
	
	
}

public class Finallyassign extends Libuser{
	static StringBuffer booklist[][]=new StringBuffer[5][5];
	static int limit=0;
	void display() {													//displays list of books in library along with no of copies available
		System.out.println("\nBooklist...!!\n");
		for(int i=0;i<limit;i++) {
			System.out.println(booklist[0][i]+" "+booklist[1][i]);
		}
	}

	 void userac() {													//display list of books borrowed by user
		 System.out.println("\nBooks borrowed:");
		 for(int i=0;i<bookcount;i++) {
			 System.out.println(bookbr[i]+" ");
		 }
	 }
	 void borrow() {													//borrows book
		 Scanner sc=new Scanner(System.in);
		 
		for(int i=0;i<limit;i++) {
			System.out.println((i+1)+" "+booklist[0][i]+" "+booklist[1][i].toString());
		}
		System.out.println("Enter index of book");
		int c=sc.nextInt();
		
		int m=Integer.parseInt(booklist[1][c-1].toString());
		m--;
		if(m>=0) {
		booklist[1][c-1]=new StringBuffer(String.valueOf(m));
		bookbr[bookcount]=new String();
		bookbr[bookcount]=booklist[0][c-1].toString();
		bookcount++;
		
		System.out.println("number of books borrowed:"+bookcount);
		userac();
		display();
		}
		else {
			System.out.println("Currently unavailable");
		}
		
	}
	
	 
	 void returnbook() {										//returns borrowed book
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter book name");
		 String a1=sc.next();
		 for(int i=0;i<limit;i++) {
			 if(a1.equals(booklist[0][i].toString())) {
				 int no=Integer.parseInt(booklist[1][i].toString());
				 no++;
				 booklist[1][i]=new StringBuffer(String.valueOf(no));
				 
			 }
			 
		 }
		 for(int i=0;i<bookcount;i++) {
			 if(a1.equals(bookbr[i])) {
				 if(bookcount!=1) {
				 bookbr[i]=bookbr[bookcount-1];
				 bookcount--;
				 }
				 else {
					 bookbr=null;
					 System.out.println("No books to return");
					 bookcount--;
				 }
				 
			 }
			 
		 }
		 display();
		userac();
		 
		 
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice;
		String adminpass="library";
		String admin="Ram";
		Scanner sc=new Scanner(System.in);
		Finallyassign mn=new Finallyassign();
		Libuser abc[]=new Libuser[5];
		Addbook obj =new Addbook(){									//Anonymous class
		void addbook() {											//Adds a new book to library
				try {
					
																//exception handling
					
					
				System.out.println("Enter book name");
				
				booklist[0][limit]=new StringBuffer(sc.next());
				System.out.println("Enter book count");
				
				booklist[1][limit]=new StringBuffer(sc.next());
				System.out.println(booklist[1][limit]);
				limit++;
				mn.display();
				System.out.println("Successfully entered");
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println(e);
				}
			}
			
			void remove() {											//removes a book from library
				System.out.println("Enter name of book");
				String s=sc.next();
				for(int i=0;i<limit;i++) {
					if(s.equals(booklist[0][i].toString())) {
						//booklist[0][i].setLength(0);
						booklist[1][i]=new StringBuffer("Not available removed");
						//limit--;
						break;
					}
					
				}
				mn.display();
			}
			
			void update() {										//updates number of copies of books
				System.out.println("Enter name of book");
				String s=sc.next();
				for(int i=0;i<limit;i++) {
					if(s.equals(booklist[0][i].toString())) {
						System.out.println("Enter number of copies :");
						int n=sc.nextInt();
						int m=Integer.parseInt(booklist[1][i].toString());
						m=m+n;
						booklist[1][i]=new StringBuffer(String.valueOf(m));
					}
				}
				mn.display();
				
			}
			
			
		};
		do {
		System.out.println("Enter choice..\n1.If user..\n2.If admin..\n");
		choice=sc.nextInt();
		if(choice==2) {												//admin login
			int ch;
			System.out.println("Enter admin name:");
			String s1=sc.next();
			System.out.println("Enter admin password:");
			String s2=sc.next();
			if(s1.equals(admin)) {
				if(s2.equals(adminpass)) {
					do {
					System.out.println("Enter choice..\n1.Addbook..\n2.Remove book..\n3.Update..\n4.Exit..");
					ch=sc.nextInt();
					if(ch==1) {
						obj.addbook();
						
					}
					else if(ch==2){
						obj.remove();
					}
					else if(ch==3) {
						obj.update();
					}
					System.out.println("Press 4 to exit from admin menu...\npress any other number key to continue..\n");
					ch=sc.nextInt();
					}while(ch!=4);
				}
			}
			
		}
		else if(choice==1) {												//user transactions.....!!!
			int ch;
			do {
			System.out.println("Enter choice..\n1.Borrow book..\n2.Return book");
			ch=sc.nextInt();
			
			if(ch==1) {
				mn.borrow();
				
			}
			else if(ch==2) {
				mn.returnbook();
			}
			System.out.println("Press 3 to exit..\nPress any other number key for new transaction..\n");
			ch=sc.nextInt();
			}while(ch!=3);
		}
		System.out.println("Press 3 to exit..\nPress any other number key to continue to user ..\n");
		choice=sc.nextInt();
		
		}while(choice!=3);
	}

}
