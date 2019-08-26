package com.gfg.java.designPattern.factoryMethod.animal;

public class Client {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		AbstractFactory<Animal> animalFactory = FactoryProvider.getFactory("Animal");
		Animal dog = animalFactory.create("Dog");
		System.out.println(dog.getAnimal());
		System.out.println(dog.makeSound());
	}

}
