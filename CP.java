package com.student.manage;
import java.sql.*;

public class CP {
	static Connection con;
	public static Connection createC() {
		try {
			String password="@Aakash277";
			String user="root";
			String url="jdbc:mysql://localhost:3306/student_manage";
			con=DriverManager.getConnection(url,user,password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
