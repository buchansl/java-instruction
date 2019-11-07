package db;

import java.sql.*;

import business.Stuffy;;

public class StuffyDB {
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/stuffy_db?useSSL=false&allowPublicKeyRetrieval=true";
		String username = "stuffy_user";
		String password = "sesame";
		Connection connection = DriverManager.getConnection(dbURL, username, password);
		return connection;

	}

	public Stuffy get(int id) {

		String sql = "SELECT * FROM stuffy " + "where id = " + id;
		Stuffy s = null;
		try (Statement statement = getConnection().createStatement(); ResultSet rs = statement.executeQuery(sql);) {
			boolean stuffyExists = rs.next();
			if (stuffyExists)
				;
			{
				int id2 = rs.getInt(1);
				String type = rs.getString(2);
				String color = rs.getString(3);
				String size = rs.getString(4);
				int limbs = rs.getInt(5);
				s = new Stuffy(id2, type, color, size, limbs);
			}
		} catch (SQLException e) {

			e.printStackTrace();

		}

		return s;
	}

	public int add(Stuffy s) {
		int rowCount = 0;
		String sql = "Insert Into Stuffy (Type, Color, Size, Limbs)" + "Values(?,?,?,?)";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setString(1, s.getType());
			ps.setString(2, s.getColor());
			ps.setString(3, s.getSize());
			ps.setInt(4, s.getLimbs());
			rowCount = ps.executeUpdate();

		} catch (SQLException se) {
			System.out.println(se);
		}

		return rowCount;
	}
	public String list(String Stuffy) {
		String sql = "Select * FROM Stuffy;";
		return sql;
		
	}
}
