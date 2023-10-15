
public class Car {
	
	private String make;
	private String model;
	private double price;
	
	
	public Car() {
		make = "nothing";
		model = "nothing";
		price = 0.00;
	}
	
	public Car(String make,String model,double price) {
		this.make = make;
		this.model = model;
		this.price = price;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getMake() {
		return this.make;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String toString() {
		return "Make:" + getMake() + "Model: " + getModel() + "Price: " + getPrice();
	}

}
