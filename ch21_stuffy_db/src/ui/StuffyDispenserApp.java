package ui;

import business.Stuffy;
import db.StuffyDB;
import util.Console;

public class StuffyDispenserApp {

	private static StuffyDB sdb = new StuffyDB();

	public static void main(String[] args) {
		System.out.println("Welcome to Stuffy Dispenser App");

		System.out.println(getMenu());

		int command = 0;
		while (command != 6) {
			;

			command = Console.getInt("", 0, 7);
			switch (command) {
			case 1:
				// list
				Stuffy s = Console.getString(s);
				
				break;
			case 2:
				// get
				int id = Console.getInt("id: ");
				 s = getStuffy(id);

				break;

			case 3:
				// add- prompt user for stuffy values
				String type = Console.getString("Type: ");
				String color = Console.getString("Color: ");
				String size = Console.getString("Size: ");
				int limbs = Console.getInt("Limbs: ");
				s = new Stuffy(type, color, size, limbs);
				int rowCount = sdb.add(s);
				System.out.println(rowCount + " rows affected.");

				break;
			case 4:
				// edit
				
				
				break;
			case 5:
				// delete
				break;
			case 6:
				// exit
				break;
			default:
				break;
			}
		}

		System.out.println("bye");

	}

	private static String getMenu() {
		String menu = "Command:\n" + "1 - List\n" + "2 - get\n" + "3 - add\n" + "4 - edit\n" + "5 - delete\n"
				+ "6 - exit\n" + "Command: ";

		return menu;

	}

	private static Stuffy getStuffy(int id) {

		Stuffy s = sdb.get(id);
		if (s != null) {
			System.out.println("Stuffy: ");
			System.out.println(s);

		} else {
			System.out.println("No stuffy exists for id:" + id);
		}
		return s;
	}

}