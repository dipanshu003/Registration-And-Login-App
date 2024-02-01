package com.helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	public static Connection con;

	public static Connection makeConnection() {
		if (con == null) {

			try {
				// load the Driver
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

				// Create the Connection
				String url = "jdbc:mysql://localhost:3306/servlet";
				String username = "root";
				String pass = "dip piyu";
				con=DriverManager.getConnection(url,username,pass);

			} catch (Exception e) {
				System.out.println("This is Your Connection Error"+e.getMessage());
			}

		}
		return con;
	}
}
