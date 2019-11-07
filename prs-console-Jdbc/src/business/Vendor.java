package business;

public class Vendor {

	private double id;
	private double code;
	private String vName;
	private double address;
	private String city;
	private String state;
	private double zip;
	private double pNumber;
	private String email;

	public Vendor() {
		super();
	}

	public Vendor(double id, double code, String vName, double address, String city, String state, double zip,
			double pNumber, String email) {
		super();
		this.id = id;
		this.code = code;
		this.vName = vName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.pNumber = pNumber;
		this.email = email;
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public double getCode() {
		return code;
	}

	public void setCode(double code) {
		this.code = code;
	}

	public String getvName() {
		return vName;
	}

	public void setvName(String vName) {
		this.vName = vName;
	}

	public double getAddress() {
		return address;
	}

	public void setAddress(double address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public double getZip() {
		return zip;
	}

	public void setZip(double zip) {
		this.zip = zip;
	}

	public double getpNumber() {
		return pNumber;
	}

	public void setpNumber(double pNumber) {
		this.pNumber = pNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Vendors [id=" + id + ", code=" + code + ", vName=" + vName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", pNumber=" + pNumber + ", email=" + email + "]";
	}

}
