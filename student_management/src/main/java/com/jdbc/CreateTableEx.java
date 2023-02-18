package com.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTableEx {

	public static void main(String[] args) {
		try(Connection conn=DataBaseConnection.getDbConnection())
		{
			//create statement
			Statement st=conn.createStatement();
			String sql="create table Studentdetails(id int primary key,name varchar(50),email varchar(50),marks int)";
			//execute query
			st.executeUpdate(sql);
			System.out.println("Table created successfully");
					
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}


	
