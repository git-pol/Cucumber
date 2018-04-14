package com.bie.qa.testdata;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

import com.bie.qa.base.TestBase;

	public class MysqlDatabase extends TestBase{
	public static void main(String[] args) throws Exception {
		// Object of Connection from the Database
		Connection conn = null;
		
		// Object of Statement. It is used to create a Statement to execute the query
		Statement stmt = null;
		
		//Object of ResultSet => 'It maintains a cursor that points to the current row in the result set'
		ResultSet resultSet = null;
		Class.forName("com.mysql.jdbc.Driver");
		
		// Open a connection
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdata", "tester", "hazard666");
		
		// Execute a query
		stmt = conn.createStatement();
		
		resultSet = stmt.executeQuery("select * from LoginID");
		while (resultSet .next()) {
			System.out.println(resultSet .getString(1) + "  " + resultSet.getString(2) + "  " + resultSet.getString(3) + "  "
			+ resultSet.getString(4) + "  ");
		}
		
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (Exception e) {
			}
		}
		
		if (stmt != null) {
			try {
				stmt.close();
			} catch (Exception e) {
			}
		}
		
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
			}
		}
	}
}