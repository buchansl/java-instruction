package ui;

import java.util.ArrayList;
import java.util.List;

import util.Console;

public class WizardInventoryApp {
	
	private static List<String> items = new ArrayList<>();

	public static void main(String[] args) {
		items.add("woodenStaff");
		items.add("wizard hat");
		items.add("Cloth Shoes");
		
System.out.println("Welcome to the Wizard Inventory App");

String command = "";
while (!command.equalsIgnoreCase("exit")) {
	command = Console.getString(getDisplayMenu());
	switch (command.toLowerCase()){
	case "show":
		// list items
		// each item on it's own line
		//prefix with index # +1
		for (int i =0; i < items.size(); i++){
			System.out.println((i+1)+". "+items.get(i));
			
		}
	break;
	case "grab":
		if (items.size()>3) {
			System.out.println("Youcan't carry andymore drop one cuz");
		}
		else {
			//add item
			String item= Console.getString("Name");
			items.add(item);
		}
		
	break;
	case "edit":
		String item = getItem();
		String updItem = Console.getString("UpdatedName: ");
		int idx =  items.indexOf(item);
		items.set(idx,  updItem);
		System.out.println("Item number:"+(idx+1)+"was updated");
		
	break;
	case "drop":
		item = getItem();
		items.remove(item);
		System.out.println(item+"was dropped.");
	break;
	case "exit":
	break;
	default: System.out.println("invalid command. Try again");
	
	}
	
	
}





System.out.println("bye");
	}
	// prompt user for an item number and return item
	private static String getItem() {
			int itemNbr = Console.getInt("Number: ", 0, items.size()+1);
			String str = items.get(itemNbr-1);
			return str;
		}
		
		
	
public static String getDisplayMenu() {
	String menu = "COMMAND MENU\r\n" + 
			"show - Show all items\r\n" + 
			"grab - Grab an item\r\n" + 
			"edit - Edit an item\r\n" + 
			"drop - Drop an item\r\n" + 
			"exit - Exit program\r\n" + 
			"Command:\r\n";
	return menu;
}
}
