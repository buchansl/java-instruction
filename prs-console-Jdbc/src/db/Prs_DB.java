package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Prs_DB {protected Connection getConnection() throws SQLException {
	String dbURL = "jdbc:mysql://localhost:3306/prs_db?useSSL=false&allowPublicKeyRetrieval=true";
	String username = "prs_user";
	String password = "sesame";
	Connection conn = DriverManager.getConnection(dbURL, username, password);
	return conn;

}

}
