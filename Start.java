package com.student.manage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("This is TECHSYS!"); 
		System.out.println("WELCOME TO OUR SITE......"); 
		System.out.println("This is an Employee's Record Maintaineance Application!");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Press 1 To Add Employee");
			System.out.println("Press 2 To Delete Employee's record");
			System.out.println("Press 3 To Display Employee's record");
			System.out.println("Press 4 To Generate Account for New Hires");
			System.out.println("Press 0 To Exit Application");
			int c=Integer.parseInt(br.readLine());
		
			if(c==1)
			{
				//ADD STUDENT
				System.out.println("Enter First Name:");
				String f_name=br.readLine();
				
				System.out.println("Enter Last Name:");
				String l_name=br.readLine();
				
				System.out.println("Enter phone no.:");
				String phone=br.readLine();
				
				System.out.println("Enter City:");
				String city=br.readLine();
				System.out.println("Enter Department:");
				String dep=br.readLine();
				System.out.println("Enter Your Alternate Email:");
				String a_email=br.readLine();
				//create student object to store student
				
				Student em=new Student(f_name,l_name,phone,city,dep,a_email);
				boolean answer=StudentDao.insertEmployeeToDB(em);
				if(answer) {
					System.out.println("Employee is added successfully....");
				}
				else {
					System.out.println("Something Went Wrong....");
				}
				System.out.println(em);
			
			}else if(c==2)
			{
				//delete student
				System.out.println("Enter Id To Delete: ");
				int userId=Integer.parseInt(br.readLine());
				boolean f=StudentDao.deleteStudent(userId);
				if(f) {
					System.out.println("Deleted....");
				}else {
					System.out.println("Something Went Wrong,Please Try Again....");
				}
			}else if(c==3)
			{
				//display students
				StudentDao.showEmployeeRecords();
			}
			else if(c==4) 
			{
				//use elements to generate email 
				System.out.println("Enter First Name: ");
				String f_name=br.readLine();
				System.out.println("Enter Last name: ");
				String l_name=br.readLine();
				Student em1=new Student(f_name,l_name);
			}
			else if(c==0)
			{
				//exit
				break;
			}else {
				System.out.println("Wrong Input,Please Try again...");
			}
			
		}
		System.out.println("Thank you for using my application...");
		System.out.println("see you soon bye bye");

	}

}