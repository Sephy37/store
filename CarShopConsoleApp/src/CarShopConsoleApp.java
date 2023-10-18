import java.util.InputMismatchException;
import java.util.Scanner;

public class CarShopConsoleApp {
	private static int choice;
	public Store s = new Store();
	public Car c;
	private static final Scanner scanner = new Scanner (System.in);
	public static void main(String[] args) {
		
		
		new CarShopConsoleApp().startingPoint();
	}
	
	private void startingPoint() {
		int action = getChoice(choice);
		while(action != 0) {
			action = getChoice(choice);
		}
	}
	
	private int getChoice(int choice) {
		System.out.println("Pick a choice");
		choice = checkInput();
		processChoice(choice);
		return choice;
	}
	
	private int processChoice(int choice) {
		switch(choice) {
		case 1: addNewCar();
			break;
			
		case 2: printInventory(s,c);
			break;
			
		case 3:
			break;
			
		case 0: exitProgram();
			break;
			
		default:
			checkForOutOfBoundsChoice(choice);
		}
		return choice;
	}
	
	private int checkForOutOfBoundsChoice(int choice) {
		if(choice < 0 || choice > 3) {
			System.err.println("CHOICE IS OUT OF BOUNDS!");
			return choice;
		}
		return choice;
	}
	
	private void addNewCar() {
		String make = "";
		String model = "";
		double price = 0;
		boolean isExit = true;
		while(isExit) {
			isExit = hasCarAddingEnded(make);
			make = addMake(make);
			if(!hasCarAddingEnded(make)) {
				break;
			}
			model = addModel(model);
			price = addPrice(price);
			Car c = new Car(make,model,price);
			s.getCarList().add(c);
			
			
		}
		
		System.out.println("Cars: " + s.getCarList());
	}
	
	private String addMake(String userInput) {
		System.out.println("Enter make of car: ");
		userInput = scanner.nextLine();
		return userInput;
	}
	
	private String addModel(String userInput) {
		System.out.println("Enter model of car: ");
		userInput = scanner.nextLine();
		return userInput;
	}
	
	private double addPrice(double userInput) {
		System.out.println("Enter price of car: ");
		//userInput = scanner.nextDouble();
		userInput = checkInput();
		scanner.nextLine();
		return userInput;
	}
	
	private boolean hasCarAddingEnded(String userInput) {
		return !userInput.equalsIgnoreCase("end");
	}
	
	private void exitProgram() {
		System.out.println("Exiting...........");
	}
	
	private Car printInventory(Store s,Car c) {
		for(Car f : s.getCarList()) {
			System.out.println(f.toString());
		}
		return c;
	}
	
	private int checkInput() {
    	boolean isValid = true;
        while(isValid) {
            try {
                int input = scanner.nextInt();
                scanner.nextLine(); 
                return input;
            } catch(InputMismatchException e) {
                scanner.nextLine(); 
                System.err.println("INVALID INPUT!");
            }
        }
        return scanner.nextInt();
    }

}
