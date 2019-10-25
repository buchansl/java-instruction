package util;

import java.util.ArrayList;
import java.util.List;

import business.*;

public class PrsConsoleApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the PRS App");
	Console.getString(getDisplayMenu());
		
		User u1 = new User(0, "bsmith", "bsmith1", "Bob", "smith", "000-000-0000", "bsmith@hottie.com", false, false);
		User u2 = new User(0, "jsmith", "jsmith1", "Joe", "smith", "000-000-0000", "jsmith@hottie.com", true, true);
		User u3 = new User(0, "ksmith", "ksmith1", "Kim", "smith", "000-000-0000", "ksmith@hottie.com", true, false);
		User u4 = new User(0, "csmith", "csmith1", "Chris", "smith", "000-000-0000", "csmith@hottie.com", false, false);
		User u5 = new User(0, "asmith", "asmith1", "Aaron", "smith", "000-000-0000", "asmith@hottie.com", false, false);

		List<User> user = new ArrayList<User>();
		user.add(u1);
		user.add(u2);
		user.add(u3);
		user.add(u4);
		user.add(u5);

		String choice = "";
		while (!choice.equalsIgnoreCase("exit")) {
			getDisplayMenu(); 
			choice = Console.getString("\nEnter a Command: "); 
			if (choice.equalsIgnoreCase("list") || choice.equalsIgnoreCase("1")) {
				listUser(user);
			} else if (choice.equalsIgnoreCase("get") || choice.equalsIgnoreCase("2")) {
				getUser(user); 
			} else if (choice.equalsIgnoreCase("add") || choice.equalsIgnoreCase("3")) {
				addUser(user); 
			} else if (choice.equalsIgnoreCase("edit") || choice.equalsIgnoreCase("4")) {
				editUser(user);
			} else if (choice.equalsIgnoreCase("delete") || choice.equalsIgnoreCase("5")) {
				deleteUser(user);

				break;
			} else {
				System.out.println("Invalid entry! See COMMAND MENU.");
			}
		}

		System.out.println("\nBye!");
	}

	public static String getDisplayMenu() {
		String menu = "COMMAND MENU\r\n" + "List - List all users\r\n" + "Get - Get an user\r\n"
				+ "Add - Add an user\r\n" + "Delete - Delete an user\r\n" + "Exit - Exit program\r\n" + "Command:\r\n";
		return menu;

	}

	private static void listUser(List<User> user) {
		String show = "";
		for (int i = 0; i < user.size(); i++) {
			show += (i + 1) + ". " + user.get(i) + "\n";
		}
		System.out.println(show);
	}

	private static void getUser(List<User> users) {
		String getUser = Console.getString("Enter username: ");
		for (User u : users) {
			if (u.getUserName().equalsIgnoreCase(getUser)) {
				System.out.println(u);
			}
		}
		System.out.println();
	}

	private static void addUser(List<User> users) {
		int id = (users.size()) + 1;
		String userName = Console.getString("Enter username: ");
		String password = Console.getString("Enter Password: ");
		String Fname = Console.getString("Enter First name: ");
		String lastName = Console.getString("Enter Last name: ");
		String pNumber = Console.getString("Enter phonenumber");
		String Email = Console.getString("Enter Email:");
		boolean isReviewer = false;
		boolean isAdmin = false;

		User newUser = new User(id, userName, password, Fname, lastName, pNumber, Email, isReviewer, isAdmin);
		users.add(newUser);
	}

	private static void editUser(List<User> users) {
		int number = Console.getInt("User to be edited enter id: ", 0, (users.size() + 1));
		String email = "";
		for (User u : users) {
			if (u.getId() == number) {
				email = Console.getString("New email: ");
				u.setEmail(email);
			}
		}
		System.out.println("User: " + users + " edited.");

	}

	private static void deleteUser(List<User> users) {
		int number = Console.getInt("User number you would like to delete (#): ", 0, (users.size() + 1));
		for (int i = 0; i < users.size(); i++) {
			if (i == (number - 1)) {
				users.remove(i);
			}
		}
		System.out.println("User number " + number + " was deleted!");
	}

}
