package db;



import java.sql.*;

import business.Beers;
import business.Bars;



public class beerTapDb {
	protected static Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/beer_tap?useSSL=false&allowPublicKeyRetrieval=true";
		String username = "beer_tap_user";
		String password = "sesame";
		Connection conn = DriverManager.getConnection(dbURL, username, password);
		return conn;

	}
	public Beers get(int id) {

		String sql = "SELECT * FROM Beer " + "where id = " + id;
		Beers b = null;
		try (Statement statement = getConnection().createStatement(); ResultSet rs = statement.executeQuery(sql);) {
			boolean BeersExists = rs.next();
			if (BeersExists)
				;
			{
				int id2 = rs.getInt(1);
				String name = rs.getString(2);
				String description = rs.getString(3);
				double abv = rs.getFloat(4);
				b = new Beers( name, abv, description);
			}
		} catch (SQLException e) {

			e.printStackTrace();

		}

		return b;
	}

	public int add(Beers b) {
		int rowCount = 0;
		String sql = "Insert Into Beer (Name, Description, Abv)" + "Values(?,?,?)";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setString(1, b.getName());
			ps.setString(2, b.getDescription());
			ps.setDouble(3, b.getAbv());
			
			rowCount = ps.executeUpdate();

		} catch (SQLException se) {
			System.out.println(se);
		}

		return rowCount;
	}
	public String list1(String Beers) {
		String sql = "Select * FROM Beer;";
		return sql;
		
	}
	
	public Bars get1(int id) {

		String sql = "SELECT * FROM Bar " + "where id = " + id;
		Bars b = null;
		try (Statement statement = getConnection().createStatement(); ResultSet rs = statement.executeQuery(sql);) {
			boolean BarsExists = rs.next();
			if (BarsExists)
				;
			{
				int id2 = rs.getInt(1);
				String name = rs.getString(2);
				String Address = rs.getString(3);
				String phoneNumber = rs.getString(4);
				b = new Bars(name, Address, phoneNumber);
			}
		} catch (SQLException e) {

			e.printStackTrace();

		}

		return b;
	}

	public int add(Bars b) {
		int rowCount = 0;
		String sql = "Insert Into Bar (Name, Address, Phone Number)" + "Values(?,?,?,?)";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setString(1, b.getName());
			ps.setString(2, b.getAddress());
			ps.setString(3, b.getPhoneNumber());
			
			rowCount = ps.executeUpdate();

		} catch (SQLException se) {
			System.out.println(se);
		}

		return rowCount;
	}
	public String list(String Bars) {
		String sql = "Select * FROM Bar;";
		return sql;
		
	}

}



 