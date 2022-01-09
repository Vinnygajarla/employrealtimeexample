package com.java.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployInsertMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployNew employ = new EmployNew();
		System.out.println("Enter Employ No  ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Name   ");
		employ.setName(sc.next());
		System.out.println("Enter Gender   ");
		employ.setGender(sc.next());
		System.out.println("Enter Department  ");
		employ.setDept(sc.next());
		System.out.println("Enter Designation  ");
		employ.setDesig(sc.next());
		System.out.println("Enter Basic   ");
		employ.setBasic(sc.nextDouble());
		EmployNewDAO dao = new EmployNewDAO();
		try {
			System.out.println(dao.addEmploy(employ));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
