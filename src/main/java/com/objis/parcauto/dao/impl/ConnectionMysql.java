package com.objis.parcauto.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMysql {

	private static final String URL = "jdbc:mysql://localhost/parcauto";
	private static final String USER = "root";
	private static final String PASSWORD = "root";

	private static Connection connection;

	public static Connection getInstance()  {

		if (connection == null) {

			try {
				connection = DriverManager.getConnection(URL, USER, PASSWORD);
			} catch (SQLException e) { 
                            e.printStackTrace();
			}  
		}

		return connection;
	}

}
