package com.employee.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

// data access object
public class EmployeeDao {

	public static boolean insertEmployeeToDB(employee em) 
	{
		boolean f=false;
	
		try {
			//jbcd code
			//conection creation
			Connection con=ConnectionProvider.createConnection();
			String q="insert into employee(ename,ephone,ecity) value (?,?,?)";
			
			//prepared statement to fire the query
			
			PreparedStatement pstmt =con.prepareStatement(q);
			//set the values of parameter
			
			pstmt.setString(1, em.getEmployeeName());
			pstmt.setString(2, em.getEmployeePhone());
			pstmt.setString(3, em.getEmployeeCity());
			
			//execute after complete
			
			pstmt.executeUpdate();
			f=true;
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return f;
		
	}
	
	

	public static boolean deleteEmployee(int userId) {
		// TODO Auto-generated method stub
		
		
		boolean f=false;
		
		try {
			//jbcd code
			//conection creation
			Connection con=ConnectionProvider.createConnection();
			String q="delete from employee where eid=?";
			
			//prepared statement to fire the query
			
			PreparedStatement pstmt =con.prepareStatement(q);
			//set the values of parameter
			
			pstmt.setInt(1, userId);
			
			//execute after complete
			
			pstmt.executeUpdate();
			f=true;
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return f;
		
	}

	public static void showAllEmployee() {
		// TODO Auto-generated method stub
		
		
		
		try {
			//jbcd code
			//conection creation
			Connection con=ConnectionProvider.createConnection();
			String q="select * from employee;";
			
			Statement stmt = con.createStatement();
			ResultSet set =stmt.executeQuery(q);
			
			while(set.next())
			{
				
				int id =set.getInt(1);
				String name = set.getString(2);
				String phone =set.getString(3);
				String city = set.getString(4);
				
				System.out.println("ID :"+id );
				System.out.println("name : " +name);
				System.out.println("phone : "+phone);
				System.out.println("city : "+city);
				
				System.out.println("---------------------------------------------");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}



	
}
