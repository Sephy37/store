import java.util.ArrayList;

public class Store {
	
	private ArrayList<Car>carList; 
	private ArrayList<Car>shoppingList; 
	
	public Store() {
		carList = new ArrayList<Car>();
		shoppingList = new ArrayList<Car>();
	}
	
	public ArrayList<Car>getCarList(){
		return this.carList;
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
