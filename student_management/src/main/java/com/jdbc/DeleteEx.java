package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteEx {

	public static void main(String[] args) {
		try(Connection conn=DataBaseConnection.getDbConnection();
				Scanner sc=new Scanner(System.in))
{
	String sql="delete from Studentdetails id=?";
	PreparedStatement ps=conn.prepareStatement(sql);
	System.out.println("Enter the id: ");
	int id=sc.nextInt();
	ps.setInt(1, id);
	int row=ps.executeUpdate();
	if(row==0)
	{
		System.out.println("id not found");
		
	}
	else
		System.out.println("record delete successfully");
}catch(Exception e)
{
	System.out.println(e.getMessage());
}
	}
}
	

