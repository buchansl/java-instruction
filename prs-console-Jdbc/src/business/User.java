package business;

public class User {
	private int id;
	private String userName;
	private String password;
	private String fName;
	private String lName;
	private String pNumber;
	private String email;
	private boolean isReviewer;
	private boolean isAdmin;

	public User() {
		super();
	}

	public User(int id, String userName,String password,  String fName, String lName, String pNumber, String email, boolean isReviewer,
			boolean isAdmin) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.fName = fName;
		this.lName = lName;
		this.pNumber = pNumber;
		this.email = email;
		this.isReviewer = isReviewer;
		this.isAdmin = isAdmin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getpNumber() {
		return pNumber;
	}

	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean getIsReviewer() {
		return isReviewer;
	}

	public void setIsReviewer(boolean isReviewer) {
		this.isReviewer = isReviewer;
	}

	public boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", fName=" + fName + ", lName="
				+ lName + ", pNumber=" + pNumber + ", email=" + email + ", isReviewer=" + isReviewer + ", isAdmin="
				+ isAdmin + "]";
	}

}