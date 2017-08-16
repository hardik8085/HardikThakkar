package FactoryStaregyDesignPattern;

import java.util.Scanner;
/**
 * Main class of the machine
 * @author hardi
 *
 */
public class SoundMachine {

	public static void main(String[] args) {
		 
		
		AnimalFactory animalFactory = new AnimalFactory();
		System.out.println("Enter Horse or dog to get some sound");
		System.out.println("Enter name of animal");
		Scanner scanner = new Scanner(System.in);
		String animal = scanner.nextLine();
		animal = animal.toLowerCase().trim();
		Ianimal selectedAnimal = animalFactory.createAnimal(animal);
		if( null == selectedAnimal){
			System.out.println("Please select proper option");
		}else{
			System.out.println(selectedAnimal.makeSound());
		}
		
	}
}
