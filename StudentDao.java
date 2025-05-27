package com.student.manage;
import java.sql.*;

public class StudentDao {
	public static boolean insertEmployeeToDB(Student em) {
		boolean f=false;
		try {
			Connection con=CP.createC();
			String q="insert into students(FIRSTNAME,LASTNAME,MOBILENO,ADDRESS,DEPARTMENT,ALTERNATE_EMAIL) values(?,?,?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setString(1, em.getFirstName());
			pstmt.setString(2, em.getLastName());
			pstmt.setString(3, em.getPhone());
			pstmt.setString(4, em.getAddress());
			pstmt.setString(5, em.getDepartment());
			pstmt.setString(6, em.getAEmail());
			pstmt.executeUpdate();
			f=true;
			
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
			
	}

	public static boolean deleteStudent(int userId) {
		
		// TODO Auto-generated method stub
		boolean f=false;
		try {
			Connection con=CP.createC();
			String q="delete from students where sid=?";
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setInt(1, userId);
			pstmt.executeUpdate();
			f=true;
			
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}

	public static void showEmployeeRecords() {
		// TODO Auto-generated method stub
		boolean f=false;
		try {
			Connection con=CP.createC();
			String q="select * from students";
			Statement stmt=con.createStatement();
			ResultSet set=stmt.executeQuery(q);
			while(set.next()) {
				int id=set.getInt(1);
				String f_name=set.getString(2);
				String l_name=set.getString(3);
				String phone=set.getString(4);
				String add=set.getString(5);
				String dep=set.getString(6);
				String a_email=set.getString(7);
				
				System.out.println("ID: "+id);
				System.out.println("FIRSTNAME: "+f_name);
				System.out.println("LASTNAME: "+l_name);
				System.out.println("MOBILENO: "+phone);
				System.out.println("ADDRESS: "+add);
				System.out.println("DEPARTMENT: "+dep);
				System.out.println("ALTERNATE_EMAIL: "+a_email);
				System.out.println("+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
				
			}
			
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
