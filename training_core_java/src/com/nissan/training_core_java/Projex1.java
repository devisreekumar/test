package com.nissan.training_core_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Projex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			//step1 load the driver class  
			//Class.forName("com.mysql.cj.jdbc.Driver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/test","root","devi1996");  
			  
			//step3 create the statement object  
			Statement stmt=con.createStatement();  
			  
			//step4 execute query  
			ResultSet rs=stmt.executeQuery("select * from emp");  
			//System.out.println("found");
			while(rs.next())  
			{
				
			System.out.println(rs.getInt(1));  
			}
			//step5 close the connection object  
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  

	}

}
