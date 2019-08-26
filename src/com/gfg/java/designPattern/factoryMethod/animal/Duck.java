package com.gfg.java.designPattern.factoryMethod.animal;

public class Duck implements Animal {
	@Override
	public String getAnimal() {
		return "Duck";
	}
	
	@Override
	public String makeSound() {
		return "Squeks";
	}
}
