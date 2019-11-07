package ui;

import java.util.*;


import business.Bars;
import business.Beers;

import db.BarDB;
import db.BeerDB;
import db.beerTapDb;
import util.Console;
public class BarTapApp {

	private static BarDB barDB= new BarDB();
	private static BeerDB beerDB = new BeerDB();
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Bar Tap App");
		
		int choice = 0;
	
		while (choice !=99) {
			choice = Console.getInt(getMenu(), 0, 100);
			switch (choice) {
			
			case 1:
			
				//list beers
				List<Beers>
				beers = BeerDB.list();
				for (Beers b: beers) {
					System.out.println(b);
				}
				break;
			case 2:
				//list bars
				List<Bars>
				bar = barDB.list();
				for (Bars b: bar) {
					System.out.println(b);
				}
				break;
			case 3 :
				//add bar
				System.out.println("Add Bar:");
				String n = Console.getString("Name:");
				String a = Console.getString("Address: ");
				String pn = Console.getString("Phone Number: ");
				
				Bars b = new Bars(n, a, pn);
				int rc = barDB.addBars(b);
				if (rc==1) {
					System.out.println("Bar Added successfully");
					
				}else {
					System.out.println("Error  adding bar...check logs");
				}
				break;
			case 4 :
				//add beer
				System.out.println("Add Beer:");
				String name = Console.getString("Name?:");
				String d = Console.getString("Description: ");
				double abv = Console.getDouble("ABv: ");
				
				Beers beer = new Beers(name, abv, d);
				int rc2 = beerDB.addBeers(beer);
				if (rc2==1) {
					System.out.println("Movie Added successfully");
					
				}else {
					System.out.println("Error  adding movie...check logs");
				}
				break;
			case 5:
				// get bar
				b = getBar();
				if (b!=null) {
					rc = barDB.delete(b);
					if (rc==1) {
						System.out.println("Bar deleted successfully!");
					}
					else {
						System.out.println("Error deleting bar year.");
					}
				}
				else {
					System.out.println("Error...  bar id doesn't exist.");
				}
				break;
			case 6:
				// delete beer
				beer = getBeers();
				if (beer!=null) {
					rc = beerDB.delete(beer);
					if (rc==1) {
						System.out.println("Beer deleted successfully!");
					}
					else {
						System.out.println("Error deleting beer year.");
					}
				}
				else {
					System.out.println("Error...  beer id doesn't exist.");
				}
				break;
		
			case 7:
				// get movie
				b = getBar();
				if (b!=null) {
					System.out.println("Bar:");
					System.out.println(b);
				}
				else {
					System.out.println("Error...  Bar id doesn't exist.");
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


private static Beers getBeers() {
	int id  = Console.getInt("Id?", 0, Integer.MAX_VALUE);
	Beers b = beerDB.get(id);
	return b;
	
	}


private static Bars getBar() {
	int id  = Console.getInt("Id?", 0, Integer.MAX_VALUE);
	Bars b = barDB.get1(id);
	return b;
		
	}


private static String getMenu() {
	String menu = "Command:\n" + "1 - List Beers\n" + "2 - List Bars\n" + "3 - add Bar\n" + "4 - add Beer by abv\n" +
			 "5 - Delete Bar\n" + "6 - Delete Beer\n"+"7 - Get bar \n"+ "99 - exit "+"Command: ";
	return menu;
	}

}
