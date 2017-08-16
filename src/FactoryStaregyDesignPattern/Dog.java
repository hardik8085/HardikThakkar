package FactoryStaregyDesignPattern;

public class Dog implements Ianimal{
	String sound;

	Dog(){
		this.sound="I am dog";
	}

	@Override
	public String makeSound() {
		return this.sound;
	}
}
