package com.day14_last;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {
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
			
			String q="Insert Into student2 values (104,'Devesh','M2',2.5),(102,'Om','M1',2.8),(103,'raj','html',0.6)";
			System.out.println("Insert value Successfully....");
			boolean s=stmt.execute(q);
			}
			catch(Exception e)
				{
					System.err.println(e);
				}
			}
	}

