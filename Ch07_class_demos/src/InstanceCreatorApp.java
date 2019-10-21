
public class InstanceCreatorApp {

	public static void main(String[] args) {
		car car1 = new car();
		car1.setId(10);
		car car2 = new car();
		car1.setId(20);

		System.out.println(car1.toString());

		System.out.println(car2.toString());
		System.out.println(car.objectCount);
		System.out.println("NUM WHEELS=" + car.NUM_WHEELS);
		Product p1 = new Product();
		p1.setCode("java");
		p1.setDescription("murach's Java");
		p1.setPrice(57.50);

		System.out.println(p1.toString());
increasePrice(p1);
System.out.println(p1.toString());
		truck t1 = new truck();
		t1.setId(11);
		System.out.println(t1);
	}
private static void increasePrice(Product p) {
	double price = p.getPrice()*1.1;
	p.setPrice(price);
}
}
