
public class car {
	
	
	private int id;
	
	public static int NUM_WHEELS = 4;
	public static int objectCount = 0;
	
	
	//empty construct
	
	public car() {
		id = 0;
		objectCount++;
	} 
		
	
	//constructor accepting parameter
	public car(int i) {
		id = i;
		objectCount++;
	}
	// getter method
	
	public int getId() {
		return id;
	}
	
	
	
	
	
	
	
	// setter method
	public void setId(int i)
	{
		id = i;
	}
	
	
	
	// two string method
	
	public String toString() {
		return "Car: id="+id+" objectCount="+objectCount;
	}
	
	
	
	
}

