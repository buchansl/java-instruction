package business;

public class Beers {
	
	
	String name;
	double abv;
	String description;
	public Beers() {
		super();
	}
	public Beers(String name, double abv, String description) {
		super();
		this.name = name;
		this.abv = abv;
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAbv() {
		return abv;
	}
	public void setAbv(double abv) {
		this.abv = abv;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Beers [name=" + name + ", abv=" + abv + ", description=" + description + "]";
	}

}
