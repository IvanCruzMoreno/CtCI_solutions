package Chapter3;

import java.util.ArrayDeque;
import java.util.Queue;

import Commons.Animal;
import Commons.Cat;
import Commons.Dog;

public class Q3_6_AnimalShelter {

	/*
	 * [ ]
	 * [ ]
	 * [ ]
	 * [ ]
	 * [ ]
	 * Dogs
	 * 
	 * [ ]
	 * [ ]
	 * [ ]
	 * [ ]
	 * [ ]
	 * Cats
	 * 
	 * 
	 * */
	
	private int index = 0;
	private Queue<Dog> dogs;
	private Queue<Cat> cats;
	
	public Q3_6_AnimalShelter() {
		dogs = new ArrayDeque<>();
		cats = new ArrayDeque<>();
	}
	
	public void enqueue(Animal animal) {
		
		animal.setIndex(index);
		
		if(animal instanceof Dog) {
			dogs.add((Dog) animal);
		}else if(animal instanceof Cat) {
			cats.add((Cat) animal);
		}
		index++;
	}
	
	public Animal dequeueAny() {
		
		if(dogs.isEmpty()) {
			return cats.remove();
		}
		
		if(cats.isEmpty()) {
			return dogs.remove();
		}
		
		Dog dog = dogs.peek();
		Cat cat = cats.peek();
		
		if(dog.getIndex() < cat.getIndex()) {
			return dogs.remove();
		}
		return cats.remove();
	}
	
	public Dog dequeueDog() {
		return dogs.isEmpty()? null: dogs.remove();
	}
	
	public Cat dequeueCat() {
		return cats.isEmpty()? null: cats.remove();
	}
	
	public void showShelter() {
		System.out.println("-- Cats --");
		for (Cat cat : cats) {
            System.out.print(cat + " ");
        }
		System.out.println("\n-- Dogs --");
        for (Dog dog : dogs) {
            System.out.print(dog + " ");
        }
	}
	
}
