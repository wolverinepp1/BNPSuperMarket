package com.austin;

import java.util.Scanner;

public class InputScanner
{
	private Scanner in;

	private int appleAmount;

	private int orangeAmount;

	private int watermelonAmount;

	public int getAppleAmount()
	{
		return appleAmount;
	}

	public int getOrangeAmount()
	{
		return orangeAmount;
	}

	public int getWatermelonAmount()
	{
		return watermelonAmount;
	}

	public InputScanner()
	{
		this.in = new Scanner(System.in);
	}

	public void setAmount()
	{
		appleAmount = 0;
		orangeAmount = 0;
		watermelonAmount = 0;

		System.out.println("How many apple(s) do you want to buy:");
		while (!in.hasNextInt())
		{
			System.out.println("Please type a number:");
			in.next();
		}
		appleAmount = in.nextInt();

		System.out.println("How many orange(s) do you want to buy:");
		while (!in.hasNextInt())
		{
			System.out.println("Please type a number:");
			in.next();
		}
		orangeAmount = in.nextInt();

		System.out.println("How many watermelon(s) do you want to buy:");
		while (!in.hasNextInt())
		{
			System.out.println("Please type a number:");
			in.next();
		}
		watermelonAmount = in.nextInt();
	}
}
