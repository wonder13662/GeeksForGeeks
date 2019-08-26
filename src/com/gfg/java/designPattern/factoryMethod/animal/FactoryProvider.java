package com.gfg.java.designPattern.factoryMethod.animal;

public class FactoryProvider {
	
	public static AbstractFactory getFactory(String choice) {
		
		if("Animal".equalsIgnoreCase(choice)) {
			return new AnimalFactory();
		} else if("Color".equalsIgnoreCase(choice)) {
			
		}
		
		return null;
		
	}

}
