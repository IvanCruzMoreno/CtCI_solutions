package Chapter3;


import Commons.Cat;
import Commons.Dog;

public class Q3_6_AnimalShelter_Test {

	public static void main(String[] args) {
		
		Q3_6_AnimalShelter animalShelter = new Q3_6_AnimalShelter();
		animalShelter.enqueue(new Dog("Bruno"));
		animalShelter.enqueue(new Cat("PrettyFlacko"));
		animalShelter.enqueue(new Dog("Toby"));
		animalShelter.enqueue(new Dog("Luna"));
		animalShelter.enqueue(new Cat("BenC"));
		animalShelter.enqueue(new Dog("Mars"));
		
		System.out.println("Start");
		animalShelter.showShelter();
		
		animalShelter.dequeueAny().getName();
		animalShelter.dequeueAny().getName();
		
		System.out.println("\n\nMiddle");
		animalShelter.showShelter();
		
		animalShelter.dequeueCat().getName();
		animalShelter.dequeueDog().getName();
		
		System.out.println("\n\nFinal");
		animalShelter.showShelter();
		
	}
}
