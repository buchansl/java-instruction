package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import business.Bars;
import business.Beers;

public class BarDB extends beerTapDb {
	public List<Bars> list() {

		List<Bars> BarsList = new ArrayList<>();
		String sql = "Select * from Bar";
		try (PreparedStatement ps = getConnection().prepareStatement(sql);) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				// get Bars from result set
				Bars m = getBarsFromResultSet(rs);
				BarsList.add(m);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return BarsList;

	}
	public Bars get1(int id) {
		Bars Bars = null;
		String sql = "SELECT * from Bar "+
					 "WHERE id = ?";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Bars = getBarsFromResultSet(rs);
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return Bars;
	}

	
	

	public int addBars(Bars m) {
		int rowCount = 0;
		String sql ="insert into Bar (barName,address,phoneNumber) Values "+
		"(?,?,?)";
				
		try (PreparedStatement ps = getConnection().prepareStatement(sql)){
			ps.setString(1,  m.getName());
			ps.setString(2,  m.getAddress());
			ps.setString(3,  m.getPhoneNumber());
			rowCount = ps.executeUpdate();
	}catch (SQLException e) {
		e.printStackTrace();
	}
return rowCount;
}
	public int updateBars(List<Bars> bar) {
		int rowCount = 0;
		String sql ="Update Bar set Name = ? ";
				
		try (PreparedStatement ps = getConnection().prepareStatement(sql)){
			ps.setString(1,  bar.toString());
		
			
	}catch (SQLException e) {
		e.printStackTrace();
	}
return rowCount;
	}
	public int delete(Bars b) {
		int rowCount = 0;
		String sql = "delete from Bar where id = ?";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setString(1, b.getName());
			rowCount = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowCount;
	}
private Bars getBarsFromResultSet(ResultSet rs) throws SQLException {
	String barName = rs.getString(1);
	String  address = rs.getNString(2);
	String phoneNumber = rs.getString(3);
	
	
	Bars b = new Bars(barName, address, phoneNumber);
	return b;
}

}
