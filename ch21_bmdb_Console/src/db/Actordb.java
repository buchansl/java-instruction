package db;

import java.sql.*;
import java.time.LocalDate;
import java.util.*;

import business.Actor;

public class Actordb extends Bmdb_db {
	public List<Actor> list() {

		List<Actor> ActorList = new ArrayList<>();
		String sql = "Select * from Actor";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				// getActorfrom result set
				Actor m = getActorFromResultSet(rs);
				ActorList.add(m);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return ActorList;

	}

	private Actor getActorFromResultSet(ResultSet rs) throws SQLException {
		int id = rs.getInt(1);
		String firstName = rs.getNString(2);
		String lastName = rs.getString(3);
		String gender = rs.getString(4);
		LocalDate birthDate = rs.getDate(5).toLocalDate();
		Actor a = new Actor(id, firstName, lastName, gender, birthDate);
		return a;
	}

}
