package ui;

import java.util.Arrays;

import business.Student;
import util.Console;

public class StudentScoresApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Student Scores App");
		
		int nbrofStudents = Console.getInt("number of Students: ", 0, 501);
		Student[] students = new Student [nbrofStudents];
		for (int i = 0; i < nbrofStudents; i++) {
			System.out.println("\nStudent"+(i+1));
			String ln = Console.getString("Last name:");
			String fn = Console.getString("first name:");
			int s = Console.getInt("score:", -1, 101);
			Student student = new Student(fn,ln,s);
			students[i] = student;
		}
		
		Arrays.parallelSort(students);
		System.out.println("\nSummary");
		for (Student s: students) {
			System.out.println(s);
		}
		
		System.out.println("bye");
	}

}
