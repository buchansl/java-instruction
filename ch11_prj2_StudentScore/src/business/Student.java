package business;

public class Student implements Comparable<Student> {

	private String firstName;
	private String lastName;
	private int score;
	
	

	public Student() {
		super();
	}

	public Student(String firstName, String lastName, int score) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.score = score;
	}


	public String getFirstNAme() {
		return firstName;
	}

	public void setFirstNAme(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}


	@Override
	public String toString() {
		return lastName + "," + firstName +":" + score;
	}
	@Override
	public int compareTo(Student s1) {
		
		int comp = 0; // TODO Auto-generated method stub
		comp = this.lastName.compareTo( s1.lastName);
		if (comp==0)
			comp = this.firstName.compareTo(s1.getFirstNAme());
		return comp;
	}

}
