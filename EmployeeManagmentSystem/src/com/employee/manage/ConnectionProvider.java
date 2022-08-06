package com.employee.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

	// to store the connection taking veriable
	static Connection con;
	
	public static Connection createConnection()
	{
		
		try {
			//loading the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			
			//create the connection

			String url="jdbc:mysql://localhost:3306/emApp";
			String user="root";
			String password="My-N7w_And.5ecure-P@s5w0rd";
			
			con = DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return con;
	}
}
