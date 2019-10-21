package ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import business.Product;
import util.Console;

public class ProductApp {

	public static void main(String[] args) {
		System.out.println("hello");
		Product p1 = new Product("java", "murachs java", 59.50);
		Product p2 = new Product("jsp", "murachs java Servelets and Jsp", 55.00);
		Product p3 = new Product("mysql", "murachsMysql", 54.25);
		Product p4 = new Product("c#", "Murachs c#", 58);
		Product p5 = new Product("andr", "murachs android", 61.50);

		List<Product> products = new ArrayList<>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		String code = Console.getString("Enter code");

		Product pdt = null;
//for (Product p: products) {
//	if (p.getCode().equalsIgnoreCase(code)) {
//		pdt = p;
//	}
//}
		for (int i = 0; i < products.size(); i++) {
			Product p = products.get(i);
			if (p.getCode().equalsIgnoreCase(code)) {
				pdt = p;
			}
		}
		System.out.println("Your Product is: " + pdt);
		System.out.println("Get product from map");
		Map<String, Product> productsMap = new HashMap<>();
		productsMap.put("java", p1);
		productsMap.put("jsp", p2);
		productsMap.put("mysql", p3);
		productsMap.put("c#", p4);
		productsMap.put("andr", p5);
		System.out.println("Product selected" + productsMap.get(code));

		System.out.println("bye");
	}

}
