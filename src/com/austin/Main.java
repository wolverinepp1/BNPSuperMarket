package com.austin;

public class Main
{

	public static void main(String[] args)
	{
		System.out.println("****************Welcome to BNP Fruits' Supermarket****************\n");
		InputScanner is = new InputScanner();
		is.setAmount();
		Basket basket = new Basket(is.getAppleAmount(), is.getOrangeAmount(), is.getWatermelonAmount());
		double totalPrice = basket.sumPrice();
		System.out.println("\nYou have " + basket.getAppleAmount() + " apple(s) " +
										   basket.getOrangeAmount() + " " + "orange(s) " +
										   basket.getWaterMelonAmount() + " watermelon(s) in your basket");
		System.out.println("Your basket checkout is: " + totalPrice + "£");
		System.out.println("\n****************See you next time****************");
	}

}
