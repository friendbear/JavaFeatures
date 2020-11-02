package com.jff.java7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TryWithResourceDemo {

	public static void main(String[] args) {
		
		/*
		 * Note: in this code, concentrate mainly on try with resource syntax, rather than jdbc, mysql etc. 
		 */
		
		/*
		 * Note: Please add mysql-connector-java-5.1.22-bin.jar jar in classpath
		 */
		beforeJava7();
		fromJava7();
		

	}

	private static void beforeJava7() {
		String url = "jdbc:mysql://localhost/employee";
		String user = "root";
		String password = "root";
		String query = "SELECT id, name FROM employee";
		String jdbcDriver = "com.mysql.jdbc.Driver";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {

				System.out.print("Employee ID: " + rs.getInt("id"));
				System.out.println(", Name: " + rs.getString("name"));

			}
			System.out.print("End TryWithResourceBeforeJava7");
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (ClassNotFoundException se) {
			se.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
				se2.printStackTrace();
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}

	private static void fromJava7() {

		String url = "jdbc:mysql://localhost/employee";
		String user = "root";
		String password = "root";
		String query = "SELECT id, name FROM employee";
		String jdbcDriver = "com.mysql.jdbc.Driver";

		try (Connection conn = DriverManager.getConnection(url, user, password);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {

			Class.forName(jdbcDriver);
			while (rs.next()) {
				System.out.print("Employee ID: " + rs.getInt("id"));
				System.out.println(", Name: " + rs.getString("name"));
			}
			System.out.print("End TryWithResourceFromJava7 !");
		} catch (SQLException | ClassNotFoundException se) {
			se.printStackTrace();
		}
	}

}
