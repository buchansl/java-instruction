package business;

public class Product {
	private double id;
	private String vendorid;
	private double partNumber;
	private String name;
	private double price;
	private double unit;

	public Product() {
		super();
	}

	public Product(double id, String vendorid, double partNumber, String name, double price, double unit) {
		super();
		this.id = id;
		this.vendorid = vendorid;
		this.partNumber = partNumber;
		this.name = name;
		this.price = price;
		this.unit = unit;
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getVendorid() {
		return vendorid;
	}

	public void setVendorid(String vendorid) {
		this.vendorid = vendorid;
	}

	public double getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(double partNumber) {
		this.partNumber = partNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getUnit() {
		return unit;
	}

	public void setUnit(double unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", vendorid=" + vendorid + ", partNumber=" + partNumber + ", name=" + name
				+ ", price=" + price + ", unit=" + unit + ", toString()=" + super.toString() + "]";
	}

}
