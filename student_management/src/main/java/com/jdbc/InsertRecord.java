package com.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) {
		try(Connection conn=DataBaseConnection.getDbConnection())
		{
			Statement st=conn.createStatement();
			String query="insert into studentdetails values(1,'Rajat','rajat@gmail.com',85)";
			int row=st.executeUpdate(query);
			System.out.println(row+" record insert successfully");
		}catch(Exception e)
		{
		System.out.println(e.getMessage());
		}

	}

}

	
