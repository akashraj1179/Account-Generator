package com.student.manage;

import java.util.Scanner;

public class Student {
	private int tId;
	private String firstName;
	private String lastName;
	private String password;
	private String phone;
	private String address;
	private String department;
	private String dEmail;
	private String aEmail;
	private int defaultPasswordLength=12;
	private String companySuffix="techsys.com";
	public Student(int tId, String firstName,String lastName,String phone, String address,String department,String aEmail) {
		super();
		this.tId = tId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
		this.department=department;
		this.aEmail=aEmail;
	}
	public Student(String firstName,String lastName, String phone, String address,String department,String aEmail) {
		super();
		this.firstName = firstName;
		this.lastName=lastName;
		this.phone = phone;
		this.address = address;
		this.department=department;
		this.aEmail=aEmail;
	}
	public Student(String firstName,String lastName) {
		super();
		this.firstName=firstName;
		this.lastName=lastName;
		this.department=setDepartment();
		dEmail=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department.toLowerCase()+"."+companySuffix;
		System.out.println("Your Email is: "+dEmail);
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("Your password is: "+this.password);
		// TODO Auto-generated constructor stub
	}
	private String setDepartment() {
		System.out.print("New worker: "+firstName+" "+lastName+ "\nDepartment Codes\n1 for Sales\n2 for Development\n3 for Accounting\n4 for InfraServices\n5 for Bussiness\n0 for None\nEnter Department Code: ");
		Scanner sc=new Scanner(System.in);
		int deptChoice=sc.nextInt();
		if(deptChoice==1){return "Sales";}
		else if(deptChoice==2){return "Dev";}
		else if(deptChoice==3){return "Acc";}
		else if(deptChoice==4){return "Is";}
		else if(deptChoice==5){return "Biz";}
		else{return "";}
	}
	private String randomPassword(int length){
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456890@$#&!%";
		char[] password=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	@Override
	public String toString() {
		return "[tId=" + tId + ", firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + ", address=" + address + ", department=" + department + ", aEmail=" + aEmail + "]";
	}
	public int getTId() {
		return tId;
	}
	public void setTId(int tId) {
		this.tId = tId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	public String getAEmail() {
		return aEmail;
	}
	public void setAEmail(String aEmail) {
		this.aEmail = aEmail;
	}
	
	
	

}
