package ui;

public class StringsApp {

	public static void main(String[] args) {
		String str1 = "Murach's Java Programming";

		if (str1.startsWith("murach")) {
			System.out.println("not case sensitive");

		} else if (str1.startsWith("Murach")) {
			System.out.println("case sensitive");

		}
		String name1 = "bob l smith";
		System.out.println("name1 =" + name1);
		System.out.println("length = " + name1.length());
		System.out.println(name1.indexOf("b"));
		System.out.println(name1.indexOf("b", 1));
		// find first space
		int idx1 = name1.indexOf("");
		// find second space
		int idx2 = name1.indexOf("", idx1 + 1);
		System.out.println(idx1);
		System.out.println(idx2);
		String fName = name1.substring(0, idx1);
		String mi = name1.substring(idx1 + 1, idx2);
		String lName = name1.substring(idx2 + 1);
		System.out.println("Fname =" + fName);
		System.out.println("mi =" + mi);
		System.out.println("lname= " + lName);
	}

}
