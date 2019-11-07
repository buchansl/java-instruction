package db;

import java.sql.*;



public class Bmdb_db {
	protected Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/bmdb_bd_create?useSSL=false&allowPublicKeyRetrieval=true";
		String username = "bmdb_user";
		String password = "sesame";
		Connection conn = DriverManager.getConnection(dbURL, username, password);
		return conn;

	}

}