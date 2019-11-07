package ui;

import java.io.*;
import java.nio.file.*;

import business.Product;

public class ProductFileDemoApp {

	public static void main(String[] args) throws IOException {
		//establish a file path
		Path productsPath = Paths.get("prooducts.txt");
		if (Files.notExists(productsPath)) {
			Files.createFile(productsPath);
		}
		File productsFile = productsPath.toFile();
		PrintWriter out = new PrintWriter(
						new BufferedWriter(
						new FileWriter(productsFile)));
		
		
		
		out.println("java\tMurachs Java Programming\t57.50");
		out.println("mysql\tMurachs mysql\t55.50");
		out.println("andr\tMurachs Android Programming\t59.50");

		
		
		out.close();
		
		
		// read data from an input file
		BufferedReader in = new BufferedReader(
				new FileReader(
				productsFile));
		// read date from the stream and print to console
			String line= in.readLine();
			while (line !=null) {
				String[] fields = line.split("\t");
				String code = fields[0];
				String desc = fields[1];
				String price = fields[2];
				double priceDbl = Double.parseDouble(price);
				Product p = new Product(code,desc,priceDbl);
				//System.out.println(line);
				line = in.readLine();
				System.out.println(p);
				
			}
			in.close();
	}
		
}
