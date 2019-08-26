package com.gfg.java.designPattern.templateMethod;

// https://www.geeksforgeeks.org/template-method-design-pattern/
// Abstract class
public abstract class OrderProcessTemplate {
	
	public boolean isGift;
	public abstract void doSelect();
	public abstract void doPayment();
	public final void giftWrap() {
		try {
			System.out.println("Gift wrap successful");
		} catch (Exception e) {
			System.out.println("Gift wrap failed");
		}
	}
	
	public abstract void doDelivery();
	
	public final void processOrder(boolean isGift) {
		// The algorithm skeleton (the process steps)
		doSelect();
		doPayment();
		if(isGift) {
			giftWrap();
		}
		doDelivery();
	}

}
