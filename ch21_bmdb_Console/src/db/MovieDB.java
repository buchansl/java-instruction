package db;

import java.sql.*;
import java.util.*;

import business.Movie;

public class MovieDB extends Bmdb_db {
	public List<Movie> list() {

		List<Movie> movieList = new ArrayList<>();
		String sql = "Select * from movie";
		try (PreparedStatement ps = getConnection().prepareStatement(sql);) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				// get movie from result set
				Movie m = getMovieFromResultSet(rs);
				movieList.add(m);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return movieList;

	}
	public Movie get(int id) {
		Movie movie = null;
		String sql = "SELECT * from movie "+
					 "WHERE id = ?";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				movie = getMovieFromResultSet(rs);
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return movie;
	}

	
	

	public int addMovie(Movie m) {
		int rowCount = 0;
		String sql ="insert into Movie (title,year,rating,director) Values "+
		"(?,?,?,?)";
				
		try (PreparedStatement ps = getConnection().prepareStatement(sql)){
			ps.setString(1,  m.getTitle());
			ps.setInt(2,  m.getYear());
			ps.setString(3,  m.getRating());
			ps.setString(4,  m.getDirector());
			rowCount = ps.executeUpdate();
	}catch (SQLException e) {
		e.printStackTrace();
	}
return rowCount;
}
	public int updateMovie(Movie m) {
		int rowCount = 0;
		String sql ="Update Movie set year = ? ";
				
		try (PreparedStatement ps = getConnection().prepareStatement(sql)){
			ps.setInt(1,  m.getYear());
			ps.setString(2,  m.getTitle());
			
	}catch (SQLException e) {
		e.printStackTrace();
	}
return rowCount;
	}
	public int delete(Movie m) {
		int rowCount = 0;
		String sql = "delete from Movie where id = ?";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setInt(1, m.getId());
			rowCount = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowCount;
	}
private Movie getMovieFromResultSet(ResultSet rs) throws SQLException {
	int id = rs.getInt(1);
	String titel = rs.getNString(2);
	String rating = rs.getString(3);
	int year = rs.getInt(4);
	String director = rs.getNString(5);
	Movie m = new Movie(id, titel, year,rating,director);
	return m;
}
}
