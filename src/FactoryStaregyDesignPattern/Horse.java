package FactoryStaregyDesignPattern;

public class Horse implements Ianimal{
	String sound;
	
	Horse(){
		this.sound="I am horse";
	}
	
	@Override
	public String makeSound(){
		return this.sound;
	}
}
