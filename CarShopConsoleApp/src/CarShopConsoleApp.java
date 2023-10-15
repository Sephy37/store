
public class CarShopConsoleApp {

	public static void main(String[] args) {
		Car c = new Car("Nissan","Micra",43000);
		Car c1 = new Car("Toyota","Corolla",43000);
		
		System.out.println(c.toString());
		System.out.println(c1.toString());
		
		Store s = new Store();
		s.getShoppingList().add(c);
		s.getShoppingList().add(c1);
		
		double total = s.checkOut();
		
		System.out.println("Total" + total);

	}

}
