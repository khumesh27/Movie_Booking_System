package com.bookingsystem.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static final String url = "jdbc:mysql://localhost:3306/moviebookingsystem";
	private static final String username = "root";
	private static final String password = "2710";

	public static Connection getDBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			return con;
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Class not found ");
			e.getMessage();
		}
		return null;
	}
}
