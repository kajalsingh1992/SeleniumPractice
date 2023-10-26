package com.seleniumpractice;
import java.sql.DriverManager;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;
public class jdbc
{
public static void main(String[] args) 
{
	try
	{
//Register the driver with DriverManager (1st way Optional)
//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//Class.forName("com.mysql.cj.jdbc.Driver"); //Register the driver 2nd way
//Get the connection
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","M8$tek12");
	System.out.println(c);//com.mysql.cj.jdbc.ConnectionImpl@424e1977
	//Get the required statement
	Statement statement=c.createStatement();
	System.out.println(statement);
	 //Execute the query
	//statement.executeQuery(null); //to fetch/dql operation
	Scanner s1= new Scanner(System.in);
	System.out.println("Enter id");
	int id=s1.nextInt();
	System.out.println("Enter name");
	String name=s1.next();
	//int i=statement.executeUpdate("insert into employee1 values(4,'Ram')");  //to store/dml data
	//int i=statement.executeUpdate("insert into employee1 values("+id+",'"+name+"')");
	PreparedStatement ps=c.prepareStatement("insert into employee1 values (?,?)");
	ps.setInt(1, id);
	ps.setString(2, name);
	int i= ps.executeUpdate();
	if(i>0)
	{
		System.out.println("Data inserted successfully");
	}
	else
	{
		System.out.println("Data not inserted");
	}
	 //Close Connection
	//c.close();
   ResultSet rs= statement.executeQuery("select * from employee1");
   while(rs.next())
   {
	   System.out.println(rs.getInt("id"));
	   System.out.println(rs.getString("name"));
   }
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
