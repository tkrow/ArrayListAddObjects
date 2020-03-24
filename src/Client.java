import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		// Add a new element to animals:
		animals.add(new Animal());
		
		// objects currently outside of animals:
		Animal a = new Animal();
		Animal b = new Animal();
		
		// now, adding Animal a and Animal b:
		animals.add(a);
		animals.add(b);
		
		// loop through
		for(Animal animal : animals) {
			System.out.println("animal: " + animal);
		}
		
		// Remove 3rd animal
		animals.remove(a);
		
		// loop through
		System.out.println("after animals.remove(a)");
		for(Animal animal : animals) {
			System.out.println("animal: " + animal);
		}
		
		// but Animal 'a' still exists, since we didn't add it dynamically
		System.out.println("a: " + a);
		
		// remove object that was created dynamically
		animals.remove(0);
		// note: this was obviously dynamically assigned
		// loop through
		System.out.println("after animals.remove(0)");
		for(Animal animal : animals) {
			System.out.println("animal: " + animal);
		}
		
		animals.removeAll(animals);
		for(Animal animal : animals) {
			System.out.println("animal: " + animal);
		}
		
	}

}
