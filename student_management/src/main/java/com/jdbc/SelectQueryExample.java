package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectQueryExample {

	public static void main(String[] args) {
		try(Connection conn=DataBaseConnection.getDbConnection())
		{
			String sql="select * from Studentdetails";
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while (rs.next()) 
		
			{
				System.out.println("Student id: "+rs.getInt(1));
				System.out.println("Student name: "+rs.getString("name"));
				System.out.println("Student email: "+rs.getString("email"));
				System.out.println("Student marks: "+rs.getInt(4));
				System.out.println("====================");
			}
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}


	
