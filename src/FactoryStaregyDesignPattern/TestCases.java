package FactoryStaregyDesignPattern;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestCases {

	
	AnimalFactory animalFactory = new AnimalFactory();
	
	
	
	@Test
	public void testHorst(){
		Ianimal horse = animalFactory.createAnimal("horse");
		assertEquals(horse.makeSound(),"I am horse");
	}
	
	@Test
	public void testDog(){
		Ianimal dog = animalFactory.createAnimal("dog");
		assertEquals(dog.makeSound(),"I am dog");
	}
	
	@Test
	public void testOther(){
		Ianimal other = animalFactory.createAnimal("Other");
		Assert.assertNull(other);
	}
}
