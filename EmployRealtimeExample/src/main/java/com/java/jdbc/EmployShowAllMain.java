package com.java.jdbc;

import java.sql.SQLException;
import java.util.List;

public class EmployShowAllMain {

	public static void main(String[] args) {
		EmployNewDAO dao = new EmployNewDAO();

		try {
			List<EmployNew> employList = dao.showEmploy();
			for (EmployNew employNew : employList) {
				System.out.println(employNew);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
