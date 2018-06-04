package com.objis.parcauto.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDAO {
	//Information de connexion � la base de donn�es
			static String url ="jdbc:mysql://localhost:3306/parcauto";
			static String user = "root";
			static String pass = "";

			private static Connection connect = null;
			

			public ConnectionDAO() {	
				try {
				
				    this.connect = DriverManager.getConnection(url, user, pass);
					//System.out.println("connection reussie");	
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		public static Connection getInstance(){
			if(connect == null){
				new ConnectionDAO();
			}
			return connect;
			
		}
}
