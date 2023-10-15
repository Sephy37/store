import java.util.ArrayList;

public class Store {
	
	private ArrayList<Car>car; 
	private ArrayList<Car>shoppingList; 
	
	public Store() {
		car = new ArrayList<Car>();
		shoppingList = new ArrayList<Car>();
	}
	
	public ArrayList<Car>getCar(){
		return this.car;
	}
	
	public ArrayList<Car>getShoppingList(){
		return this.shoppingList;
	}
	
	public double checkOut() {
		double totalCost = 0;
		for(var c : shoppingList) {
			totalCost += c.getPrice();
		}
		shoppingList.clear();
		return totalCost;
	}

}
