package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import business.Beers;

public class BeerDB extends beerTapDb {
	
	
		public static List<Beers> list() {

			List<Beers> BeersList = new ArrayList<>();
			String sql = "Select * from Beer";
			try (PreparedStatement ps = getConnection().prepareStatement(sql);) {
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					// get Beers from result set
					Beers b = getBeersFromResultSet(rs);
					BeersList.add(b);
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

			return BeersList;

		}
		public Beers get(int id) {
			Beers Beers = null;
			String sql = "SELECT * from Beer "+
						 "WHERE id = ?";
			try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					Beers = getBeersFromResultSet(rs);
				}			
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return Beers;
		}

		
		

		public int addBeers(Beers m) {
			int rowCount = 0;
			String sql ="insert into Beer (name, abv, description) Values "+
			"(?,?,?)";
					
			try (PreparedStatement ps = getConnection().prepareStatement(sql)){
				ps.setString(1,  m.getName());
				ps.setDouble(2,  m.getAbv());
				ps.setString(3,  m.getDescription());
				
				rowCount = ps.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	return rowCount;
	}
		public int updateBeers(Beers m) {
			int rowCount = 0;
			String sql ="Update Beer set name = ? ";
					
			try (PreparedStatement ps = getConnection().prepareStatement(sql)){
				ps.setString(1,  m.getName());
				ps.setDouble(2,  m.getAbv());
				
		}catch (SQLException e) {
			e.printStackTrace();
		}
	return rowCount;
		}
		public int delete(Beers m) {
			int rowCount = 0;
			String sql = "delete from Beer where id = ?";
			try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
				ps.setString(1, m.getName());
				rowCount = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return rowCount;
		}
	
protected static  Beers getBeersFromResultSet(ResultSet rs) throws SQLException {
	String name = rs.getString(1);
	double abv  = rs.getDouble(2);
	String description  = rs.getString(3);
	
	Beers b = new Beers(name, abv, description);
	return b;

}
}
