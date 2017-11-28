import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MenuLogic {

	private List <Person> personList;

	public MenuLogic() {
		personList = new ArrayList<>();
	}
	
	public void addPerson(Person person) {
		personList.add(person);
	}
	
	public void printAllPersons() {
		for (Person person : personList) {
			System.out.println(person);
		}
	}
	
	public void printPerson(String lastName) {
		Collections.sort(personList);
		
		for (Person person: personList) {
			if(person.getLastName().equalsIgnoreCase(lastName)) {
				System.out.println("Number: " + person.getNumber());
				break;
			}
			
		}
	}
	
	
	
	
	
}
