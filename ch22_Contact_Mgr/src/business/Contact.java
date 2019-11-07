package business;

public class Contact {
	private String Name;
	private String Email;
	private String Phone;
	public Contact() {
		super();
	}
	public Contact(String name, String email, String phone) {
		super();
		Name = name;
		Email = email;
		Phone = phone;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	@Override
	public String toString() {
		return "Contact [Name=" + Name + ", Email=" + Email + ", Phone=" + Phone + "]";
	}
	public static Contact get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
