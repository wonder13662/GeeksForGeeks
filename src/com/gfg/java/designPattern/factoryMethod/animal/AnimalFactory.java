package com.gfg.java.designPattern.factoryMethod.animal;

public class AnimalFactory implements AbstractFactory<Animal> {
	
	@Override
	public Animal create(String animalType) {
		if("Dog".equalsIgnoreCase(animalType)) {
			return new Dog();
		} else if("Duck".equalsIgnoreCase(animalType)) {
			return new Duck();
		}
		
		return null;
	}

	public AnimalFactory() {
		// TODO Auto-generated constructor stub
	}

}
