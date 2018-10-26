package com.nissan.training_core_java;
import java.util.Scanner;
/**
 * @author Hp
 *
 */
abstract class Interest{
 
 abstract void roi(int ch,int a,int b);
}
class Loan1 extends Interest{
 
 void roi(int ch,int a,int b) {
  int la;
  Scanner sc =new Scanner(System.in);
  switch(ch) {
  case 1 : 
    System.out.println("Interest rate =27% \n Enter the loan amount : ");
    la = sc .nextInt();
    System.out.println("Please withdraw at the counter...");
    break;
  case 2:
    if(a<20000) {
     System.out.println("Sorry, you dont have the minimum balance to raise a loan request .");
    }
    else {
    System.out.println("Interest rate = 20% \n Enter the loan amount:");
    la = sc .nextInt();
    System.out.println("Please withdraw at the counter...");
    break;
    
    }
  case 3:
      if(b<10000) {
       System.out.println("Sorry, you dont have the minimum balance to raise a loan request .");
      }
      else {
       System.out.println("Interest rate = 10% \n Enter the loan amount:");
     la = sc .nextInt();
     System.out.println("Please withdraw at the counter...");
     break;
     
      }
  }
 }
}
class user extends Loan1{
 int Minbal = 1000;
 int bal =0;
 int FDbal =0;
 int minfd = 500;
 int pin = 5678;
 int uid;
 user(){
   Minbal = 1000;
   bal =0;
   FDbal =0;
   minfd = 500;
   pin = 5678;
   uid = 12345;
  
 }
 void loan() {
  int ch;
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter Loan Category :\n 1.Direct loan \n 2. Current acoount\n 3.Fixed deposite \n");
  ch = sc.nextInt();
  roi(ch,bal,FDbal);
  sc.close();
  
 }
 void Deposit() {
  int qty;
  Scanner sc =new Scanner(System.in);
  System.out.println("Please enter the amount you wish to deposit :");
  qty = sc.nextInt();
  bal+=qty;
  System.out.println("Amount deposited. \nCurrent balance = "+ bal);
  sc.close();
 }
 
 void depoFD() {
  
  int qty;
  Scanner sc =new Scanner(System.in);
  System.out.println("Please enter the amount you wish to deposit :");
  qty = sc.nextInt();
  if(qty < minfd) {
   System.out.println("Minimum amount to deposit is 500");
  }
  else {
  FDbal+=qty;
  System.out.println("Amount deposited. \nCurrent balance = "+ FDbal);
  }
  sc.close();
 }
}
public class Bankexample{
 /**
  * @param args
  */
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  int uid,pin,ch,i;
  i=0;
  Scanner sc =new Scanner(System.in);
  user u1 = new user();
  System.out.println("Please enter User Id :");
  uid = sc.nextInt();
  System.out.println("Please enter your PIN :");
  pin = sc.nextInt();
  if(pin!=u1.pin) {
   System.out.println("Error..wrong pin!");
   
  }
  else {
  
   for(;i!=4;) {
   
   System.out.println("Pin valid\n\n 1.Avail loan \n 2.Deposite cash \n 3.Deposit FD \n4.Exit\n Enter your choice: ");
   ch = sc.nextInt();
   switch(ch) {
   
   case 1:
    u1.loan();
    break;
   case 2:
    u1.Deposit();
    break;
   case 3:
    u1.depoFD();
    break;
   case 4:
    i=4;
    break;
    
   }
   
   }
   
   
   
   
   
   
   
  }
  //sc.close();
  
 }
}




