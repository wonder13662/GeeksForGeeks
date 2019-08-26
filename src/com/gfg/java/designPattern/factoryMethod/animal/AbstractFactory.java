package com.gfg.java.designPattern.factoryMethod.animal;
// https://www.baeldung.com/java-abstract-factory-pattern
public interface AbstractFactory<T> {
	T create(String animalType);
}
