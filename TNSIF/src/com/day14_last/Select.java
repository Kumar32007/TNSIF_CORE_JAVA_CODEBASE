package com.day14_last;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Select {
	public static void main(String[] args) {	
		try {
			
			//step 1: Load or register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is load successfully");	
			
			//step 2: create connection 		
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dypatil","root","root");
			System.out.println("Connection created successfully");
				
			//step 3: create a statement 
			Statement stmt=con.createStatement();		
			System.out.println("Statement created succesfully");
			
			//step 4: write a query	
			java.sql.ResultSet rs = stmt.executeQuery("select * from Student2;");
			System.out.println("stdid \t name \t Subject Duration");
			
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getDouble(4));
			}
			}
			catch(Exception e)
				{
					System.err.println(e);
				}
			}
	}

