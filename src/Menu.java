import java.util.Scanner;

public class Menu {

	private Scanner scanner;
	private MenuLogic menuLogic;
	
	
	public Menu() { 
		scanner = new Scanner(System.in);
		menuLogic = new MenuLogic();
	}
	
	public void start() {
		printWelcome();
		do { 
			printMenu();		
		} while (true);
	}
	
	public void printWelcome() {
		System.out.println("Welcome in the contact book.");
		
	}
	
	public void printMenu() {
		System.out.println("Type the number: \n 1 - To add a new contact. \n 2 - To receive a number. \n 3 - To print all numbers.");
		parseAnswer(scanner.nextLine());
	}
	
	public void parseAnswer(String answer) {
		
		switch(answer) {
			case "1": addPerson();
				break;
			case "2" : getNumber();
				break;
			case "3" : menuLogic.printAllPersons();	
				break;
			default: System.out.println("There is no such comment.");	
		}
	}
		
		private void addPerson() { 
			Person person = new Person();
			
			System.out.println("Give a name: ");
			person.setName(scanner.nextLine());
			
			System.out.println("Give second name.");
			person.setLastName(scanner.nextLine());
			
			System.out.println("Give a number.");
			person.setNumber(scanner.nextLine());
			
			menuLogic.addPerson(person);	
		}
		
		private void getNumber() { 
			System.out.println("Give last name.");
			String lastName = scanner.nextLine();
			menuLogic.printPerson(lastName);
		}
	
	
}
