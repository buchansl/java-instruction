package ui;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class fileIOApp {

	public static void main(String[] args) throws IOException {
		// 463 create directory
		String dirString = "c:/temp/sub1/sub2";
		Path dirPath = Paths.get(dirString);
		if (Files.notExists(dirPath)) {
			Files.createDirectories(dirPath);
		}
		else {
			System.out.println("directory already exists");
		}
		// pg 463 create file
		
		String fileString = "temp.txt";
		Path filePath = Paths.get(dirString, fileString);
		if (Files.notExists(filePath)) {
			Files.createFile(filePath);
			
		}
		else {
			System.out.println("File already exists, Dummy!");
		}
		System.out.println(filePath.getNameCount());
		System.out.println(filePath.toString());
		System.out.println(filePath.toAbsolutePath());
		System.out.println(Files.isWritable(filePath));
		System.out.println(Files.isHidden(filePath));
		System.out.println(filePath.getRoot());
		for (int i = 0; i < filePath.getNameCount();i++) {
		System.out.println(filePath.getName(i));

		}
		
		// display files in a directory 463
		
		System.out.println("Directory: "+dirPath.toAbsolutePath());
		System.out.println("files: ");
		DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);
		for ( Path p: dirStream) {
			if (Files.isRegularFile(p)) {
				System.out.println("\t"+p.getFileName());
				
			}
			
		}
	}

}
