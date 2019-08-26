package com.gfg.java.designPattern.factoryMethod.good;

import com.gfg.java.designPattern.factoryMethod.good.Vehicle.VehicleType;

public class Client {

	private Vehicle vehicle;
	
	public Client() {
	    // Client doesn't explicitly create objects 
	    // but passes type to factory method "Create()"
		vehicle = Vehicle.create(VehicleType.VT_TwoWheeler);
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public static void main(String[] args) {
		Client client = new Client();
		Vehicle vehicle = client.getVehicle();
		vehicle.printVehicle();
	}

}
