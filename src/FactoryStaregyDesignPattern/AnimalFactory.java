package FactoryStaregyDesignPattern;

/**
 * take parameter from user and create animal object accodingly and return it back
 * @author hardi
 *
 */
public class AnimalFactory {

	/**
	 * Create animal object accordingly and return it back 
	 * @param animalName name of the animal
	 * @return object of animal
	 */
	public Ianimal createAnimal(String animalName) {
		Ianimal animalHome = null;
		switch (animalName) {
		case "horse":
			animalHome = new Horse();
			break;
		case "dog":
			animalHome = new Dog();
		default:
			animalHome = null;
		}
		return animalHome;
	}

}
