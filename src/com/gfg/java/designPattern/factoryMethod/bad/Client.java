package com.gfg.java.designPattern.factoryMethod.bad;

public class Client {

	private Vehicle vehicle;
	
	public Client(int type) {
		// Client explicitly creates classes according to type
		if(type == 1) {
			vehicle = new TwoWheeler();
		} else if(type == 2) {
			vehicle = new FourWheeler();
		} else {
			vehicle = null;
		}
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public static void main(String[] args) {
		Client client = new Client(1);
		Vehicle vehicle = client.getVehicle();
		vehicle.printVehicle();
	}

}
