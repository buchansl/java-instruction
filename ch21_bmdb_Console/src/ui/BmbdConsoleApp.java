package ui;

import java.util.*;

import business.Actor;
import business.Movie;
import db.Actordb;
import db.MovieDB;
import util.Console;

public class BmbdConsoleApp {
private static MovieDB movieDB = new MovieDB();
private static Actordb actorDB= new Actordb();
	public static void main(String[] args) {
System.out.println("Welcomt to the BmBd Console App \n");
		int choice = 0;
		
		while (choice !=99) {
			choice = Console.getInt(getMenu(), 0, 100);
			switch (choice){
			case 1:
				//list movies
				List<Movie>
				movies = movieDB.list();
				for (Movie m: movies) {
					System.out.println(m);
				}
				break;
			case 2:
				//list actor
				List<Actor>
				actor = actorDB.list();
				for (Actor a: actor) {
					System.out.println(a);
				}
				break;
			case 3 :
				//add movie
				System.out.println("Add Movie:");
				String t = Console.getString("Title?:");
				int y = Console.getInt("year?: ");
				String r = Console.getString("Rating?: ");
				String d = Console.getString("Director?: ");
				Movie m = new Movie(t,y,r,d);
				int rc = movieDB.addMovie(m);
				if (rc==1) {
					System.out.println("Movie Added successfully");
					
				}else {
					System.out.println("Error  adding movie...check logs");
				}
				break;
			case 4:
				// update movie
				m = getMovie();
				if (m!=null) {
					int year = Console.getInt("New year?  ");
					m.setYear(year);
					rc = movieDB.updateMovie(m);
					if (rc==1) {
						System.out.println("Movie updated successfully!");
					}
					else {
						System.out.println("Error updating movie year.");
					}
				}
				else {
					System.out.println("Error...  movie id doesn't exist.");
				}
				break;
			case 5:
				// delete movie
				m = getMovie();
				if (m!=null) {
					rc = movieDB.delete(m);
					if (rc==1) {
						System.out.println("Movie deleted successfully!");
					}
					else {
						System.out.println("Error deleting movie year.");
					}
				}
				else {
					System.out.println("Error...  movie id doesn't exist.");
				}
				break;
			case 6:
				// get movie
				m = getMovie();
				if (m!=null) {
					System.out.println("Movie:");
					System.out.println(m);
				}
				else {
					System.out.println("Error...  movie id doesn't exist.");
				}
				break;
			case 99:
				// exit
				break;
			default:
				System.out.println("Invalid command.");
				break;

			}
		}
		System.out.println("bye");
				}
		







	
	









	private static Movie getMovie() {
		int id  = Console.getInt("Id?", 0, Integer.MAX_VALUE);
		Movie m = movieDB.get(id);
		return m;
	}



















	private static String getMenu() {
		String menu = "Command:\n" + "1 - List Movie\n" + "2 - List Actors\n" + "3 - Add Movie\n" + "4 - Update Movie\n" + "5 - delete movie\n"
				+ "6 - Get Movie\n" +"9 - exit "+"Command: ";

		return menu;
}
}
