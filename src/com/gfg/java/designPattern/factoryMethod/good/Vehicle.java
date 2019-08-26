package com.gfg.java.designPattern.factoryMethod.good;

public abstract class Vehicle {
	
	public enum VehicleType {
		VT_TwoWheeler, VT_ThreeWheeler, VT_FourWheeler 
	}

	public abstract void printVehicle();
	
	public static Vehicle create(VehicleType type) {
		Vehicle vehicle;
		if(type == VehicleType.VT_TwoWheeler) {
			vehicle = new TwoWheeler();
		} else if(type == VehicleType.VT_ThreeWheeler) {
			vehicle = new ThreeWheeler();
		} else if(type == VehicleType.VT_FourWheeler) {
			vehicle = new FourWheeler();
		} else {
			vehicle = null;
		}
		
		return vehicle;
	}
}
