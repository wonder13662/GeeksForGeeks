package com.gfg.java.designPattern.strategy;

public class StreetFighter {
	// https://www.geeksforgeeks.org/strategy-pattern-set-1/
	// https://www.geeksforgeeks.org/strategy-pattern-set-2/
	public static void main(String[] args) {
		// Let us make some behavior first
		JumpBehavior shortJump = new ShortJump();
		JumpBehavior longJump = new LongJump();
		KickBehavior tornadoKick = new TornadoKick();
		
		// Make a fighter with desired behavior
		Fighter ken = new Ken(tornadoKick, shortJump);
		ken.display();
		
		// Test behavior
		ken.punch();
		ken.kick();
		ken.jump();
		
		// Change behavior dynamically (algorithms are interchangeable)
		ken.setJumpBehavior(longJump);
		ken.jump();
	}
}
