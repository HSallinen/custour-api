package org.custour;

import java.sql.*;

public class Database {
	public static Connection connect() throws SQLException {
		try {
			return DriverManager.getConnection("127.0.0.1", "custour", "custour");
		} catch (SQLException err) {
			System.err.println(err.getMessage());
			return null;
		}
	}
}
