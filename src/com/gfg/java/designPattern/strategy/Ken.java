package com.gfg.java.designPattern.strategy;

public class Ken extends Fighter {
	public Ken(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
		super(kickBehavior, jumpBehavior);
	}
	
	public void display() {
		System.out.println("Ken");
	}
}
