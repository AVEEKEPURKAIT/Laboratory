package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class UpdateExample {

	public static void main(String[] args) {
		try(Connection conn=DataBaseConnection.getDbConnection();
				Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter the name: ");
			String name=sc.nextLine();
			System.out.println("Enter email: ");
			String email=sc.nextLine();
			System.out.println("Enter marks: ");
			int marks=sc.nextInt();
			String sql="update Studentdetails set name='"+name+"',email='"+email+"',marks='"+marks+"'where id=?";
		PreparedStatement ps=conn.prepareStatement(sql);
			System.out.println("Enter the id: ");
			int id=sc.nextInt();
			ps.setInt(1, id);
			int row=ps.executeUpdate();
			System.out.println(row+"record update successfull");
			String query="select * from Studentdetails where id='"+id+"'";
			PreparedStatement ps1=conn.prepareStatement(query);
			ResultSet rs=ps1.executeQuery();
			if(rs.next())
			{
				System.out.println("Id: "+rs.getInt("id"));
				System.out.println("name: "+rs.getString("name"));
				System.out.println("email: "+rs.getString("email"));
				System.out.println("marks: "+rs.getInt("marks"));
				
			}
							
			}
			
		

	
catch(Exception e)
{
	System.out.println(e.getMessage());
}

	}
	}		
	
